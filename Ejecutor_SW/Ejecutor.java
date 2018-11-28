package	ejecutor.agentes;

import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.core.Agent;
import jade.core.AID;
import jade.domain.FIPANames.InteractionProtocol;
import jade.proto.AchieveREInitiator;
import jade.proto.AchieveREResponder;
import ejecutor.interfaces.Ejecutor_SW;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.MessageTemplate;
import jade.lang.acl.ACLMessage;
import java.util.*;

//Librerias necesarias para la ejecucion de servicios Web
import java.net.URI;
import org.mindswap.owl.OWLClass;
import org.mindswap.owl.OWLDataProperty;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owl.OWLObjectProperty;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.AtomicProcess;
import org.mindswap.owls.process.Process;
import org.mindswap.owls.process.execution.ProcessExecutionEngine;
import org.mindswap.owls.process.execution.ProcessExecutionListener;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;
import org.mindswap.query.ValueMap;
import org.mindswap.utils.Utils;
import org.mindswap.wsdl.WSDLOperation;
import org.mindswap.wsdl.WSDLService;

/**
 *Este agente realiza el proceso de ejecución de los servicios web que se le sean requeridos.  Este agente recibe la 
 *información validada por parte del agente controlador y procede a realizar el proceso de jecución propiamente dicho.
 *Este agente y su funcionamiento esta ampliamente relacionado con el contenido en concreto de la especificación del 
 *servicio en OWL-S, debido a que de apoya en el service grounding para realizar la ejecución del servicio y se pone en
 *conocimiento de todas las especificaciones de la información que se le debe suministrar al servicio y que tipo de 
 *información será retornada. Dicha información será enviada de regreso al agente Usuario para que sea visualizada por 
 *el agente usuario.  Aunque la parte de apoyo más fuerte para la ejecución es el service grounding, todas las demás 
 *secciones de la especificación OWL-S del servicio son significativas y relevantes según los procesos que se realicen 
 *con los servicios web.
 *  
 *@author ALBER ANDRES LEDESMA CASTILLO
 */

public class Ejecutor extends Agent{
	
	//referencias a los agentes de interfaz necesarios para iniciar la interaccion de entrega de resultados
	AID interfaces[];
		
	//Referencia al vector que contiene los resultados de la ejecucion del servicio web
	Vector resultados;

	//Referencia a la tabla hash que tiene los valores de entrada
	Hashtable entrada;

	//Variables para la ejecucion de servicios Web
	Service service;
	Profile profile;
	Process process;
	WSDLService s;
	WSDLOperation op;
	String inValue;
	String outValue;
	ValueMap values;
	ProcessExecutionEngine exec;

/**
 *Este metodo se encarga de inicializar el motor de ejecucion
 */
 
 	public void iniciacionMotor(){
 		//Se crea un motor de ejecucion
		exec = OWLSFactory.createExecutionEngine();		
 	}
			
/**
 *Este metodo es el encargado de ejecutar el servicio Web
 *@param entrada tabla hash con las entradas necesarias para ejecutar el servicio Web
 *@exception Exception esta excepcion se lanza fundamentalmente cuando no se puede parsear el Servicio Web, posiblemente
 *por que la direccion sea incorrecta
 */
	public void ejecutarServicio(Hashtable entradas)throws Exception{
		
		System.out.println("Dentro de Ejecutar");
		
		//Cadena auxiliar para la recuperacion de datos de entrada
		String aux = new String();
		
		//Se crea la maquinaria de ejecucion de servicios
		OWLKnowledgeBase kb = OWLFactory.createKB();
		
		//Se obtiene la direccion del servicio
		aux = (String) entrada.get(new String("servicio"));
		
	   	service = kb.readService(aux);
		process = service.getProcess();
		
		// Se inicializa la estructura para los datos de entrada
		values = new ValueMap();
		
		//Se recuperan las entradas dadas por el usuario
		Vector v = (Vector) entrada.get(new String("entradas"));
		
		//Se ve si el servicio trabaja con alguna ontologia
		aux = (String) entrada.get(new String("ontologia"));
		
		
		//Si no se introdujo ontologia
		if(aux.equals("")){
			
			System.out.println("no hay Ontologia");
			
			//Se añaden las entradas al servicio Web
			for(int i=0;i<v.size();i+=2){
				values.setDataValue(process.getInput((String)v.elementAt(i)), (String)v.elementAt(i+1));
				System.out.print("Entrada = ");
				System.out.println((String)v.elementAt(i));		
				System.out.print("Valor = ");
				System.out.println((String)v.elementAt(i+1));
			}
			
			values = exec.execute(process, values);	
	
			// get the result
			OWLIndividual out = values.getIndividualValue(process.getOutput());
				
			// display the results
			System.out.println("Executed service '" + service + "'");
			resultados.addElement(new String("Executed service '" + service.toString() + "'"));
			System.out.println("Grounding WSDL: " + 
			    ((AtomicProcess) process).getGrounding().getDescriptionURL());
			resultados.addElement(new String("Grounding WSDL: " + 
			    (((AtomicProcess) process).getGrounding().getDescriptionURL()).toString()));   
			System.out.println("Output = ");
			resultados.addElement(new String("Salida = "));
			System.out.println(Utils.formatRDF(out.toRDF()));
			resultados.addElement(new String((Utils.formatRDF(out.toRDF())).toString()));
			System.out.println();
			resultados.addElement(new String("\n"));
		}else{
			
			System.out.println("hay Ontologia");
				
			//Se crea la variable ontologia
			String currencyOnt = aux;
			// se obtienen los parametros de entrada
			for(int i=0;i<v.size();i+=4){
				values.setDataValue(process.getInput((String)v.elementAt(i)), (String)v.elementAt(i+1));				
				values.setValue(process.getInput((String)v.elementAt(i+2)), 
			    kb.getIndividual(URI.create(currencyOnt + (String)v.elementAt(i+3))));
			}
			
			values = exec.execute(process, values);
		
			// Se obtiene el valor de salida	
			OWLIndividual out = values.getIndividualValue(process.getOutput());
		
			// Se entregan los resultados
			System.out.println("Executed service " + service);
			resultados.addElement(new String("Executed service " + service.toString()));
			System.out.println("Salida = ");
			resultados.addElement(new String("Salida = "));
			System.out.println(Utils.formatRDF(out.toRDF()));
			resultados.addElement(new String((Utils.formatRDF(out.toRDF())).toString()));		
			System.out.println();
			resultados.addElement(new String("\n"));
		}
		//Se finaliza el motor de ejecucion
		exec = null;	
	}
	
/**
 *retorna los resultados al agente que los solicite.
 *@return el vector con los resultados de la ejecucion
 */	
	public Vector EntregarDatos(){
		return resultados;	
	}

/**
 *En esta conversación el agente Ejecutor entrega los resultados de la ejecución al agente Usuario
 */
	class EntregarResultados extends AchieveREInitiator{
	
		public EntregarResultados(Agent a, ACLMessage msg){
			super(a,msg);
		}
		
		protected void handleAgree(ACLMessage agree){
			System.out.println(agree.getContent());
		}
		
		protected void handleNotUnderstood(ACLMessage notunderstood){
			System.out.println(notunderstood.getContent());
		}
		
		protected void handleRefuse(ACLMessage refuse){
			System.out.println(refuse.getContent());
		}
					
		protected void handleFailure(ACLMessage failure){
			System.out.println(failure.getContent());
		}	
		
		protected void handleInform(ACLMessage inform){
			System.out.println(inform.getContent());
		}
	}

/**
 *Esta conversacion obedece a una peticion de ejecucion de servicio por parte del agente controlador
 */
 	class EjecutarServicio extends AchieveREResponder{
	
		public EjecutarServicio(Agent a,MessageTemplate mt){
			super(a,mt);
		}
		
		protected ACLMessage prepareResponse(ACLMessage request){
			
			//Se crea el mensaje de respuesta
			ACLMessage informDone = request.createReply();
			
			informDone.setPerformative(ACLMessage.AGREE);
			//Se recupera la entrada
			try{
				entrada = (Hashtable) request.getContentObject();	
			}catch(Exception ex){}	
			
			informDone.setContent("Se han recuperado los datos. Comienza el proceso de ejecucion del servicio");
			
			//Se inicia el motor de ejecucion
			iniciacionMotor();
				
			return informDone;		
		}
		
		protected ACLMessage prepareResultNotification(ACLMessage request, ACLMessage response){
			
			ACLMessage informDone = request.createReply();
			
			try{
				ejecutarServicio(entrada);
				
				//Se inicia la interaccion para la ejecucion del servicio
				ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
				//Se añaden los destinatarios
				for(int i=0;i<interfaces.length;i++)
					msg.addReceiver(interfaces[i]);	
				//Se añade el contenido que es la informacion del usuario, esta informacion se serializa	
				try{
					//Se añade el resultado de la ejecucion
					msg.setContentObject(resultados);
				}catch(java.io.IOException ioex){}
			
				//Se añade el subcomportamiento	
				myAgent.addBehaviour(new EntregarResultados(myAgent,msg));
				
				informDone.setPerformative(ACLMessage.INFORM);
				
				informDone.setContent("Se ha ejecutado el servicio");
				
			}catch(Exception ex){

				//Se inicia la interaccion para la ejecucion del servicio
				ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
				//Se añaden los destinatarios	
				for(int i=0;i<interfaces.length;i++)
					msg.addReceiver(interfaces[i]);	
				//Se añade el contenido que es la informacion del usuario, esta informacion se serializa	
				try{
					resultados.addElement(new String("Hubo un error en la ejecucion del servicio " + ex));
					msg.setContentObject(resultados);
				}catch(java.io.IOException ioex){}
				//Se añade el subcomportamiento	
				myAgent.addBehaviour(new EntregarResultados(myAgent,msg));
					
				informDone.setPerformative(ACLMessage.FAILURE);
				
				informDone.setContent("Hubo un error en la ejecucion del servicio");
				
			}
			
			return informDone;		
		}
			
	}
	
	/**
	 *En este metodo se configura el agente Controlador, se incializan algunas de sus variables, se registra en el 
	 *sistema como agente con servicio "controlador" y se buscan los AID de los agentes ejecutores para posteriores 
	 *interacciones
	 */
	
	protected void setup(){
		
		//Registro del Agente en el sistema
		DFAgentDescription dfd = new DFAgentDescription();
		dfd.setName(getAID());
		ServiceDescription sd = new ServiceDescription();
		sd.setType("ejecutor");
		sd.setName("ejecutor_sistema");
		dfd.addServices(sd);
		try{
			DFService.register(this,dfd);	
		}catch(FIPAException fipaex){System.out.println("No se puede registrar el servicion del agente");}
		
		//Se buscan los agentes ejecutores en el sistema
		DFAgentDescription template = new DFAgentDescription();
		ServiceDescription sd1 = new ServiceDescription();
		sd1.setType("interfaz");
		template.addServices(sd1);
		try{
			DFAgentDescription result[] = DFService.search(this,template);
			interfaces = new AID[result.length];
			for(int i=0;i<interfaces.length;i++)
				interfaces[i] = result[i].getName();
			System.out.println("Se ha encontrado " + result.length + " Agentes Interfaz");
		}catch(Exception ex){}
		
		//Se inicializa la variable resultado y valores de entrada
		resultados = new Vector();
		entrada = new Hashtable();
		 
		//Se añade el comportamiento base de este agente
		addBehaviour(new EjecutarServicio(this,MessageTemplate.MatchPerformative(ACLMessage.REQUEST)));
	}

	/**
	*En este metodo se desregistra el agente del sistema y se da un mensaje de despedida
	*/
	 
	protected void takeDown(){
		
		try{
			DFService.deregister(this);
		}catch(FIPAException fpex){System.out.println("No se puede sacar el agente del regisro");}

		System.out.println(getAID().getName() + " Abandonando la plataforma");
		
	}
	
}
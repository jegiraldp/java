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
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.MessageTemplate;
import jade.lang.acl.ACLMessage;
import ejecutor.interfaces.Ejecutor_SW;
import ejecutor.interfaces.Terminos;
import java.util.*;

/**
 *Este agente representa la interfaz con la cual interactúan los actores humanos para ingresar la información necesaria 
 *para que el sistema realice todos los procesos vinculados con la ejecución de los servicios web.  De la misma manera,
 *este agente estara encargado de recibir los resultados de las ejecucuciones y de la solicitud de unfomacion adicional
 *por parte de los servicios web (valores de parámetros adicionales se solicitan durante la ejecución, esta situación 
 *se presenta comúnmente cuando se trabajan sevicios compuestos).
 *
 *@author ALBER ANDRES LEDESMA CASTILLO
 */

public class Usuario extends GuiAgent implements Terminos{

	//Referencia a la interfaz grafica de usuario
	private Ejecutor_SW migui;
	
	//Referencia a las direcciones de los agentes controladores en el sistema
	AID controladores[]; 
	
/**
*El agente mediante este metodo captura los datos que el usuario ha introducido en la interfaz en el momento que
*decide ejecutar el servicio Web
*las claves son:
*para la direccion del Servicio Web : servicio
*para la direccion de la Ontologia : ontologia
*para las entradas: entradas 
*@return Hashtable con los datos que estaban en la interface
*/
	public Hashtable capturarDatos(){
		Hashtable inputs = new Hashtable();
		//Se empiezan a recuperar los datos de la interfaz
		String in = new String();
		in = "peticion de ejecucion";
		inputs.put(new String("peticion"),in);
		in = migui.getServicio();
		inputs.put(new String("servicio"),in);
		in = migui.getOntologia();
		inputs.put(new String("ontologia"),in);
		Vector en = new Vector();
		en = migui.getEntradas();
		inputs.put(new String("entradas"),en);	
		//Se retorna la tabla hash obtenida
		return inputs;
	}
	
/**
 *El agente mediante este metodo entrega los resultados de la ejecucion en la interfaz de usuario
 *@param resultados Un vector con los resultados que se imprimen en el orden en que se recuperan
 */	
	public void mostrarResultado(Vector resultados){
		String str = new String();
		for(int i=0;i<resultados.size();i++){
			str += (String)resultados.elementAt(i);
			str += "\n";
		}
		migui.setResultado(str);
	}

/**
 *El agente mediante este metodo entrega los resultados de la ejecucion en la interfaz de usuario
 *@param resultados Un string con los resultados que se imprimen en el orden en que se recuperan
 */	
	public void mostrarResultado(String resultados){
		migui.setResultado(resultados);
		migui.setResultado("\n");
	}

/**
 *Mediante esta interaccion el agente usuario pide al agente controlador que le valide y si es posible que le ponga en
 *marcha la ejecucion del servicio dicho
 */

	public class PeticionEjecucion extends AchieveREInitiator{
	
		public PeticionEjecucion(Agent a, ACLMessage msg){
			super(a,msg);
		}
		
		protected void handleAgree(ACLMessage agree){			
			mostrarResultado("Se ha aceptado la peticion: ");
			//Se recupera los datos enviados por el agente Controlador
			String respuesta = agree.getContent();
			mostrarResultado(respuesta);
			mostrarResultado("");
		}
		
		protected void handleNotUnderstood(ACLMessage notunderstood){
			mostrarResultado("El agente controlador no ha entendido la peticion:");
			//Se recupera los datos enviados por el agente Controlador
			String respuesta = notunderstood.getContent();
			mostrarResultado(respuesta);
			mostrarResultado("");
		}
		
		protected void handleRefuse(ACLMessage refuse){
			mostrarResultado("El agente controlador ha rechazado la peticion:");
			//Se recupera los datos enviados por el agente Controlador
			Vector respuesta = new Vector();
			try{
				respuesta = (Vector) refuse.getContentObject();
			}catch(Exception ex){}
			mostrarResultado(respuesta);
			mostrarResultado("");
		}
					
		protected void handleFailure(ACLMessage failure){
			mostrarResultado("Ha habido un fallo.Se entrega las siguientes causas:");
			//Se recupera los datos enviados por el agente Controlador
			Vector respuesta = new Vector();
			try{
				respuesta = (Vector) failure.getContentObject();
			}catch(Exception ex){}
			mostrarResultado(respuesta);
			mostrarResultado("\n");
		}	
		
		protected void handleInform(ACLMessage inform){
			mostrarResultado("Se entrega el siguiente informe:");
			//Se recupera los datos enviados por el agente Controlador
			Vector respuesta = new Vector();
			try{
				respuesta = (Vector) inform.getContentObject();
			}catch(Exception ex){}
			mostrarResultado(respuesta);
			mostrarResultado("\n");
		}
	}

	/**
	 *Comportamiento que permite atender una interaccion entrega de resultados de ejecucion de los servicios 
	 */
	 
	public class EntregarResultados extends AchieveREResponder{
	
		public EntregarResultados(Agent a,MessageTemplate mt){
			super(a,mt);
		}
		
		/**
		 *En este punto es el que se recuperan los valores dados por el agente de ejecucion respecto a los resultados
		 *del Servicio Web
		 */
		
		protected ACLMessage prepareResponse(ACLMessage request){
			
			ACLMessage informDone = request.createReply();
			
			informDone.setPerformative(ACLMessage.AGREE);
			
			//Se recupera los datos enviados por el agente Controlador
			Vector respuesta = new Vector();
			try{
				respuesta = (Vector) request.getContentObject();
			}catch(Exception ex){}
			mostrarResultado(respuesta);
			mostrarResultado("");
			
			informDone.setContent("Se acepta la interaccion de recepcion de datos");
			
			return informDone;		
		}
		
		protected ACLMessage prepareResultNotification(ACLMessage request, ACLMessage response){
			
			ACLMessage informDone = request.createReply();
			
			informDone.setContent("Se han mostrado los datos en la interface");
			
			informDone.setPerformative(ACLMessage.INFORM);
			
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
		sd.setType("interfaz");
		sd.setName("interfaz_sistema");
		dfd.addServices(sd);
		try{
			DFService.register(this,dfd);	
		}catch(FIPAException fipaex){System.out.println("No se puede registrar el servicion del agente");}
		
		//Se buscan los agentes controladores en el sistema
		DFAgentDescription template = new DFAgentDescription();
		ServiceDescription sd1 = new ServiceDescription();
		sd1.setType("controlador");
		template.addServices(sd1);
		try{
			DFAgentDescription result[] = DFService.search(this,template);
			controladores = new AID[result.length];
			for(int i=0;i<controladores.length;i++)
				controladores[i] = result[i].getName();
			System.out.println("Se ha encontrado " + result.length + " Agentes Controladores");
		}catch(Exception ex){}
				
		//Se construye la interfaz pasando como referencia el agente
		migui = new Ejecutor_SW(this);
		migui.setSize(410,440);
		migui.setTitle("Sistema Multiagente Ejecutor de Servicios Web");
		migui.setVisible(true);
		
	}
	
	/**
	 *Desde este metodo se atiende los eventos que se generan en la interfaz grafica
	 */
	
	protected void onGuiEvent(GuiEvent gevent){
	
		//Se obtiene el evento generado
		char comando = (char) gevent.getType();
		
		switch(comando){
			case EJECUTAR:
				System.out.println("peticion de ejecucion de Servicio");
				
				//Se inicia la peticion de ejecucion de servicio
				ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
				//Se añaden los destinatarios
				for(int i=0;i<controladores.length;i++)
					msg.addReceiver(controladores[i]);	
				//Se añade el contenido que es la informacion del usuario, esta informacion se serializa	
				try{
					msg.setContentObject(capturarDatos());
				}catch(java.io.IOException ioex){}
				addBehaviour(new PeticionEjecucion(this,msg));
				
				//Ahora se esperan los resultados de la ejecucion
				MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.REQUEST);
				addBehaviour(new EntregarResultados(this,mt));
			break;
			default:
				System.out.println("Comando no entendido");
			break;
		}
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
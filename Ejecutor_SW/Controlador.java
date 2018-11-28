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
import jade.core.behaviours.SequentialBehaviour;
import jade.lang.acl.MessageTemplate;
import jade.lang.acl.ACLMessage;
import java.util.*;

/**
 *Es el agente encargado de realizar la intermediación entre el agente Usuario y el agente ejecutor, se ocupa de 
 *validación de los datos dados por el usuario en la interfaz
 *
 *@author ALBER ANDRES LEDESMA CASTILLO
 */

public class Controlador extends Agent{
	
	//Direccion del servicio Web dada por el agente Usuario
	String dir;
	
	//tabla Hash con los valores ingresados por el usuario en la interfaz
	Hashtable entrada;
	
	//Direccion de la ontologia que usa el servicio, esta es opcional
	String ont;
	
	//Referencia a las direcciones de los agentes controladores en el sistema
	AID ejecutores[]; 
	
/**
 *retorna los datos ingresados por el usuario al agente que los solicite.  En este caso es el agente ejecutor.
 *@return tabla Hash con los campos correspondientes a las entradas dadas por el Usuario
 */	
	public Hashtable entregarDatos(){
		return entrada;	
	}

/**
 *Este metodo se encarga de verificar el formato de datos de entrada, en caso de ser correcto se almacena un nuevo vector
 *de datos de entrada que sea entendible por el agente ejecutor
 *@param v  Vector de datos de entrada al cual se le verificara el formato
 */
	public boolean formatoEntrada(Vector v){
		
		Vector vaux = new Vector();
		String saux = new String();
		String in = new String();
		String val = new String();
		boolean result = false;
		
		for(int i=0;i<v.size();i++){
			saux = (String) v.elementAt(i);
			saux = saux.trim();
			in = saux.substring(0,(saux.lastIndexOf(":")));
			val = saux.substring((saux.indexOf(":"))+1);
			System.out.println("Entrada = " + in + " Valor = " + val);
			//Si alguna de las cadenas es vacia es que hubo un error en la entrada de datos
			if(in.equals("") || val.equals("")){
				System.out.println("formato no valido");
				result = false;
				break;
			}else{
				//Se guarda el dato valido en el vector auxiliar
				System.out.println("formato valido");
				vaux.addElement(in);
				vaux.addElement(val);
				result = true;
			}
		}
		
		for(int i=0;i<vaux.size();i+=2){
			System.out.print("Entrada = ");
			System.out.println((String)vaux.elementAt(i));		
			System.out.print("Valor = ");
			System.out.println((String)vaux.elementAt(i+1));
		}
		
		//Si hubo una correcta ejecucion se guardan las entradas
		if(result)
			entrada.put("entradas",vaux);
			
		return result;
		
	}
	
/**
 *Este comportamiento permite responder las peticiones de ejecucion de servicio, se encarga de verificar si la direccion
 *tiene formato valido, por ejemplo que termine en OWL y que las entradas tengan el formato valido
 */

	public class PeticionEjecucion extends AchieveREResponder{
	
		public PeticionEjecucion(Agent a,MessageTemplate mt){
			super(a,mt);
		}
		
		/**
		 *Se atiende la peticion si esta es una tabla hash que tiene para la entrada peticion el valor peticion de ejecucion
		 */
		
		protected ACLMessage prepareResponse(ACLMessage request){
			
			ACLMessage informDone = request.createReply();
			
			try{
				entrada = (Hashtable) request.getContentObject();
			}catch(Exception ex){}
			
			String p = (String) entrada.get(new String("peticion"));
			
			if(p.equals("peticion de ejecucion")){
				informDone.setPerformative(ACLMessage.AGREE);
				informDone.setContent("Inicio proceso de Validacion");
			}else{
				informDone.setPerformative(ACLMessage.NOT_UNDERSTOOD);
				informDone.setContent("No se ha entendido la peticion");			
			}
			return informDone;
		}
	
		/**
		 *En esta parte se verifica que los datos ingresados cumplan unos requisitos minimos de formato como que la 
		 *direccion del servicio comience con http:// y termine en .owl, asi tambien que las entradas tengan el formato
		 *entrada:valor
		 */
		
		protected ACLMessage prepareResultNotification(ACLMessage request, ACLMessage response){
			
			//En este vector se almacena los mensajes de respuesta
			Vector respuesta = new Vector();
			//Cadena auxiliar para ir guardando mensajes
			String aux = new String();
			
			//Se crea el mensaje de respuesta
			ACLMessage informDone = request.createReply();
			
			//Se recupera el valor del mensaje se debe de recoradar que este esta serializado
			try{
				entrada = (Hashtable) request.getContentObject();
			}catch(jade.lang.acl.UnreadableException uex){}
			
			String direccion = (String) entrada.get(new String("servicio"));
						
			//Se eliminan los espacios en blanco a los lados del string
			direccion = direccion.trim();
			
			//Este booleano para saber si las entradas si cumplen con el formato de datos de entrada entrada:valor
			boolean estadoInputs = true;
			
			//Se ve si el usuario ha ingresado entradas
			Vector v = new Vector();
			v = (Vector) entrada.get(new String("entradas"));
			if(v.isEmpty()){
				respuesta.addElement(new String("El servicio no usa entradas?"));
			}else{
				//se verifica el formato de las entradas y se prepara para el formato de salida
				estadoInputs = formatoEntrada(v); 	
			}
			
			if((direccion.endsWith(".owl")) && (direccion.startsWith("http://")) && estadoInputs){
				//Se almacena la direccion como un atributo de la clase
				dir = direccion;
				//Se crea la respuesta
				informDone.setPerformative(ACLMessage.INFORM);
				//Se añade notificacion de extension valida
				respuesta.addElement(new String("Extension de archivo valida"));
				//Se verifica si el servicio usa ontologia
				ont = (String) entrada.get(new String("ontologia"));
				if( ont .equals("") ){
					respuesta.addElement(new String("El servicio no usa ontologia?"));
				}
				respuesta.addElement(new String("A continuacion se comenzara la ejecucion del servicio"));
				
				//Se inicia la interaccion para la ejecucion del servicio
				ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
				//Se añaden los destinatarios
				for(int i=0;i<ejecutores.length;i++)
					msg.addReceiver(ejecutores[i]);	
				//Se añade el contenido que es la informacion del usuario, esta informacion se serializa	
				try{
					msg.setContentObject(entregarDatos());
				}catch(java.io.IOException ioex){}
		
				//Se añade el subcomportamiento	
				myAgent.addBehaviour(new EjecutarServicio(myAgent,msg));
				
			}else{
				informDone.setPerformative(ACLMessage.FAILURE);
				respuesta.addElement(new String("Extension de archivo no valida o datos de entrada mal formateados"));
			}
			
			try{
				informDone.setContentObject(respuesta);
			}catch(java.io.IOException ioex){}
			
			return informDone;			
		}
	}

/**
 *En esta conversación el agente controlador solicita la ejecución del servicio web al agente ejecutor. 
 *El agente controlador entrega los datos validados al ejecutor. Los resultados de la ejecucion no son entregados al 
 *final de esta interaccion al agente controlador sino que se inicia una nueva interaccion entre el agente Ejecutor y
 *el agente Usuario para que se muestren los resultados en la interfaz
 */
	public class EjecutarServicio extends AchieveREInitiator{
	
		public EjecutarServicio(Agent a, ACLMessage msg){
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
			
		protected void handleInform(ACLMessage inform){
			
			System.out.println("Se obtiene el siguinte resultado: " + inform.getContent());
			
		}
				
		protected void handleFailure(ACLMessage failure){
			
			System.out.println("El ejecutor entrega las siguientes causas de fallo: " + failure.getContent());
			
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
		sd.setType("controlador");
		sd.setName("controlador_sistema");
		dfd.addServices(sd);
		try{
			DFService.register(this,dfd);	
		}catch(FIPAException fipaex){System.out.println("No se puede registrar el servicion del agente");}
		
		//Se buscan los agentes ejecutores en el sistema
		DFAgentDescription template = new DFAgentDescription();
		ServiceDescription sd1 = new ServiceDescription();
		sd1.setType("ejecutor");
		template.addServices(sd1);
		try{
			DFAgentDescription result[] = DFService.search(this,template);
			ejecutores = new AID[result.length];
			for(int i=0;i<ejecutores.length;i++)
				ejecutores[i] = result[i].getName();
			System.out.println("Se ha encontrado " + result.length + " Agentes Ejecutores");
		}catch(Exception ex){}
		
		//En esta tabla hash se almacena el contenido del mensaje recuperado
		entrada = new Hashtable();
		
		//Se añade el comportamiento base de este agente
		addBehaviour(new PeticionEjecucion(this,MessageTemplate.MatchPerformative(ACLMessage.REQUEST)));
				
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
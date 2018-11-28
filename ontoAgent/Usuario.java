

import jade.core.Agent;
import jade.core.AID;

import java.util.*;
import java.io.*;

import jade.lang.acl.*;
import jade.core.behaviours.*;
import jade.domain.FIPANames.InteractionProtocol;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;


import jade.content.*;
import jade.content.lang.*;
import jade.content.lang.sl.*;
import jade.content.onto.*;

import conexionOntology.Ontologia;
import conexionOntology.Url;
import conexionOntology.ConexionA;


public class Usuario extends Agent{

	ACLMessage informPath;
	private Codec codec = new SLCodec();
    private Ontology ontologia = Ontologia.getInstance();
    private ConexionA con = new ConexionA();
	private Url url = new Url();
		
	protected void setup() { 
		
		getContentManager().registerLanguage(codec);
		getContentManager().registerOntology(ontologia);
		//Se registra el agente Usuario
		AID iden = new AID("Usuario",AID.ISLOCALNAME);
		DFAgentDescription dfd = new DFAgentDescription();
		dfd.setName(getAID());
		ServiceDescription sd = new ServiceDescription();
		sd.setType("agente");
		sd.setName("Usuario");
		dfd.addServices(sd);
		try{
			DFService.register(this,dfd);	
		}catch(FIPAException fipaex){
			System.out.println("No se puede registrar el servicion del agente");
			}
			
		addBehaviour(new mensajeA2());
			
	  }//FIN SETUP
		
		// esta clase es para enviar el mensaje 
		public class mensajeA2 extends SimpleBehaviour{
    	
    		
   		 	private boolean done = false;
			public void action(){
			
			try {
				
			String q;
	    	System.out.println("Digite n" + " ");
       		BufferedReader y = new BufferedReader (new InputStreamReader(System.in)); 
	    	q = y.readLine();
	  
	    	int numero = Integer.parseInt(q);
	    	if (numero == 4){
	    	
				
			informPath = new ACLMessage(ACLMessage.INFORM);
			informPath.addReceiver(new AID ("Usuario2", AID.ISLOCALNAME));
			informPath.setLanguage(codec.getName());
			informPath.setOntology(ontologia.getName());
            
            Url url = new Url();
        	url.setIp("192.168.4.201");
        	url.setPuerto(5004);
        	
        	con.setUrl(url);


            getContentManager().fillContent(informPath, con);
        	
        	send(informPath);
            //System.out.println("Hola Agente 2");
            done = true;
            }
         }  
	   	
	   	catch (java.io.IOException io)
			{System.out.println(io);
		}
		catch (jade.content.lang.Codec.CodecException ce) {
	   		System.out.println(ce);
		}
		catch (jade.content.onto.OntologyException oe) {
			System.out.println(oe);
		}

		}	//action fin
		
			public boolean done(){
			
			return done;}//fin done
	
		}// fin mensajeA2
		
	}	 
	
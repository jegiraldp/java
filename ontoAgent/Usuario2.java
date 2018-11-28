
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


public class Usuario2 extends Agent{

	String ip;
	ACLMessage informIP_port;
	private Codec codec = new SLCodec();
    private Ontology ontologia = Ontologia.getInstance();
    
    private ConexionA con = new ConexionA();
	private Url url = new Url();
		
	
		
	protected void setup() { 
		
		getContentManager().registerLanguage(codec);
		getContentManager().registerOntology(ontologia);
		//Se registra el agente Usuario
		AID iden = new AID("Usuario2",AID.ISLOCALNAME);
		DFAgentDescription dfd = new DFAgentDescription();
		dfd.setName(getAID());
		ServiceDescription sd = new ServiceDescription();
		sd.setType("agente");
		sd.setName("Usuario2");
		dfd.addServices(sd);
		try{
			DFService.register(this,dfd);	
		}catch(FIPAException fipaex){
			System.out.println("No se puede registrar el servicion del agente");
			}
			
		addBehaviour(new mensajeA1());
	
			
	  }//FIN SETUP
		
		//responde agente1
		public class mensajeA1 extends SimpleBehaviour{
    	
   		 	private boolean done = false;
   		 	//MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM); 
			MessageTemplate mt = MessageTemplate.and(MessageTemplate.MatchLanguage(codec.getName()), 
			MessageTemplate.MatchOntology(ontologia.getName()));
			public void action(){
			
			ACLMessage msg = receive(mt);

			try {

			if(msg!=null){
    		
    		if(msg.getPerformative()== ACLMessage.INFORM){
    			
    		ContentElement ce = getContentManager().extractContent(msg);
    		
    		if (ce instanceof ConexionA){

    		con = (ConexionA) ce;
			url = con.getUrl();
			System.out.println("Mensaje recibido:");
			System.out.println("IP: " + url.getIp());
			System.out.println("PUERTO: " + url.getPuerto());
			}
    		done = true;
            //addBehaviour(new mensajeA3());
            }
            }//fin if msg!=null
            
            }
	 		catch (jade.content.lang.Codec.CodecException ce) {
	   		System.out.println(ce);
			}
			catch (jade.content.onto.OntologyException oe) {
			System.out.println(oe);
			}

            
            
            
		}//fin action	
		
			public boolean done(){
			return done;}
	
		}//fin comportamiento
		
		
		
		//envia agente3
		public class mensajeA3 extends SimpleBehaviour{
    	
			
			private boolean done = false;
			public void action(){
			
			informIP_port = new ACLMessage(ACLMessage.INFORM);
			//informPath.setProtocol(InteractionProtocol.FIPA_REQUEST);
            informIP_port.setContent(ip);
            informIP_port.addReceiver(new AID ("Usuario3", AID.ISLOCALNAME));
            send(informIP_port);
            System.out.println("Agente 3 conectese a: "+ip);
            done = true;
                       
		}//fin action	
		
			public boolean done(){
			return done;}
	
		}//fin comportamiento
		
		
		
		
	}	 
	
				
		
		
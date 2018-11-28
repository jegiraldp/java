
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


public class Usuario3 extends Agent{

	String ok;
	
		
	protected void setup() { 
		
		
		//Se registra el agente Usuario
		AID iden = new AID("Usuario3",AID.ISLOCALNAME);
		DFAgentDescription dfd = new DFAgentDescription();
		dfd.setName(getAID());
		ServiceDescription sd = new ServiceDescription();
		sd.setType("agente");
		sd.setName("Usuario3");
		dfd.addServices(sd);
		try{
			DFService.register(this,dfd);	
		}catch(FIPAException fipaex){
			System.out.println("No se puede registrar el servicion del agente");
			}
			
	//	addBehaviour(new mensajeA2());
			
	  }//FIN SETUP
		
		//responde agente1
		public class mensajeA2 extends SimpleBehaviour{
    	
   		 	private boolean done = false;
   		 	MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM); 
		
			public void action(){
			
			ACLMessage msg = receive(mt);
	
			if(msg!=null){
    
    		ok = msg.getContent();
    		
    		ACLMessage reply = msg.createReply();
			reply.setPerformative(ACLMessage.AGREE);
			reply.setContent("OK");
			myAgent.send(reply);
		
            System.out.println("Conectadome a :"+ok);
            done = true;
            }
            
		}//fin action	
		
			public boolean done(){
			return done;}
	
		}//fin comportamiento
		
	}//fin agente	 
	
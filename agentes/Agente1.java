import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.*;
import jade.core.Agent;
import jade.core.AID;
import jade.core.behaviours.CyclicBehaviour;

public class Agente1 extends Agent{
		
	protected void setup(){
			
		//Se registra el agente en el sistema
		AID iden = new AID("Impresor",AID.ISLOCALNAME);
		DFAgentDescription dfd = new DFAgentDescription();
		dfd.setName(getAID());
		ServiceDescription sd = new ServiceDescription();
		sd.setType("agente");
		sd.setName("Ejemplo_impresor");
		dfd.addServices(sd);
		try{
			DFService.register(this,dfd);	
		}catch(FIPAException fipaex){System.out.println("No se puede registrar el servicion del agente");}
		//
		
		System.out.println("Hola mundo. Agente " + getAID().getName() + " iniciando la sección.");	
		
		doDelete();
			
	}
		
	protected void takeDown(){
		
		try{
			DFService.deregister(this);
		}catch(FIPAException fpex){System.out.println("No se puede sacar el agente del regisro");}
	
		System.out.println(getAID().getName() + " Abandonando la plataforma");

	}	

}
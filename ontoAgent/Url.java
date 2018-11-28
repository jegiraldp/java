package conexionOntology;

import jade.content.Concept;

public class Url implements Concept {

	private String ip;
	private int puerto;

	public String getIp() {
		return ip;
	}

	public void setIp(String i) {
		ip  = i;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int p) {
		puerto = p;
	}
}

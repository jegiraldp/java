
public class Reserva{
	

	private Object usuario;
	private int tipo;
	private int equipo;
	private int sala;
	

	public Reserva(Object usuario, int tipo, int equipo, int sala) {
		this.usuario = usuario;
		this.tipo = tipo;
		this.equipo = equipo;
		this.sala = sala;
	}
	

	public int getEquipo() {
		return equipo;
	}
	
	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}
	
	public int getSala() {
		return sala;
	}
	
	public void setSala(int sala) {
		this.sala = sala;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public Object getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Object usuario) {
		this.usuario = usuario;
	}

}


public class DocTiempoCompleto extends Docente{
	

	public DocTiempoCompleto(String nombre, String apellido, String documento, String correo){
		super(nombre, apellido, documento, correo);
	}
	

	public String tipoUsuario(){
		return "Docente tiempo completo";
	}
	
	
	public String datos(){
		return "Nombre: " + nombre + ",    Apellido: " + apellido + ",    Documento: " + documento + ",    Correo: " + correo + ",    Tipo de Usuario: " + tipoUsuario();
	}
}

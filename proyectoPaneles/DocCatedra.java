
public class DocCatedra extends Docente{
	
	
	public DocCatedra(String nombre, String apellido, String documento, String correo){
		super(nombre, apellido, documento, correo);
	}
	

	public String tipoUsuario(){
		return "Docente de Catedra";
	}
	

	public String datos(){
		return "Nombre: " + nombre + ",    Apellido: " + apellido + ",    Documento: " + documento + ",    Correo: " + correo + ",    Tipo de Usuario: " + tipoUsuario();
	}
}

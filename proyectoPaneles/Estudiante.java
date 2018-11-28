



public class Estudiante {
	
	
	private String nombre;
	private String apellido;
	private String documento;
	private String carrera;
	private String correo;
	
	
	public Estudiante(String nombre, String apellido, String documento, String carrera, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.carrera = carrera;
		this.correo = correo;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getApellido() {
		return apellido;
	}

	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	public String getCarrera() {
		return carrera;
	}

	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}
	

	public String tipoUsuario(){
		return "Estudiante";
	}
	
	
	public String datos(){
		return "Nombre: " + nombre + ",    Apellido: " + apellido + ",   Documento: " + documento + ",    Carrera: " + carrera + ",    Correo: " + correo;
	}

}

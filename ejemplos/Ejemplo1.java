import javax.xml.parsers.*;

public class Ejemplo1 {
	public static void main(String args[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//Posibles comportamientos que se pueden establecer:
		
		//comprueba si la factoria esta configurada para producir parsers
		//que validen el documento
		System.out.println("isValidating: \t\t\t"+
			factory.isValidating());
		
		//comprueba si los parsers producidos soportaran espacios de nombres
		System.out.println("isNamespaceAware: \t\t"+
			factory.isNamespaceAware());
		
		//comprueba si los parsers producidos por la factoria
		//convertiran bloques CDATA a nodos Text
		System.out.println("isCoalescing: \t\t\t"+
			factory.isCoalescing());
		
		//comprueba si los parsers producidos expandiran las entidades
		System.out.println("isExpandEntityReferences: \t"+
			factory.isExpandEntityReferences());
		
		//comprueba si los parsers producidos ignoraran los comentarios
		System.out.println("isIgnoringComments: \t\t"+
			factory.isIgnoringComments());
		
		//Podemos establecerlos con metodos setXXX()
		factory.setValidating(false);
		System.out.println("validacion establecida a false");
		
		factory.setNamespaceAware(true);
		System.out.println("establecido soporte para espacios de nombres");
		//etc.
		
		try{
			DocumentBuilder documentBuilder = factory.newDocumentBuilder();
			System.out.println("Obtenido DocumentBulider con exito");
		}catch(javax.xml.parsers.ParserConfigurationException e){
			System.err.println("No se ha podido crear una instancia de DocumentBuilder");
		}
	}
}

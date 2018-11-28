import org.w3c.dom.*;
import javax.xml.parsers.*;

public class Ejemplo9 {
	
	public static void main(String args[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try{
			builder = factory.newDocumentBuilder();
		}catch(ParserConfigurationException e){
			System.err.println("No se ha podido crear una instancia de DocumentBuilder");
			return;
		}
		
		DOMImplementation implementation = builder.getDOMImplementation();
		Document document = implementation.createDocument(null, "root", null);
		Element rootElement = document.getDocumentElement();
		Text text = document.createTextNode("Este es un texto muy largo."+
			" Pero que muy largo");
		rootElement.appendChild(text);
		
		NodeList children = rootElement.getChildNodes();
		
		System.out.println("Antes de insertar");
		System.out.println("numero hijos: "+children.getLength());
		
		Element smiley = document.createElement("smiley");
		Text anotherText = text.splitText(27);
		rootElement.appendChild(smiley);
		rootElement.appendChild(anotherText);
		
		System.out.println();
		System.out.println("Despues de insertar");
		System.out.println("numero hijos: "+children.getLength());
	}
	
}

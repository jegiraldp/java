import org.w3c.dom.*;
import javax.xml.parsers.*;

public class Ejemplo4 {
	
	public static void main(String args[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			
			DocumentType docType = implementation.createDocumentType("html",
				"-//W3C//DTD XHTML 1.0 Strict//EN",
				"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");
			Document document =
				implementation.createDocument("http://www.w3c.org/1999/xhtml",
				"html", docType);
		}catch(ParserConfigurationException e){
			System.err.println("No se ha podido crear una instancia de DocumentBuilder");
		}
	}
	
}

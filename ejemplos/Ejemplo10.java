import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class Ejemplo10 {
	
	public static void main(String args[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			
			Document document = implementation.createDocument(null, "html", null);
			Element body = document.createElement("body");
			Element para = document.createElement("p");
			Text text = document.createTextNode("Esto es un parrafo");
			document.getDocumentElement().appendChild(body);
			body.appendChild(para);
			para.appendChild(text);
			
			Source source = new DOMSource(document);
			Result result = new StreamResult(new java.io.File("resultado.xml"));
			Result console= new StreamResult(System.out);
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
			transformer.transform(source, console);
			
		}catch(Exception e){
			System.err.println("Error: "+e);
		}
	}
	
}

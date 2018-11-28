import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

public class Ejemplo5 {
	
	public static void main(String args[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("archivo.html"));
			
			NodeList imagenes = document.getElementsByTagName("img");
			
			for(int i=0; i<imagenes.getLength(); i++){
				//obviamente la lista solo contendra elementos
				Element e = (Element)imagenes.item(i);
				//hacer algo aqui...
				//en este caso imprimimos el atributo 'src'
				System.out.println(e.getAttribute("src"));
			}
		}catch(ParserConfigurationException e){
			System.err.println("No se ha podido crear una instancia de DocumentBuilder");
		}catch(SAXException e){
			System.err.println("Error SAX al parsear el archivo");
		}catch(IOException e){
			System.err.println("Se ha producido un error de entrada salida");
		}
	}
	
}

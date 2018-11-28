import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

public class Ejemplo6 {

	public static void print(String s, int level){
		for(; level>0; level--)
			System.out.print("\t");
		System.out.println(s);
	}

	public static void listChildren(Node e, int level){
		print("[ "+e.getNodeName()+" ]", level);
		level++;
		
		for(Node node = e.getFirstChild(); node != null; node = node.getNextSibling()){
			listChildren(node, level);
		}
	}
	
	public static void main(String args[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("archivo.html"));
			
			listChildren(document, 0);
		}catch(ParserConfigurationException e){
			System.err.println("No se ha podido crear una instancia de DocumentBuilder");
		}catch(SAXException e){
			System.err.println("Error SAX al parsear el archivo");
			System.err.println(e);
		}catch(IOException e){
			System.err.println("Se ha producido un error de entrada salida");
		}
	}
	
}

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

public class Ejemplo7 {

	public static void print(String s, int level){
		for(; level>0; level--)
			System.out.print("\t");
		System.out.println(s);
	}

	public static void listChildren(Node e, int level){
		//si es un elemento con espacio de nombres asociado...
		if(e instanceof Element && ((Element)e).getLocalName() != null){
			Element el = (Element)e;
			print("[ "+el.getPrefix()+" : "+el.getLocalName()+
				" :: "+el.getNamespaceURI()+" ]", level);
		} else {
			print("[ "+e.getNodeName()+" ]", level);
		}
		level++;
		
		//imprimimos los atributos, notese que a pesar de que
		//la variable 'e' debe ser un Elemento para tener atributos,
		//no necesitamos hacer un cast porque la interfaz Node
		//provee los metodos para obtener los atributos
		if(e.hasAttributes()){
			NamedNodeMap attributes = e.getAttributes();
			int length = attributes.getLength();
			Attr attr = null;
			for(int i=0; i<length; i++){
				attr = (Attr)attributes.item(i);
				print(attr.getNodeName()+"='"+attr.getNodeValue()+"'", level);
			}
		}

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

import org.w3c.dom.*;
import javax.xml.parsers.*;

public class Ejemplo3 {
	
	public static void main(String args[]){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			
			System.out.println("Modulos soportados:");
			System.out.println("Core: \t\t"+
				implementation.hasFeature("Core", "2.0"));
			System.out.println("XML: \t\t"+
				implementation.hasFeature("XML", "2.0"));
			System.out.println("HTML: \t\t"+
				implementation.hasFeature("HTML", "2.0"));
			System.out.println("Views: \t\t"+
				implementation.hasFeature("Views", "2.0"));
			System.out.println("StyleSheets: \t"+
				implementation.hasFeature("StyleSheets", "2.0"));
			System.out.println("CSS: \t\t"+
				implementation.hasFeature("CSS", "2.0"));
			System.out.println("CSS2: \t\t"+
				implementation.hasFeature("CSS2", "2.0"));
			System.out.println("Events: \t"+
				implementation.hasFeature("Events", "2.0"));
			System.out.println("UIEvents: \t"+
				implementation.hasFeature("UIEvents", "2.0"));
			System.out.println("MouseEvents: \t"+
				implementation.hasFeature("MouseEvents", "2.0"));
			System.out.println("MutationEvents: "+
				implementation.hasFeature("MutationEvents", "2.0"));
			System.out.println("HTMLEvents: \t"+
				implementation.hasFeature("HTMLEvents", "2.0"));
			System.out.println("Range: \t\t"+
				implementation.hasFeature("Range", "2.0"));
			System.out.println("Traversal: \t"+
				implementation.hasFeature("Traversal", "2.0"));
			
		}catch(ParserConfigurationException e){
			System.err.println("No se ha podido crear una instancia de DocumentBuilder");
		}
	}
	
}

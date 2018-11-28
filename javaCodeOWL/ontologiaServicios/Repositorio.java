package ontologiaServicios;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Repositorio
* @author ontology bean generator
* @version 2006/09/21, 14:44:04
*/
public class Repositorio implements Concept {

   /**
* Protege name: ruta
   */
   private String ruta;
   public void setRuta(String value) { 
    this.ruta=value;
   }
   public String getRuta() {
     return this.ruta;
   }

}

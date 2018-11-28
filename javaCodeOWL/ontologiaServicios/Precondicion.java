package ontologiaServicios;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Precondicion
* @author ontology bean generator
* @version 2006/09/21, 14:44:04
*/
public class Precondicion implements Concept {

   /**
* Protege name: expresionPre
   */
   private String expresionPre;
   public void setExpresionPre(String value) { 
    this.expresionPre=value;
   }
   public String getExpresionPre() {
     return this.expresionPre;
   }

}

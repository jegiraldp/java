package ontologiaServicios;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Entrada
* @author ontology bean generator
* @version 2006/09/21, 14:44:04
*/
public class Entrada implements Concept {

   /**
* Protege name: idEntrada
   */
   private String idEntrada;
   public void setIdEntrada(String value) { 
    this.idEntrada=value;
   }
   public String getIdEntrada() {
     return this.idEntrada;
   }

   /**
* Protege name: parametrosEntrada
   */
   private String parametrosEntrada;
   public void setParametrosEntrada(String value) { 
    this.parametrosEntrada=value;
   }
   public String getParametrosEntrada() {
     return this.parametrosEntrada;
   }

}

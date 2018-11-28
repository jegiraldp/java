package ontologiaServicios;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Salida
* @author ontology bean generator
* @version 2006/09/21, 14:44:03
*/
public class Salida implements Concept {

   /**
* Protege name: idSalida
   */
   private String idSalida;
   public void setIdSalida(String value) { 
    this.idSalida=value;
   }
   public String getIdSalida() {
     return this.idSalida;
   }

   /**
* Protege name: parametrosSalida
   */
   private String parametrosSalida;
   public void setParametrosSalida(String value) { 
    this.parametrosSalida=value;
   }
   public String getParametrosSalida() {
     return this.parametrosSalida;
   }

}

package ontologiaServicios;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Dominio
* @author ontology bean generator
* @version 2006/09/21, 14:44:03
*/
public class Dominio implements Concept {

   /**
* Protege name: rutaD
   */
   private String rutaD;
   public void setRutaD(String value) { 
    this.rutaD=value;
   }
   public String getRutaD() {
     return this.rutaD;
   }

   /**
* Protege name: id_dominio
   */
   private String id_dominio;
   public void setId_dominio(String value) { 
    this.id_dominio=value;
   }
   public String getId_dominio() {
     return this.id_dominio;
   }

}

package ontologiaServicios;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Servicio
* @author ontology bean generator
* @version 2006/09/21, 14:44:04
*/
public class Servicio implements Concept {

   /**
* Protege name: comentario
   */
   private String comentario;
   public void setComentario(String value) { 
    this.comentario=value;
   }
   public String getComentario() {
     return this.comentario;
   }

   /**
* Protege name: id
   */
   private String id;
   public void setId(String value) { 
    this.id=value;
   }
   public String getId() {
     return this.id;
   }

}

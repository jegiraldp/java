
//import java.io.Serializable;


public class listaEstudiantes /*implements Serializable*/ {
    
    private estudiante primero, auxPrimero, nodoRetorno;

    public listaEstudiantes() {
        this.primero = null;
    }//constructor
    
    public void nuevo(int codigo, int ced, String name){
	primero = new estudiante(codigo, primero, ced, name);	
    }//insertNode
    
    public String printList(){
    	String impri="";
        auxPrimero=primero;
        impri+="\t| Documento |\t| Nombre |\n";
    	while(primero!=null){
            impri+="\t| "+primero.getCedula()+" |\t ";
            impri+="| "+primero.getNombre()+" |\t\n ";
            primero = primero.getEnlace();
    	}//while
    	primero=auxPrimero;
    	return impri;
    }//printList

      public estudiante buscar(int valor){  
     auxPrimero=primero;
     nodoRetorno=null;
    	while(primero!=null){
            //System.out.println(primero.getCodigo()+"-"+primero.getNombre());
            if(valor==primero.getCedula()){
            nodoRetorno=primero;
            }
             primero = primero.getEnlace();
    	}//while
    	primero=auxPrimero;
       return nodoRetorno; 
    }//buscar
    
     public boolean existe(int codigo){  
     auxPrimero=primero;
     boolean rta=false;
    	while(primero!=null){
            //System.out.println(primero.getCodigo()+"-"+primero.getNombre());
            if(codigo==primero.getCodigo()){
            rta=true;
            }
             primero = primero.getEnlace();
    	}//while
    	primero=auxPrimero;
       return rta; 
    }//existe
     
     public void editar(int codigo, String nuevoName){  
     auxPrimero=primero;
     boolean rta=false;
    	while(primero!=null){
            //System.out.println(primero.getCodigo()+"-"+primero.getNombre());
            if(codigo==primero.getCodigo()){
                primero.setNombre(nuevoName);
            }
             primero = primero.getEnlace();
    	}//while
    	primero=auxPrimero;
       
    }//existe
    
}//class

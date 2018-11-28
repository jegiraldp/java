
public class listaEstudiantesGrupo {
    
    private estudiante primero, auxPrimero;

    public listaEstudiantesGrupo() {
        this.primero = null;
    }//constructor
    
    public void nuevo(int value, int ced, String name){
	primero = new estudiante(value,primero, ced, name);	
    }//insertNode
    
    public String printList(){
        String impri="";
    	auxPrimero=primero;
    	while(primero!=null){
            //System.out.println(primero.getCodigo()+"-"+primero.getNombre());
            impri+=primero.getCodigo()+"-"+primero.getNombre()+"\n";
            primero = primero.getEnlace();
    	}//while
    	primero=auxPrimero;
    	return impri;
    }//printList
    
}//class

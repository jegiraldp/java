public class lista {
    nodo primero, auxPrimero;
    
    
     public lista() {
        this.primero = null;
    }//constructor
    
    public void nuevo(int valor){
	primero = new nodo(valor, primero);	
    }//insertNode
    
    public void printList(){
    	String impri="";
        auxPrimero=primero;
    	while(primero!=null){
            System.out.println(primero.getValor());
            primero = primero.getEnlace();
    	}//while
    	primero=auxPrimero;
    	
    }//printList
    
    
    public static void main(String[] arg){
        lista l = new lista();
        l.nuevo(1);
        l.nuevo(2);
        l.nuevo(3);
        l.printList();
    }
    
}

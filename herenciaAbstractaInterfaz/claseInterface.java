public class claseInterface implements interfaceUno{

	
	
	public static void main (String[] arg){
	
	claseInterface obj = new claseInterface();
	System.out.println("suma ="+obj.sumar(4,5));
	System.out.println("resta ="+obj.restar(50,45));
		
		
	}
	
	public int sumar (int a, int b){
	
	return a+b;
		
	}
	
	
	public int restar (int a, int b){
		
	return a-b;	
	}
	
	
}
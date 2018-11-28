public class hijoAbstracta extends abstracta{
	
	public static void main (String[] arg){
	
	hijoAbstracta objeto = new hijoAbstracta();
	int suma=objeto.sumar(4,5);
	int multi=objeto.multiplicar(3,4);
	
	System.out.println("suma = "+suma);
	System.out.println("multiplicación = "+multi);
				
	}
	
	
	int sumar(int a,int b){
		return a+b;
	}
	
	int multiplicar(int a,int b){
		return a*b;
	}
	
}
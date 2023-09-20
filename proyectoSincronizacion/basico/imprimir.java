package sin;

public class imprimir {
	
	static  void contador(String h) throws InterruptedException {
		for (int i = 0; i < 30; i++) {
			System.out.println(h+":"+i);
			Thread.sleep(1000);
		}//
		System.out.println(h+":Finalice....");
	}//

}//class

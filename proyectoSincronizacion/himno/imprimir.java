package himno;

public class imprimir {

	synchronized static void himno(String[] n) throws InterruptedException {
		
		for (int i = 0; i < n.length; i++) {
			Thread.sleep(500);
			System.out.println(n[i]);
		}
		
		
	}

}

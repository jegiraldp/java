package banco;

public class hilo extends Thread{

	public hilo(String n){
		setName(n);
		start();
	}//hilo
	
	public void run(){
		//
		if(Thread.currentThread().getName().equals("c1")){
			for (int i = 0; i < 11; i++) {
				try {
					sleep(800);
					if(!inicio.retirar(100)){
						System.out.println(i+"."+Thread.currentThread().getName()+": No saldo -S:"+inicio.getSaldo());
					}else{
						System.out.println(i+"."+Thread.currentThread().getName()+": Retiro ok -S:"+inicio.getSaldo());
					}
					
				} catch (InterruptedException e) {}
				
			}//for
		}///
		
		//
		if(Thread.currentThread().getName().equals("c2")){
			for (int i = 0; i < 11; i++) {
				try {
					sleep(500);
					if(!inicio.retirar(150)){
						System.out.println(i+"."+Thread.currentThread().getName()+": No saldo -S:"+inicio.getSaldo());
					}else{
						System.out.println(i+"."+Thread.currentThread().getName()+": Retiro ok -S:"+inicio.getSaldo());
					}
				} catch (InterruptedException e) {}
				
			}//for
		}///
		
		if(Thread.currentThread().getName().equals("gobierno")){
			for (int i = 0; i < 2; i++) {
				try {
					sleep(3500);
					inicio.consignar(500);
					System.out.println(i+".Gobierno ok -S:"+inicio.getSaldo());
				} catch (InterruptedException e) {}
				
			}//for
		}///
		
		
		if(Thread.currentThread().getName().equals("monitor")){
			try {
			sleep(2);
			for (int i = 0; i < 9; i++) {
				
					sleep(1000);
					System.out.println(i+".Saldo "+inicio.getSaldo());
			}
			} catch (InterruptedException e) {}
				
			
		}///
		
	}//run
	
}

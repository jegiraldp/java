public class hiloImpares extends Thread{
    public hiloImpares(String nombre){
        setName(nombre);
    }

    public void run(){

        try {
            for (int i = 1; i < 11; i+=2) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}

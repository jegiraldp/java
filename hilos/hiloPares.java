public class hiloPares extends Thread{

    public hiloPares(String nombre){
        setName(nombre);
    }

    public void run(){

            try {
                for (int i = 0; i < 11; i+=2) {
                    Thread.sleep(1000);
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                System.out.println("Error");
            }

        }
    }


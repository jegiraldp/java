import java.util.*;
class hilo extends Thread {
    public hilo(String nombre) {
        setName(nombre);
        start();
    }

    public void run() {
        metodo();
    }



    void metodo(){
        String punto=".";
        Random rnd = new Random();
        int tiempo=rnd.nextInt(500,1000);
        try {
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(tiempo);
                System.out.println(getName()+":"+punto);
                punto=punto+".";
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
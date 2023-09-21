
class hilo extends Thread {
    public hilo(String nombre) {
        setName(nombre);
        start();
    }

    public void run() {
        metodo();
    }



    void metodo(){
        int tiempo=0;
                if(getName().equals("h1")){
                    tiempo=1000;
                }
        if(getName().equals("h2")){
            tiempo=500;
        }
        try {
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(tiempo);
                System.out.println("Hilo "+getName()+ " cuenta: "+i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
class inicio{
    public static void main(String[] args)throws InterruptedException {

    hilo HiloUno = new hilo("h1");
    hilo hiloDos = new hilo("h2");

    }

    static void metodoDos(){
        try{
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(100);
                System.out.println("Soy metodo 2: "+i);
            }
        }catch(InterruptedException e){
            System.out.println("Error en el sleep");
        }

    }

}
class inicio{
    public static void main(String[] args) throws InterruptedException {
/*
        h1.join();
        h2.join();*/
        System.out.println("Soy el main iniciando");
      //  pares.saludar();
       // impar.saludar();
        hiloPares hiloP = new hiloPares();
        hiloP.start();

        hiloImpares hiloI = new hiloImpares();
        hiloI.start();


        Thread.sleep(2000);
        System.out.println("Soy el main y ya termine");

    }

}
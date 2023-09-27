class inicio{
    public static void main(String[] args) throws InterruptedException {

        hiloPares h1 = new hiloPares("Hilo Pares");
        hiloImpares h2= new hiloImpares("Hilo Impares");

        h1.start();
        h2.start();

        h1.join();
        h2.join();

        System.out.println("Soy el main y ya termine");

    }

}
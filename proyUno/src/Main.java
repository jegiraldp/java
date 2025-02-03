public class Main {
    public static void main(String[] args) {

        Saludo saludoAnonimo = new Saludo(){

            @Override
            public void saludar() {
                System.out.println("Saludo Anonimo");
            }
        };
        //saludoAnonimo.saludar();

        /// /////////
        new Vehiculo(){
            private int numPasajeros;
            public void manejar(){
                System.out.println("Manejando");
            }
        }.manejar();

    }//main

}
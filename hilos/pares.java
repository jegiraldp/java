public class pares {

    static void saludar() throws InterruptedException{
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
                Thread.sleep(3000);
            }
        }
    }
}

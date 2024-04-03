public class impar {

    static void saludar() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
    }
}
package metodoDefault;

public class StringFunctions{
    @FunctionalInterface
    public interface StringOperation {
        int getAmount();
        
        default void operate(String texto){
            int num = getAmount();
            while(num-- >0){
                System.out.println(texto);
            }
        }

    }

    @FunctionalInterface
    public interface doOperation {
    
        void take(String texto);

        default void execute(int x, String texto){
            while(x-- >0){
                take(texto);
            }
        }
        
    }

    public static void main(String[] args) {
        StringOperation six =()->6;
        six.operate("jorge");

        doOperation five = text->System.out.println(text);
        five.execute(5,"giraldo");
    }
    
}
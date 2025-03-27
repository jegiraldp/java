package proxy.library;

public class LenderStudent implements iLendingService {
    private int code;

    @Override
    public void returnBookMsg() {
        System.out.println("Return book Ok");
    }

    public LenderStudent(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    
    
}

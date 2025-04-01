package observer.moneychange;

public class InicioMoney {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new PesoColObservador(subject);
        new PesoMexObservador(subject);

        System.out.println("Chage 10 dollars");
        subject.setState(10);

        System.out.println("Chage 100 dollars");
        subject.setState(100);
    }
    
}

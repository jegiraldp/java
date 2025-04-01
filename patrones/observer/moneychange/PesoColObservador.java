package observer.moneychange;

public class PesoColObservador extends Observer {

    private double valorCambio=4186;

    @Override
    public void actualizar() {
        System.out.println("COL:" +(subject.getState()*valorCambio));
    }

    public PesoColObservador(Subject subject) {
        this.subject=subject;
        this.subject.add(this);
    }

    
    
}

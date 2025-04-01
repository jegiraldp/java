package observer.moneychange;

public class PesoMexObservador extends Observer {

    private double valorCambio=20.33;

    @Override
    public void actualizar() {
        System.out.println("MEX:" +(subject.getState()*valorCambio));
    }

    public PesoMexObservador(Subject subject) {
        this.subject=subject;
        this.subject.add(this);
    }

    
}

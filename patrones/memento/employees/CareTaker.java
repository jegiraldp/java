package memento.employees;

import java.util.List;

public class CareTaker {

    private List<iMemento> history;

    public void undo(){
        System.out.println("Deshacer");
    }
    
}

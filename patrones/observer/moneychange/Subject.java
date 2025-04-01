package observer.moneychange;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        observers.forEach(o->o.actualizar());
    }

    

    
    
}

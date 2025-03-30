package memento.game;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> history = new ArrayList<>();

    public void addMemento(Memento m){
        history.add(m);
    }

    public Memento getMemento(int index){
        return history.get(index);
    }
    
}

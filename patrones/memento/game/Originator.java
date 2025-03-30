package memento.game;

public class Originator {

    private Game state;

    public Game getState() {
        return state;
    }

    public void setState(Game state) {
        this.state = state;
    }

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento m){
        this.state= m.getState();
    }


    
}

package memento.game;

public class Memento {
    private Game state;

    public Memento(Game state) {
        this.state = state;
    }

    public Game getState() {
        return state;
    }

    
    
}

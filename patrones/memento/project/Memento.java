package memento.project;

public class Memento {

    private Project state;

    public Memento(Project state) {
        this.state = state;
    }

    public Project getState() {
        return state;
    }
  
    
}

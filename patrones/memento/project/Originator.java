package memento.project;

public class Originator {

    private Project state;

    public void setState(Project state) {
        this.state = state;
    }

    public Project getState() {
        return state;
    }

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento m){
        this.state=m.getState();
    }
    
}

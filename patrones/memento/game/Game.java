package memento.game;

public class Game {
    private String name;
    private int checkpoint;

   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCheckpoint() {
        return checkpoint;
    }
    public void setCheckpoint(int checkpoint) {
        this.checkpoint = checkpoint;
    }
    @Override
    public String toString() {
        return "Game [name=" + name + ", checkpoint=" + checkpoint + "]";
    }
    
}

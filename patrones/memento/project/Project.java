package memento.project;

public class Project {

    private String title;
    private int progress;
    private int budget;
    
    public Project() {
        budget=1000;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
    

    @Override
    public String toString() {
        return "Project [title=" + title + ", progress=" + progress + ", budget=" + budget + "]";
    }

}

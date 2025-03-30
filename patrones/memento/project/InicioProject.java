package memento.project;

public class InicioProject {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        Project pro = new Project();
        pro.setTitle("Proyect One");

        pro.setProgress(10);
        pro.setBudget(900);
        originator.setState(pro);
        careTaker.addMemento(originator.save());

        pro = new Project();
        pro.setTitle("Proyect One");
        pro.setProgress(30);
        pro.setBudget(600);
        originator.setState(pro);
        careTaker.addMemento(originator.save());

        pro = new Project();
        pro.setTitle("Proyect One");
        pro.setProgress(50);
        pro.setBudget(400);
        originator.setState(pro);
        careTaker.addMemento(originator.save());
        
        originator.restore(careTaker.getMemento(1));
        pro=originator.getState();

        System.out.println(pro);

    }
    
}

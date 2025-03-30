package memento.game;

public class InicioGame {

    public static void main(String[] args) {

        String name="Gear of war";
        
        CareTaker caretaker = new CareTaker();
        Originator originator = new Originator();

        Game gameUno = new Game();
        gameUno.setName(name);
        
        gameUno.setCheckpoint(1);
        originator.setState(gameUno);
        caretaker.addMemento(originator.save());

        gameUno = new Game();
        gameUno.setName(name);
        gameUno.setCheckpoint(10);
        originator.setState(gameUno);
        caretaker.addMemento(originator.save());

        gameUno = new Game();
        gameUno.setName(name);
        gameUno.setCheckpoint(15);
        originator.setState(gameUno);
        caretaker.addMemento(originator.save());
       
        ///
        originator.restore(caretaker.getMemento(1));
        gameUno = originator.getState();

        System.out.println(gameUno);


    }
    
}

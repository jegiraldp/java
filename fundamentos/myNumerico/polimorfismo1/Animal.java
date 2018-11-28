

package polimorfismo1;

public abstract class Animal implements Parlanchin{
    public abstract void habla();
}

class Perro extends Animal{
    public void habla(){
        System.out.println("¡Guau!");
    }
}

class Gato extends Animal{
    public void habla(){
        System.out.println("¡Miau!");
    }
}


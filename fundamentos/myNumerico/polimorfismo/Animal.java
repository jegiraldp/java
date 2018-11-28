

package polimorfismo;

public abstract class Animal {
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



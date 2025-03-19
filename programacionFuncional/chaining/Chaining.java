package chaining;

public class Chaining {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hola")
        .append("giraldo")
        .append("jorge")
        .append("platzi");

        Chainer chainer = new Chainer();
        chainer.sayBye().sayHi();

    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("hola");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }

    }
    
}

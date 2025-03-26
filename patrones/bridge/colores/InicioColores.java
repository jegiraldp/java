package bridge.colores;

public class InicioColores {

    public static void main(String[] args) {
        
        Rojo Crojo = new Rojo();
        Circulo c = new Circulo(Crojo, 123, "Circulo");

        Azul Cazul = new Azul();
        Triangulo t = new Triangulo(Cazul, 321, "Triangulo ");

        System.out.println(c.getNombre()+" "+c.pintandoFigura());
        c.pintandoFigura();

        System.out.println(t.getNombre()+" "+t.pintandoFigura());
        t.pintandoFigura();

       

    }
    
}

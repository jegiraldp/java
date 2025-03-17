package predicates;

import java.util.function.Predicate;

public class student {
    private double calificacion;
    

    public static void main(String[] args) {
        student es = new student(2.9);
        Predicate<Integer> esPar = x->x%2==0;
        System.out.println(esPar.test(33));
        System.out.println("................");
        Predicate<student> isAprobado = student -> student.getCalificacion()>3.0;
        System.out.println(isAprobado.test(es));
        System.out.println("................");
        

    }

    public student(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }
    
}

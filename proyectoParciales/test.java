
import java.io.IOException;


public class test {
    static listaEstudiantesGrupo lista;
    static listaEstudiantes listaEs;
    
    public static void main(String[] arg) throws IOException{
        
        
        //docentes
        docente[] docentes = new docente[2];
        docentes[0]= new docente(1, 123, "jorge_1");
        docentes[1]= new docente(2, 124, "jorge_2");
        
        //estudiante general
        listaEs = new listaEstudiantes();
        listaEs.nuevo(11, 999, "e1");
        listaEs.nuevo(12, 998, "e2");
        listaEs.nuevo(13, 997, "e3");
        listaEs.nuevo(14, 996, "e4");
        listaEs.nuevo(19, 990, "un alumno");
        
        //curso
        curso tpa= new curso("ING00135", "TPA");
        curso lp1= new curso("ING00151", "LP1");
        
        //lista TPA grupo 1
        listaEstudiantesGrupo lista_TPA_1 = new listaEstudiantesGrupo();
        lista_TPA_1.nuevo(11, 999, "e1");
        lista_TPA_1.nuevo(12, 998, "e2");
        
        //lista TPA grupo 2
        listaEstudiantesGrupo lista_TPA_2 = new listaEstudiantesGrupo();
        lista_TPA_2.nuevo(13, 997, "e3");
        lista_TPA_2.nuevo(14, 996, "e4");
        
        //lista LP1 grupo 1
        listaEstudiantesGrupo lista_LP1_1 = new listaEstudiantesGrupo();
        lista_LP1_1.nuevo(15, 995, "e5");
        lista_LP1_1.nuevo(16, 994, "e6");
        lista_LP1_1.nuevo(17, 993, "e7");
        lista_LP1_1.nuevo(18, 992, "e8");
        
        //grupos
        grupo g1_tpa = new grupo(01, tpa, docentes[0], lista_TPA_1);
        grupo g2_tpa = new grupo(02, tpa, docentes[0], lista_TPA_2);
        grupo g1_lp1 = new grupo(01, lp1, docentes[1], lista_LP1_1);
        
        //parcial
        parcial[] parciales = new parcial[3];
        parciales[0] = new parcial(9, 15, "18:00", g1_tpa, "profe_1","P13-305");
        parciales[1] = new parcial(9, 15, "18:00", g2_tpa, "profe_2","P13-304");
        parciales[2] = new parcial(9, 14, "06:00", g1_lp1, "profe_3","P13-302");
        
        String impri="";
        //reporte programación parciales con estudiantes
        for (int i = 0; i < parciales.length; i++) {
            
            impri="Fecha: "+parciales[i].getFecha()
                   +"| Hora: "+parciales[i].getHora()
                   +"| Aula: "+parciales[i].getAula()
                   +"| Curso: "+parciales[i].getGrupo().getAsignatura().getCodigo()
                   +"| Grupo: "+parciales[i].getGrupo().getCodigo()
                   +"| Docente: "+parciales[i].getGrupo().getProfesor().getNombre()
                   +"| Vigilante: "+parciales[i].getSupervisor();
            
            impri+="\nEstudiantes:\n";
            lista=parciales[i].getGrupo().getEstudiantes();
            impri+=lista.printList();
            System.out.println(impri);
            
        }//for
        
        
        //ejemplo serializacion
        //serializar.iniciar();
        
        //
        
        
        
    }//main
    
}

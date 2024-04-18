public class gestionEstudiantes {


    static Estudiante nuevoEstudiante(int c, String nc, int cn){
        return new Estudiante(c,nc,cn);
    }

    static int buscarEstudiante(int codigo, Estudiante[] lista, int contador){
        int pos = 99;
        for (int i = 0; i < contador; i++) {
            if(lista[i].getCodigo()==codigo){
              pos=i;
            }

        }
    return pos;
    }
}

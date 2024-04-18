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

    static boolean editarNombreEstudiante(int codigo, String nuevoNombre, Estudiante[] lista, int contador){
        boolean retorno=false;
        int valor = buscarEstudiante(codigo,lista, contador);
        if(valor==99){
            return retorno;
        }else{
            Inicio.listaE[valor].nombreCompleto=nuevoNombre;
            retorno=true;
        }
        return retorno;
    }
}

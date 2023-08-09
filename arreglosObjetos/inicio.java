public class inicio {
    static propietario[] listaProp;
    static profesional[] listaProf;
    static vehiculo[] listaVehiculos;
    static servicio[] listaServicios;


    public static void main(String[] args) {

        crearObjetos();

        //lista de atenciones
        atencion[] listaAtenciones = new atencion[2];
        listaAtenciones[0] = new atencion(111,listaServicios[0]
                ,listaVehiculos[0],listaProf[0]);
        listaAtenciones[1] = new atencion(222,listaServicios[1],listaVehiculos[1],listaProf[1]);

        //ver atenciones
        for (int i = 0; i < listaAtenciones.length; i++) {
            System.out.println(
                    "Código:"+listaAtenciones[i].getCodigo()+"\\"
                    +"Servicio:"+listaAtenciones[i].servicio.nombre+"\\"
                    +"Placa:"+listaAtenciones[i].vehiculo.placa+"\\"
                    +"Profesional:"+listaAtenciones[i].profesional.nombreCompleto+"\\"
                    +"Propietario:"+listaAtenciones[i].vehiculo.propietario.nombreCompleto+"\\"
                    +"Contacto:"+listaAtenciones[i].vehiculo.propietario.telefonoContacto+"\\");
        }

        for (atencion a:listaAtenciones) {
            System.out.println(
                    "Código:"+a.getCodigo()+"\\"
                            +"Servicio:"+a.servicio.nombre+"\\"
                            +"Placa:"+a.vehiculo.placa+"\\"
                            +"Profesional:"+a.profesional.nombreCompleto+"\\"
                            +"Propietario:"+a.vehiculo.propietario.nombreCompleto+"\\"
                            +"Contacto:"+a.vehiculo.propietario.telefonoContacto+"\\");
        }


    }

    static void crearObjetos(){
        //crear propietarios
        listaProp = new propietario[2];
        listaProp[0] =
                new propietario(123,"Jorge Propietario 1",
                        3005555555L,"correo123@correo.com");

        listaProp[1] =
                new propietario(124,"Jorge Propietario 2",
                        3006666666L,"correo124@correo.com");

        //crearProfesionales
        listaProf = new profesional[2];
        profesional prof1 =
                new profesional(987, "Jorge Profesional 1",0,555);
        listaProf[0]=prof1;

        profesional prof2 =
                new profesional(986, "Jorge Profesional 2",0,554);

        listaProf[1]=prof2;

        // crear vehiculo
        listaVehiculos = new vehiculo[2];
        listaVehiculos[0] =
                new vehiculo("aaa111","kia","cerato",listaProp[0]);

        listaVehiculos[1] =
                new vehiculo("bbb222","kia","rio",listaProp[1]);

        //servicios
        listaServicios = new servicio[3];
        listaServicios[0] = new servicio(111,80000,"Alineación");
        listaServicios[1] = new servicio(112,100000,"Balanceo");
        listaServicios[1] = new servicio(113,45000,"Lavada");
    }
}

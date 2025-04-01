public class conexionDB{
    private String codigo;
    public String nombre;
    private static conexionDB objeto;

    private conexionDB(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
    }

    public void conectar(){
        System.out.println("Conectado a "+this.nombre);

    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public static conexionDB getObjeto(String c) {
        if(objeto==null){
            System.out.println("Se crea y se retorna");
            objeto= new conexionDB(c, "MySQL...");
        }else{
            System.out.println("No se crea y se retorna");
        }
        return objeto;
    }

    

}
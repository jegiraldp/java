public class inicio {
    public static void main(String[] args) {

       nacional pn1 = new nacional(123,3000,"tetero", 999);
       importado pi1 = new importado(0101,500,"cama china",9898);

        System.out.println("--------- Lista de productos --------");
        System.out.print("\n"+pn1.getCodigo()+"\t"+pn1.nombre+"\t"+pn1.getValor());
        System.out.print("\n"+pi1.getCodigo()+"\t"+pi1.nombre+"\t"+pi1.getValor());

    }
}

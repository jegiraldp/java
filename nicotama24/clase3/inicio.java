public class inicio {
    public static void main(String[] args) {
        lista theList=null;

        ///crear
        theList = new lista(3);
        System.out.println("   ...lista creada");

        ///menu listar
        if(theList==null){
            System.out.println("vacia");
        }else{
           theList.verLista();
        }




    }
}

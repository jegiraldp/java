package iterator.boxes;

public class InicioBoxes {

    public static void main(String[] args) {
        
        Box<Integer> listaItems = new Box<>();
        listaItems.addItem(4);
        listaItems.addItem(5);
        listaItems.addItem(55);
        listaItems.addItem(44);

        iIterator<Integer> theIterator = listaItems.createIterator();

        while(theIterator.hasNext()){
            System.out.println(theIterator.next());
        }


    }
    
}

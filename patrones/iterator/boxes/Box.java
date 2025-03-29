package iterator.boxes;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void addItem(T theItem){
        items.add(theItem);
    }

    public iIterator<T> createIterator(){
        
        return new BoxIterator<>(items);
    }

   
    
    
}

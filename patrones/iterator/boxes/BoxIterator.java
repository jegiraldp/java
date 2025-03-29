package iterator.boxes;

import java.util.List;

public class BoxIterator<T> implements iIterator<T> {

    private int index=0;
    private List<T> theCollection;

    


    public BoxIterator(List<T> theCollection) {
        
        this.theCollection = theCollection;
    }

    @Override
    public boolean hasNext() {
        return index<theCollection.size();
    }

    @Override
    public T next() {
        if(this.hasNext()){
            return theCollection.get(index++);
        }
        return null;
    }
    
}

package command.products;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<iOperation> operations = new ArrayList<>();

    public void addOperation(iOperation operation){
        this.operations.add(operation);
    }
    
    public void doOperations(){
        this.operations.forEach(ope->ope.execute());
        this.operations.clear();
    }
    
}

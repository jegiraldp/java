package command.account;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<iOperation> operations = new ArrayList<>();

    public void addOperation(iOperation operation){
        this.operations.add(operation);
    }
    
    public void doOperations(){
        this.operations.forEach(x->x.execute());
        this.operations.clear();
    }
}

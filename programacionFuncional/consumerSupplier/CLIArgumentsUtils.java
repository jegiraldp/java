package consumerSupplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {

    static void showHelp(CLIArguments cliArguments){
        Consumer<CLIArguments> consumerHelper = cliArguments1 ->{

            if(cliArguments1.isHelp()){
                System.out.println("Manual solicitado");
            }
            
    };
    consumerHelper.accept(cliArguments);
}

static CLIArguments genarateCLI(){
    Supplier<CLIArguments> generator =()-> new CLIArguments();
    return generator.get();
}
    
}

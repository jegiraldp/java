
public class seleccion {
    
    public static gen[] inicial(gen[] g ,float ps){
        
        for (int i = 0; i < g.length; i++) {
            g[i].sel=2;
            if(g[i].probSel>ps) g[i].sel=1;
        }
        
        return g;
    }//
    
    
}

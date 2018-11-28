public class gen {
    
    public int fenotipo,id;
    public String genotipo;
    public float valorAdaptacion,probSel,probC;
    public int sel, cruce, cruceFinal;
    public int padre, madre;
        
    public gen(int id,int fenotipo, String genotipo, float valorAdaptacion) {
        this.id=id;
        this.fenotipo = fenotipo;
        this.genotipo = genotipo;
        this.valorAdaptacion=valorAdaptacion;
        this.probSel=0;
        this.probC=0;
        this.sel=0;
        this.cruce=0;
        this.cruceFinal=0;
        this.padre=0;
        this.madre=0;
    }
 
}//

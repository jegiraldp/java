package prototype.employe;

public class Temporal extends Employee {

    public int numHours;

    public Temporal(Temporal target) {
            super(target);
            if(target!=null){
                this.numHours=target.numHours;
            }
    }

    public Temporal(){
        super(null);
    }
    
    @Override
    public Employee clone() {
        return new Temporal(this);
    }

    @Override
    public String toString() {
        return "Temporal [code=" + code + ", numHours=" + numHours + ", name=" + name + "]";
    }

    
    
}

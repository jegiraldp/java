package prototype.employe;
public class Fulltime extends Employee{
    public int officeCode; 

    

    public Fulltime(Fulltime target) {
        super(target);
        if(target!=null){
            this.officeCode = target.officeCode;
        }
        
    }

    public Fulltime(){
        super(null);
    }



    @Override
    public Employee clone() {
       return new Fulltime(this);
    }

    @Override
    public String toString() {
        return "Fulltime [code=" + code + ", officeCode=" + officeCode + ", name=" + name + "]";
    }

    

}
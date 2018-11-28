
public class mutacion {
    
    public float probM;
    public String genes;
    
    public static String mutar(String cromo){
             int num = new java.util.Random().nextInt(5);
             
             String mutante="";
             char[] v = cromo.toCharArray();
             
             if(v[num]=='0') v[num]='1';
             else v[num]='1';
             for (int i = 0; i < v.length; i++) mutante+=v[i];
            
    return mutante;        
    }//
             
    }//class
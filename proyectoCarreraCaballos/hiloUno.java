
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.plaf.SliderUI;


public class hiloUno extends Thread{

    
    public hiloUno(String name) {
        this.setName(name);
    }//constr
    
    public void run(){
        
        
    
        if(getName().equals("Palomo")){
            
            long ti=System.currentTimeMillis();
            
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo1.setLocation(frmInicio.lblCaballo1.getLocation().x+carrera.losCaballos[0].getAvance(),frmInicio.lblCaballo1.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[0].getVelocidad());
                    
                    if(frmInicio.lblCaballo1.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[0].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[0].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
            
            frmInicio.lblCaballo1.setLocation(frmInicio.lblCaballo1.getLocation().x,frmInicio.lblCaballo1.getLocation().y);
             
             this.stop();
        }//if
              
        
        if(getName().equals("Tornado")){
            long ti=System.currentTimeMillis();
for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo2.setLocation(frmInicio.lblCaballo2.getLocation().x+carrera.losCaballos[1].getAvance(),frmInicio.lblCaballo2.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[1].getVelocidad());
                    
                    if(frmInicio.lblCaballo2.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[1].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[1].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCaballo2.setLocation(frmInicio.lblCaballo2.getLocation().x,frmInicio.lblCaballo2.getLocation().y);        
        this.stop();
        }//if
        
        if(getName().equals("Plata")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo3.setLocation(frmInicio.lblCaballo3.getLocation().x+carrera.losCaballos[2].getAvance(),frmInicio.lblCaballo3.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[2].getVelocidad());
                    
                    if(frmInicio.lblCaballo3.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[2].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[2].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCaballo3.setLocation(frmInicio.lblCaballo3.getLocation().x,frmInicio.lblCaballo3.getLocation().y);                
        this.stop();
        }//if
        
        if(getName().equals("Rocinante")){
            long ti=System.currentTimeMillis();
          for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblCaballo4.setLocation(frmInicio.lblCaballo4.getLocation().x+carrera.losCaballos[3].getAvance(),frmInicio.lblCaballo4.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);
                    
                    
                    sleep(carrera.losCaballos[3].getVelocidad());
                    
                    if(frmInicio.lblCaballo4.getLocation().x>=frmInicio.lblLinea.getLocation().x){
                        long tf=System.currentTimeMillis();
                        long tt= tf-ti;
                        carrera.losCaballos[3].setTiempo(tt);
                        frmInicio.txtR.append("\n"+this.getName()+":"+carrera.losCaballos[3].getTiempo()+" ms");
                        j=99;
                        }else{
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }
              
              
             
        }//for
             frmInicio.lblCaballo4.setLocation(frmInicio.lblCaballo4.getLocation().x,frmInicio.lblCaballo4.getLocation().y);                
        this.stop();
        }//if
        
    }//run

    
   

        
    }//class
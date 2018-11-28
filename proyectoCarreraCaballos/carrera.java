import java.util.Random;

public class carrera {
    
    static caballo[] losCaballos;
    static Random rnd;
    static int[] vel;
    
    static public void reiniciar(){
    int[] vel={240,250,255,245};
    int[] ava={13,15,16,14};
     //Vel
        losCaballos[0].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[1].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[2].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        losCaballos[0].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[1].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[2].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[3].setAvance(ava[rnd.nextInt(4)]);
    
    }//
    
    static public void registrarCaballos(){
        rnd= new Random();
        
        int[] vel={240,250,255,245};
        int[] ava={13,15,16,14};
        losCaballos = new caballo[4];
        
        losCaballos[0] = new caballo(0,0,0,0,0,"-");
        losCaballos[1] = new caballo(0,0,0,0,0,"-");
        losCaballos[2] = new caballo(0,0,0,0,0,"-");
        losCaballos[3] = new caballo(0,0,0,0,0,"-");
        //ingreso de datos
        //codigos
        losCaballos[0].setCodigo(101);
        losCaballos[1].setCodigo(102);
        losCaballos[2].setCodigo(103);
        losCaballos[3].setCodigo(104);
        //nombres
        losCaballos[0].setNombre("Palomo");
        losCaballos[1].setNombre("Tornado");
        losCaballos[2].setNombre("Plata");
        losCaballos[3].setNombre("Rocinante");
        //CoordX
        losCaballos[0].setCoorX(frmInicio.lblCaballo1.getLocation().x);
        losCaballos[1].setCoorX(frmInicio.lblCaballo2.getLocation().x);
        losCaballos[2].setCoorX(frmInicio.lblCaballo3.getLocation().x);
        losCaballos[3].setCoorX(frmInicio.lblCaballo4.getLocation().x);
        //CoordX
        losCaballos[0].setCoorY(frmInicio.lblCaballo1.getLocation().y);
        losCaballos[1].setCoorY(frmInicio.lblCaballo2.getLocation().y);
        losCaballos[2].setCoorY(frmInicio.lblCaballo3.getLocation().y);
        losCaballos[3].setCoorY(frmInicio.lblCaballo4.getLocation().y);
        //Vel
        losCaballos[0].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[1].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[2].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        losCaballos[0].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[1].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[2].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[3].setAvance(ava[rnd.nextInt(4)]);
        //
        losCaballos[0].setTiempo(0);
        losCaballos[1].setTiempo(0);
        losCaballos[2].setTiempo(0);
        losCaballos[3].setTiempo(0);
        
        //
    }//
    
    
    static void iniciar(){
        
        hiloUno h1= new hiloUno(losCaballos[0].getNombre());
        h1.start();
        
        hiloUno h2= new hiloUno(losCaballos[1].getNombre());
        h2.start();
        
        hiloUno h3= new hiloUno(losCaballos[2].getNombre());
        h3.start();
        
        hiloUno h4= new hiloUno(losCaballos[3].getNombre());
        h4.start();
    }//iniciar           
            
    
    
    }//class

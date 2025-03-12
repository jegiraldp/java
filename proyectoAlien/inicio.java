import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;


public class inicio extends JFrame implements ActionListener {
    static JLabel nave, lblGround,lblBomb, lblNaveAlien;
    static JButton btnGo, btnSetup;
    JScrollPane scrollPane;
    static JTextArea txtArea;
    static Timer timer, r2;
    static int velocidad=0;
    static DecimalFormat df;
    static List<List <Double>> population;

    static boolean continuar = true;
    //maximo avance 10
    static int avanceInicio=0;
    //maxima velocidad 500
    static int velInicio=0, contador=0;
    //máxima capacidad frenado 50
    static int capacidadFrenado=0;
    static int velTotal=0;
    static double danoMinimo=0.25, fuerza=0.0, tiempo=0.0;
    static String cabeceras="V     B     S     F";
    static String reportando="";
    public inicio(){

        df= new DecimalFormat("#.##");

        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);
        //
        nave = new JLabel();
        nave.setBounds(100,50,48,48);
        nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("nave.png")));

        btnGo = new JButton("Go");
        btnGo.setBounds(30,10,70,25);
        btnGo.addActionListener(this);
        btnGo.setEnabled(false);

        btnSetup = new JButton("Setup");
        btnSetup.setBounds(120,10,70,25);
        btnSetup.addActionListener(this);

        txtArea = new JTextArea();
        txtArea.setEditable(true);
        txtArea.setBounds(250,10,150,200);
        txtArea.setBackground(c);
        //txtArea.setBorder(new LineBorder(Color.blue, 1));
        scrollPane = new JScrollPane(txtArea);

        lblGround = new JLabel("--------------------------");
        lblGround.setBounds(75,260,150,25);

        lblBomb = new JLabel("");
        lblBomb.setBounds(100,225,150,50);
        lblBomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("bomb.png")));
        lblBomb.setVisible(false);

        lblNaveAlien = new JLabel("");
        lblNaveAlien.setBounds(100,225,150,50);
        lblNaveAlien.setIcon(new javax.swing.ImageIcon(getClass().getResource("naveAlien.png")));
        lblNaveAlien.setVisible(false);

        //
        //
        add(nave);
        add(btnGo);
        add(btnSetup);
        add(txtArea);
        add(lblGround);
        add(lblBomb);
        add(lblNaveAlien);
       

        //
        timer = new Timer(velInicio, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               
                nave.setLocation(nave.getX(), nave.getY()+avanceInicio);
                if(r2.isRunning()) r2.stop();
                

                if(nave.getY()>=lblGround.getY()-28) {
                    timer.stop();
                    
                    if(fuerza>=danoMinimo) {
                        lblBomb.setVisible(true);
                        nave.setVisible(false);
                    }else{
                        txtArea.append("\n\n\n     You do it !!  :)");
                        lblNaveAlien.setVisible(true);
                        nave.setVisible(false);
                        continuar=false;
                        
                    }
                    
                    List<Double> theMix = genetico.cruzarList(population.get(0), population.get(1));
                    population=genetico.nuevaPoblacionAndMutate(theMix, population.size());
                    population=genetico.ordenarLista(population);
                    /////
                    velInicio= (int) Math.round(population.get(0).get(0));
                    capacidadFrenado = (int) Math.round(population.get(0).get(1));
                    avanceInicio = (int) Math.round(population.get(0).get(2));
                    fuerza = population.get(0).get(3); 
                    //////
                    
                    if(continuar) r2.start();

                  
                    
                    
                }
              
              
              

              
            }
        });
       
        r2 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e){
                contador++;
                reportando="\n"+velInicio+"   "+capacidadFrenado+"     "+avanceInicio
                +"     "+df.format(fuerza)+"\n\nGeneration: "+contador;
                txtArea.setText(cabeceras+reportando);

                nave.setLocation(100,50);
                nave.setVisible(true);
                lblBomb.setVisible(false);
                lblNaveAlien.setVisible(false);
                ////
                
                timer.setDelay(velInicio);
                timer.start();             
                ///
               

            }
           });



        ///
        setLayout(null);
        setSize(430,350);
        setTitle("Alien Landing");
        setResizable(false);

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);


    }

    public static void main(String[] args) {
        inicio ven= new inicio();
        ven.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        //Go
        if (e.getSource().equals(btnGo)){
            txtArea.setText("");
             reportando="\n"+velInicio+"   "+capacidadFrenado+"     "+avanceInicio
                        +"     "+df.format(fuerza)+"\n\nGeneration: "+contador;
            txtArea.append(cabeceras+reportando);
            btnGo.setEnabled(false);
            timer.start();
          //  algoritmoG(5);

        }


            //setup
        if (e.getSource().equals(btnSetup)){
            contador=0;
            timer.stop();
            r2.stop();
           elSetup();
        }
    }

  
    public static void elSetup(){
         //
         txtArea.setText("");
         reportando="";

         population = genetico.getPoblacion(10);
         population=genetico.ordenarLista(population);

         population = genetico.ordenarLista(population);
         List<Double> inicial= population.get(population.size()-1);

         velInicio= (int) Math.round(inicial.get(0));
         capacidadFrenado = (int) Math.round(inicial.get(1));
         avanceInicio = (int) Math.round(inicial.get(2));
         fuerza = inicial.get(3);

          //
          timer.stop();
          timer.setDelay(velInicio);
          btnGo.setEnabled(true);
          nave.setLocation(100,50);
          nave.setVisible(true);
          lblBomb.setVisible(false);
          lblNaveAlien.setVisible(false);
 
 
          //
         
         
         for(int i=0;i<population.size();i++){
             for(int j=0;j<population.get(i).size();j++){
                 reportando+=" "+df.format(population.get(i).get(j));
             }
             reportando+="\n";
         }
         reportando+="\n---------------\n";
         reportando+=" Init: "+velInicio+"  "+capacidadFrenado+"  "+avanceInicio+"  "+df.format(fuerza);

         txtArea.setText("--- Generation 0 ---\n"+reportando);
         
         
     //Move
     //better
        

    }
}
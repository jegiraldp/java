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
    JLabel nave, lblGround,lblBomb;
    JButton btnIniciar, btnSetup;
    JScrollPane scrollPane;
    JTextArea txtArea;
    Timer timer;
    int velocidad=0;
    DecimalFormat df;
    List<List <Double>> population;


    //maximo avance 10
    int avanceInicio=0;
    //maxima velocidad 500
    int velInicio=0;
    //máxima capacidad frenado 50
    int capacidadFrenado=0;
    int velTotal=0;
    double danoMinimo=0.2, fuerza=0.0, tiempo=0.0;
    String cabeceras="   Vel  Fre  Ava   Fuerza";
    String reportando="";
    public inicio(){

        df= new DecimalFormat("#.##");

        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);
        //
        nave = new JLabel();
        nave.setBounds(100,50,48,48);
        nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("space.png")));

        btnIniciar = new JButton("Go");
        btnIniciar.setBounds(30,10,70,25);
        btnIniciar.addActionListener(this);
        btnIniciar.setEnabled(false);

        btnSetup = new JButton("Setup");
        btnSetup.setBounds(120,10,70,25);
        btnSetup.addActionListener(this);

        txtArea = new JTextArea();
        txtArea.setEditable(true);
        txtArea.setBounds(250,10,200,250);
        txtArea.setBackground(c);
        //txtArea.setBorder(new LineBorder(Color.blue, 1));
        scrollPane = new JScrollPane(txtArea);

        lblGround = new JLabel("--------------------------");
        lblGround.setBounds(75,255,150,25);

        lblBomb = new JLabel("");
        lblBomb.setBounds(100,215,150,50);
        lblBomb.setIcon(new javax.swing.ImageIcon(getClass().getResource("bomb.png")));
        lblBomb.setVisible(false);
        //
        //
        add(nave);
        add(btnIniciar);
        add(btnSetup);
        add(txtArea);
        add(lblGround);
        add(lblBomb);

        //
        timer = new Timer(velocidad, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                nave.setLocation(nave.getX(), nave.getY()+avanceInicio);
                reportando="   "+velTotal+"   "+capacidadFrenado+"     "+avanceInicio
                        +"     "+df.format(fuerza);
                txtArea.setText(cabeceras+"\n"+reportando);

                if(nave.getY()>=lblGround.getY()-35) {
                    timer.stop();
                    if(fuerza>=danoMinimo) {
                        lblBomb.setVisible(true);
                        nave.setVisible(false);
                    }
                }
            }
        });




        ///
        setLayout(null);
        setSize(500,380);
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
        if (e.getSource().equals(btnIniciar)){
            btnIniciar.setEnabled(false);
            timer.start();
        }

        if (e.getSource().equals(btnSetup)){
            //
            txtArea.setText("");
            reportando="";

            population = genetico.getPoblacion(10);
            population=genetico.ordenarLista(population);

             //
            velocidad=velInicio;
            timer.stop();
            timer.setDelay(velocidad);
            btnIniciar.setEnabled(true);
            nave.setLocation(100,50);
            nave.setVisible(true);
            lblBomb.setVisible(false);


            //
            for(int i=0;i<population.size();i++){
                for(int j=0;j<population.get(i).size();j++){
                    reportando+=" "+df.format(population.get(i).get(j));
                }
                reportando+="\n";
            }

            txtArea.setText("--- Generation 0 ---\n"+reportando+"\n------------\n");
        //Move
        //better
            reportando="";
            population = genetico.ordenarLista(population);
            List<Double> mejor= population.get(population.size()-1);
            //List<Double> mejor= population.get(0);

            //asignar configuracion inicial
            velInicio= (int) (mejor.get(0)+mejor.get(1));
            capacidadFrenado = (int) Math.round(mejor.get(1));
            avanceInicio = (int) Math.round(mejor.get(2));
            fuerza = mejor.get(3);
            velTotal=velInicio-capacidadFrenado;

            reportando="";
            reportando+=" "+(velInicio-capacidadFrenado)+" "+capacidadFrenado+" "+avanceInicio+" "+df.format(fuerza);
            txtArea.append("Init: "+reportando+"\n");
            //

        }
    }
}
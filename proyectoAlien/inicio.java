import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;


public class inicio extends JFrame implements ActionListener {
    JLabel nave, lblGround,lblBomb;
    JButton btnIniciar, btnSetup;
    JScrollPane scrollPane;
    JTextArea txtArea;
    Timer timer;
    int velocidad=0;


    //maximo avance 10
    int avanceInicio=5;
    //maxima velocidad 500
    int velInicio=100;
    //máxima capacidad frenado 50
    int capacidadFrenado=30;
    int velTotal=0;
    double danoMinimo=0.2, fuerza=0.0, tiempo=0.0;
    String cabeceras="   Vel  Fre  Ava   Fuerza";
    String reportando="";
    public inicio(){

        DecimalFormat df = new DecimalFormat("#.##");

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
        lblGround.setBounds(75,250,150,25);

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

                tiempo = Math.round((double)200/avanceInicio);
                velTotal= Math.round(velocidad - capacidadFrenado);
                fuerza=(double)1/(velTotal/tiempo);
                nave.setLocation(nave.getX(), nave.getY()+avanceInicio);
                reportando="   "+velTotal+"   "+capacidadFrenado+"     "+avanceInicio
                        +"     "+df.format(fuerza);
                txtArea.setText(cabeceras+"\n"+reportando);

                if(nave.getY()>=lblGround.getY()-32) {
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
            velocidad=velInicio;
            timer.stop();
            timer.setDelay(velocidad);
            btnIniciar.setEnabled(true);
            nave.setLocation(100,50);
            nave.setVisible(true);
            lblBomb.setVisible(false);
            txtArea.setText("");
        }

    }

    public static ArrayList<Integer> crearIndividuo(){
        Random r = new Random();
        ArrayList<Integer> individuo = new ArrayList<>();
        individuo.add(r.nextInt(400)+100); //velocidad
        individuo.add(r.nextInt(50)); // frenado
        individuo.add(r.nextInt(6)+5);
        return individuo;
    }


}

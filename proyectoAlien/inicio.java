import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class inicio extends JFrame implements ActionListener {
    JLabel nave, lblInfo, lblInfo2, lblGround,lblBomb,lblCabeceras;
    JButton btnIniciar, btnReset;
    Timer timer;
    int velocidad=500, velInicio=500,capacidadFrenado=100, avanceInicio=7;
    double dano=0.0, danoMinimo=0.35,velTotal=0.0;
    String cabeceras="";

    public inicio(){

        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);
        //
        nave = new JLabel();
        nave.setBounds(100,50,48,48);
        nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("space.png")));

        btnIniciar = new JButton("Start");
        btnIniciar.setBounds(30,10,70,25);
        btnIniciar.addActionListener(this);

        btnReset = new JButton("Reset");
        btnReset.setBounds(120,10,70,25);
        btnReset.addActionListener(this);

        lblInfo = new JLabel("");
        lblInfo.setForeground(Color.DARK_GRAY);
        lblInfo.setBounds(280,25,180,25);

        cabeceras="Vel    Fre     Ava";
        lblCabeceras = new JLabel(cabeceras);
        lblCabeceras.setForeground(Color.DARK_GRAY);
        lblCabeceras.setBounds(280,10,180,25);
        lblCabeceras.setVisible(false);

        lblInfo2 = new JLabel("-:");
        lblInfo2.setBounds(280,50,80,25);
        lblInfo2.setForeground(Color.red);

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
        add(btnReset);
        add(lblInfo);
        add(lblInfo2);
        add(lblGround);
        add(lblBomb);
        add(lblCabeceras);

        //
        timer = new Timer(velocidad, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                velTotal= (double) (velocidad - capacidadFrenado) /1000;
                nave.setLocation(nave.getX(), nave.getY()+avanceInicio);

                lblInfo.setText(velTotal+"    "+(double)(capacidadFrenado)/1000+"     "+(double)(avanceInicio)/10);

                if(nave.getY()>=lblGround.getY()-32) {
                    timer.stop();
                 //   if(dano>=danoMinimo) {
                        lblBomb.setVisible(true);
                        nave.setVisible(false);
                   // }
                }
            }
        });




        ///
        setLayout(null);
        setSize(500,400);
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
            velocidad=velInicio;
            btnIniciar.setEnabled(false);
            lblCabeceras.setVisible(true);
            timer.start();
        }

        if (e.getSource().equals(btnReset)){
            velocidad=velInicio;
            btnIniciar.setEnabled(true);
            timer.setDelay(velocidad);
            nave.setLocation(100,50);
            nave.setVisible(true);
            lblBomb.setVisible(false);
            lblInfo2.setText("");
            lblInfo.setText("");


        }

    }


}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {




    public static void main(String[] args) {


        JButton btnok;
        btnok = new JButton("Start");

        JFrame jf = new JFrame("Jeu Robot");
        JPanel panel = new JPanel(new GridLayout(5,1));

        JPanel panel2= new JPanel(new BorderLayout());
        JPanel panel3= new JPanel(new BorderLayout());
        JPanel panel4= new JPanel(new BorderLayout());
        JPanel panel5= new JPanel(new BorderLayout());




        panel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));




        ImageIcon FinishLine = new ImageIcon("D:\\LP IAM 2018 MOURAD\\3- Java Avancée\\New folder\\workspace\\JeuxRobot\\images\\finish-line.png");


        ImageIcon RobotBlue = new ImageIcon("D:\\LP IAM 2018 MOURAD\\3- Java Avancée\\New folder\\workspace\\JeuxRobot\\images\\RobotBleu.png");
        ImageIcon RobotGreen = new ImageIcon("D:\\LP IAM 2018 MOURAD\\3- Java Avancée\\New folder\\workspace\\JeuxRobot\\images\\RobotNGGreen.jpg");
        ImageIcon RobotRed = new ImageIcon("D:\\LP IAM 2018 MOURAD\\3- Java Avancée\\New folder\\workspace\\JeuxRobot\\images\\RobotNGRouge.jpg");
        ImageIcon RobotYellow = new ImageIcon("D:\\LP IAM 2018 MOURAD\\3- Java Avancée\\New folder\\workspace\\JeuxRobot\\images\\RobotNGYellow.jpg");

        RobotNG RbGreen = new RobotNG("RobotGreen",600,400,"Est",RobotGreen);
        Thread ThreadBlue = new Thread(RbGreen);

        RobotNG RbRed = new RobotNG("RobotRed",300,200,"Est",RobotRed);
        Thread ThreadRed = new Thread(RbRed);

        RobotNG RbYellow = new RobotNG("RobotYellow",900,600,"Est",RobotYellow);
        Thread ThreadYellow = new Thread(RbYellow);

        RobotNG RbBleu = new RobotNG("RobotBleu",900,600,"Est",RobotBlue);
        Thread ThreadBleu = new Thread(RbBleu);

        RobotNG Finish = new RobotNG("FinishLine",700,600,"null",FinishLine);
        RobotNG Finish1 = new RobotNG("FinishLine",700,600,"null",FinishLine);
        RobotNG Finish2 = new RobotNG("FinishLine",700,600,"null",FinishLine);
        RobotNG Finish3 = new RobotNG("FinishLine",700,600,"null",FinishLine);
/*
        RbGreen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        RbRed.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        RbYellow.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        RbBleu.setBorder(BorderFactory.createLineBorder(Color.BLACK));


*/
        panel2.add(RbGreen,BorderLayout.LINE_START);
        panel2.add(Finish,BorderLayout.LINE_END);
        panel.add(panel2);

        panel3.add(RbRed,BorderLayout.LINE_START);
        panel3.add(Finish1,BorderLayout.LINE_END);
        panel.add(panel3);

        panel4.add(RbYellow,BorderLayout.LINE_START);
        panel4.add(Finish2,BorderLayout.LINE_END);
        panel.add(panel4);

        panel5.add(RbBleu,BorderLayout.LINE_START);
        panel5.add(Finish3,BorderLayout.LINE_END);
        panel.add(panel5);



        btnok.setSize(30,30);

        panel.add(btnok,BorderLayout.CENTER);



        //jf.add(Gas,BorderLayout.EAST);
        //jf.add(new JLabel(RobotGreen),BorderLayout.SOUTH);
        //jf.add(new JLabel(RobotRed),BorderLayout.EAST);
        //jf.add(new JLabel(RobotYellow),BorderLayout.WEST);
        jf.pack();
        //jf.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panel.setSize(1320,750);
        jf.add(panel);
        jf.setLocationRelativeTo(null);
        jf.setSize(1320,750);
        jf.setVisible(true);
        //JOptionPane.showMessageDialog(null,"X:"+RbGreen.getLocationOnScreen().x+" Y:"+RbGreen.getLocationOnScreen().y,"Axe",JOptionPane.WARNING_MESSAGE);

        btnok.addActionListener(e -> {

            ThreadBlue.start();
            ThreadRed.start();
            ThreadYellow.start();
            ThreadBleu.start();
        });


    }

}

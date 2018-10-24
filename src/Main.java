

import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {

        JFrame jf = new JFrame("Jeu Robot");
        jf.getContentPane().setLayout(new BorderLayout());




        ImageIcon RobotBlue = new ImageIcon("/Users/abdellebay/IdeaProjects/JeuxRobot/Images/RobotBleu.png");
        ImageIcon RobotGreen = new ImageIcon("/Users/abdellebay/IdeaProjects/JeuxRobot/Images/RobotNGGreen.jpg");
        ImageIcon RobotRed = new ImageIcon("/Users/abdellebay/IdeaProjects/JeuxRobot/Images/RobotNGRouge.jpg");
        ImageIcon RobotYellow = new ImageIcon("/Users/abdellebay/IdeaProjects/JeuxRobot/Images/RobotNGYellow.jpg");

        RobotNG RbGreen = new RobotNG("RobotGreen",600,400,"Est",RobotGreen);
        Thread ThreadBlue = new Thread(RbGreen);

        RobotNG RbRed = new RobotNG("RobotRed",300,200,"Est",RobotRed);
        Thread ThreadRed = new Thread(RbRed);

        jf.add(RbGreen,BorderLayout.NORTH);
        jf.add(RbRed,BorderLayout.EAST);
        //jf.add(new JLabel(RobotGreen),BorderLayout.SOUTH);
        //jf.add(new JLabel(RobotRed),BorderLayout.EAST);
        //jf.add(new JLabel(RobotYellow),BorderLayout.WEST);
        jf.pack();
        //jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setSize(1440,820);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        //JOptionPane.showMessageDialog(null,"X:"+RbGreen.getLocationOnScreen().x+" Y:"+RbGreen.getLocationOnScreen().y,"Axe",JOptionPane.WARNING_MESSAGE);

        ThreadBlue.start();
        ThreadRed.start();

    }
}

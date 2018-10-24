

import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {

        JFrame jf = new JFrame("Jeu Robot");
        jf.getContentPane().setLayout(new FlowLayout());

        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(200, 300));


        ImageIcon RobotBlue = new ImageIcon("/Users/abdellebay/IdeaProjects/JeuxRobot/Images/RobotBleu.png");
        ImageIcon RobotGreen = new ImageIcon("/Users/abdellebay/IdeaProjects/JeuxRobot/Images/RobotNGGreen.jpg");
        ImageIcon RobotRed = new ImageIcon("/Users/abdellebay/IdeaProjects/JeuxRobot/Images/RobotNGRouge.jpg");
        ImageIcon RobotYellow = new ImageIcon("/Users/abdellebay/IdeaProjects/JeuxRobot/Images/RobotNGYellow.jpg");

        RobotNG RbGreen = new RobotNG("RobotBlue",0,0,"Est",RobotGreen);
        Thread ThreadBlue = new Thread(RbGreen);

        jPanel.add(RbGreen);
        jf.add(jPanel);
        //jf.add(RbGreen,BorderLayout.NORTH);
       //jf.add(new JLabel(RobotGreen),BorderLayout.SOUTH);
        //jf.add(new JLabel(RobotRed),BorderLayout.EAST);
        //jf.add(new JLabel(RobotYellow),BorderLayout.WEST);
        jf.pack();
        jf.setSize(500,500);
        jf.setVisible(true);
        //JOptionPane.showMessageDialog(null,"X:"+RbGreen.getLocationOnScreen().x+" Y:"+RbGreen.getLocationOnScreen().y,"Axe",JOptionPane.WARNING_MESSAGE);


        ThreadBlue.start();

    }
}

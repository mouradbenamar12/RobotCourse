import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RobotNG extends Robot{

    Random rand = new Random();
    private static RobotNG[] Score = new RobotNG[8];
    protected static int i=0;
    private List<Integer> lstIndexes = new ArrayList<Integer>();
    public RobotNG(String nom)
    {
        super(nom);
    }

    public RobotNG(String nom, int x, int y, String direction, ImageIcon img)
    {
        super(nom, x, y, direction,img);
    }
    /**
     * avance de plusieurs pas
     *
     * @param  pas   le nombre de pas
     */
    public void avance(int pas)
    {

        for (int i = 0 ; i < pas ; ++i) {
            avance();
        } }
    /**
     * tourne à gauche de 260°
     */
    public void gauche()
    {
        droite();
        droite();
        droite();
    }
    /**
     * fait demi-tour
     */
    public void demiTour()
    {
        droite();
        droite(); }



    @Override
    public void run() {
        super.run();
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        int METHODS_QUANTITY = 4;
        for(int i = 1; i <= METHODS_QUANTITY; i++) {
            lstIndexes.add(i);
        }
//you can change the condition for the number of times you want to execute it
        while(true) {

            if (this.getLocation().x>=1245){
                if (!Thread.currentThread().isInterrupted()){
                    Score[i] = this;
                    Thread.currentThread().interrupt();
                    i++;
                    if (i==4){
                        final JFrame frame = new JFrame("Score");
                        String[] columns = {"Score", "Name"};
                        Object[][] data = {
                                {"1", Score[0].getNom()},
                                {"2",Score[1].getNom()},
                                {"3",Score[2].getNom()},
                                {"4",Score[3].getNom()}
                        };

                        JTable table = new JTable(data, columns);
                        JScrollPane scrollPane = new JScrollPane(table);
                        table.setFillsViewportHeight(true);

                        JLabel lblHeading = new JLabel("Score");
                        lblHeading.setFont(new Font("Arial", Font.PLAIN,24));

                        frame.getContentPane().setLayout(new BorderLayout());

                        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
                        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);


                        JButton btn = new JButton("OK");
                        btn.addActionListener(e -> System.exit(0));
                        btn.setSize(50,50);
                        frame.add(btn,BorderLayout.PAGE_END);

                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        frame.setSize(550, 200);
                        frame.setVisible(true);

                    }
                }


            }else avance();
        }

    }
}

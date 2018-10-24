import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RobotNG extends Robot{
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
            Collections.shuffle(lstIndexes);
            for(Integer index : lstIndexes) {
                switch(index) {
                    case 1: droite(); avance(); break;
                    case 2: gauche(); avance(); break;
                    case 3: demiTour(); avance(); break;
                    case 4: avance(); break;
                }
            }
        }

    }
}

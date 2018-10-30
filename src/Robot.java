import javax.swing.*;
import java.awt.*;

class Robot extends JLabel implements Runnable {
    public String getNom() {
        return nom;
    }

    private String nom;
    private int x;
    private int y;
    int i=1;
    private double rot=0.0;
    protected int vitess;
    private static int energie;
    private int capacite=1000;
    private ImageIcon imageIcon;
    private String direction;


    Robot(String nom){
        this.nom=nom;
        x=y=0;
        direction="Est";
    }

    public Robot(String nom, int x, int y, String direction, ImageIcon imageIcon)
    {
        this(nom);
        this.x = x;
        this.y = y;
        if (direction.equals("Nord") || direction.equals("Sud")
                || direction.equals("Ouest"))
            this.direction = direction;  // garder "Est" si direction invalide

        this.imageIcon=resizeimg(imageIcon);
        this.setIcon(this.imageIcon);


    }



    /**
     * avance d'un pas
     */
    public void avance()
    {

            this.setLocation(this.getLocation().x+(int) (Math.random()*30+1),this.getLocation().y);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();

        }
    }
    /**
     * tourne à droite de 90°
     */
    public void droite()
    {
        switch (direction) {
            case "Nord":
                direction = "Est";
                break;
            case "Est":
                direction = "Sud";
                break;
            case "Sud":
                direction = "Ouest";
                break;
            case "Ouest":
                direction = "Nord";
                break;
        }
    }
    /**
     * affiche l'état du robot
     */
    public void afficher()
    {
        System.out.println("nom : " + nom);
        System.out.println("position : (" + x + "," + y +")");
        System.out.println("direction : " + direction);
        System.out.println("Capacite : " + capacite);
        System.out.println("Energie : " + energie);
    }


    public static ImageIcon resizeimg(ImageIcon imageIcon){
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }

    @Override
    public void run() {

    }
}

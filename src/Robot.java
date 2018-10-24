import javax.swing.*;
import java.awt.*;

class Robot extends JLabel implements Runnable {

    private String nom;
    private int x;
    private int y;
    private double rot=0.0;
    protected int vitess;
    private int energie;
    private int capacite;
    protected ImageIcon imageIcon;
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
        this.setLocation(0,0);


    }
    /**
     * avance d'un pas
     */
    public void avance()
    {
        switch (direction) {
            case "Nord":
                this.setLocation(this.getLocationOnScreen().x,this.getLocationOnScreen().y);
                break;
            case "Est":
                this.setLocation(this.getLocationOnScreen().x,this.getLocationOnScreen().y);
                break;
            case "Sud":
                this.setLocation(this.getLocationOnScreen().x,this.getLocationOnScreen().y);
                break;
            case "Ouest":
                this.setLocation(this.getLocationOnScreen().x,this.getLocationOnScreen().y);
                break;
        }

    }
    /**
     * tourne à droite de 90°
     */
    public void droite()
    {
        switch (direction) {
            case "Nord":
                System.out.println("tourne NRD");
                direction = "Est";
                break;
            case "Est":
                System.out.println("tourne EST");
                direction = "Sud";
                break;
            case "Sud":
                System.out.println("tourne SD");
                direction = "Ouest";
                break;
            case "Ouest":
                System.out.println("tourne Ost");
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

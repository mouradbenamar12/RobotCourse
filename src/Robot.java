import javax.swing.*;
import java.awt.*;

class Robot extends JLabel implements Runnable {

    private String nom;
    private int x;
    private int y;
    int i=1;
    private double rot=0.0;
    protected int vitess;
    private int energie;
    private int capacite;
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
        //this.setLocation(100,500);


    }
    /**
     * avance d'un pas
     */
    public void avance()
    {
        while (i==1){
            this.setLocation(70,70);
            i++;
        }

        int fX0 = 0, // left x border
                fX1 = 500, // right x border
                fY0 = 0, // top y border
                fY1 = 500; // bottom y border
        int rX0, rX1, rY0, rY1; // keep these values updated width the rectangles position:
        rX0 = this.getLocation().x;
        rX1 = this.getLocation().x+120;
        rY0 = this.getLocation().y;
        rY1 = this.getLocation().y+120;
// Then, to check if the rect is inside the frame:
        if (
                        rX0 >= fX0 &&
                        rX1 <  fX1 &&
                        rY0 >= fY0 &&
                        rY1 <  fY1
        ) { switch (direction) {
            case "Nord":
                this.setLocation(this.getLocation().x,this.getLocation().y-1);
                break;
            case "Est":
                this.setLocation(this.getLocation().x-1,this.getLocation().y);
                break;
            case "Sud":
                this.setLocation(this.getLocation().x,this.getLocation().y+1);
                break;
            case "Ouest":
                this.setLocation(this.getLocation().x+1,this.getLocation().y);
                break;
        } }
        else {
            System.out.println("******************************************");

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

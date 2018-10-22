
public class RobotNG extends Robot{

    public RobotNG(String nom)
    {
        super(nom);
    }
    public RobotNG(String nom, int x, int y, String direction)
    {
        super(nom, x, y, direction);
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
     * tourne à gauche de 90°
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
    }
}

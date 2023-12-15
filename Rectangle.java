public class Rectangle {
    private Point hg;  // Coin haut gauche
    private Point bd;  // Coin bas droit

    // Constructeur par défaut pour un rectangle par défaut. Choisissez son initialisation.
    public Rectangle() {
        this.hg = new Point();
        this.bd = new Point();
    }

    // Constructeur avec initialisation des coins à partir des paramètres donnés
    public Rectangle(Point h, Point b) {
        this.hg = new Point(h);  // Utilisation du constructeur copie
        this.bd = new Point(b);  // Utilisation du constructeur copie
    }

    // Méthode pour modifier le coin haut gauche du rectangle
    public void setHG(Point h) {
        this.hg = new Point(h);  // Utilisation du constructeur copie
    }

    // Méthode pour modifier le coin bas droit du rectangle
    public void setBD(Point b) {
        this.bd = new Point(b);  // Utilisation du constructeur copie
    }

    // Méthode pour obtenir le coin haut gauche du rectangle
    public Point getHG() {
        return new Point(hg);  // Utilisation du constructeur copie
    }

    // Méthode pour obtenir le coin bas droit du rectangle
    public Point getBD() {
        return new Point(bd);  // Utilisation du constructeur copie
    }

    // Méthode pour afficher les coordonnées des coins du rectangle
    public void afficher() {
        System.out.println("Coin haut gauche : " + hg.toString());
        System.out.println("Coin bas droit : " + bd.toString());
    }

    // Méthode pour calculer la surface du rectangle
    public Double surface() {
        // Calcul de la surface en multipliant la longueur par la largeur
        double longueur = Math.abs(bd.getX() - hg.getX());
        double largeur = Math.abs(bd.getY() - hg.getY());
        return (longueur * largeur);
    }

    // Méthode pour effectuer un zoom (dilatation) des coordonnées du rectangle
    public void zoom(double deltax, double deltay) {
        // Dilatation des coordonnées des coins
        hg.deplacerX(deltax);
        hg.deplacerY(deltay);
        bd.deplacerX(deltax);
        bd.deplacerY(deltay);
    }

    // Méthode pour créer un rectangle droit (coins haut à gauche et bas à droite)
    public static Rectangle creerRectangleDroit(Point hg, Point bd) {
        // Assurez-vous que les points correspondent à un rectangle droit
        double x1 = hg.getX();
        double y1 = hg.getY();
        double x2 = bd.getX();
        double y2 = bd.getY();

        // Trouver les coins haut à gauche et bas à droite du rectangle
        Point hautGauche = new Point(Math.min(x1, x2), Math.min(y1, y2));
        Point basDroit = new Point(Math.max(x1, x2), Math.max(y1, y2));

        // Retourner un nouveau rectangle avec les coins corrects
        return new Rectangle(hautGauche, basDroit);
    }
}

public class TestRectangle {
    public static void main(String[] args) {

        // Création d'un rectangle par défaut
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 :");
        rect1.afficher();
        System.out.println("Surface : " + rect1.surface());

        // Création d'un rectangle avec des points spécifiques
        Point pointHautGauche = new Point(1.0, 3.0);
        Point pointBasDroit = new Point(4.0, 1.0);
        Rectangle rect2 = new Rectangle(pointHautGauche, pointBasDroit);
        System.out.println("Rectangle 2 :");
        rect2.afficher();
        System.out.println("Surface : " + rect2.surface());

        // Modification du rectangle 2 avec la méthode zoom
        rect2.zoom(2, 2);
        System.out.println("Rectangle 2 après zoom :");
        rect2.afficher();
        System.out.println("Surface : " + rect2.surface());

        // Test des méthodes set et get
        Point newHG = new Point(-1.0, 5.0);
        Point newBD = new Point(2.0, 2.0);
        rect2.setHG(newHG);
        rect2.setBD(newBD);
        System.out.println("Rectangle 2 après modification avec set :");
        rect2.afficher();
        System.out.println("Surface : " + rect2.surface());

        // Test des méthodes get
        Point hg = rect2.getHG();
        Point bd = rect2.getBD();
        System.out.println("Coordonnées du coin haut gauche (via get) : " + hg);
        System.out.println("Coordonnées du coin bas droit (via get) : " + bd);
    }
}

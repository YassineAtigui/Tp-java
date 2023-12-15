public class Voiture {
    private String marque;
    private String modele;
    private double vitesse;
    private boolean estDemarree;
    private Roue[] les4Roues;
    private Roue roueDeSecours;
    private Moteur moteur;

    // Constructeur
    public Voiture(String marque, String modele, double vitesse, Moteur moteur) {
        this.marque = marque;
        this.modele = modele;
        this.vitesse = vitesse;
        this.estDemarree = false;
        this.moteur = moteur;

        // Initialisation des roues
        this.les4Roues = new Roue[4];
        for (int i = 0; i < 4; i++) {
            this.les4Roues[i] = new Roue(16, 18);  // Valeurs arbitraires pour largeur et diamètre de jante (class Route)
        }

        // Initialisation de la roue de secours
        this.roueDeSecours = new Roue(16, 18);  // Valeurs arbitraires pour largeur et diamètre de jante  (class Route)
    }

    // Méthodes get
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getVitesse() {
        return vitesse;
    }

    public boolean isEstDemarree() {
        return estDemarree;
    }

    // Méthode pour démarrer la voiture
    public void demarre() {
        estDemarree = true;
        System.out.println("La voiture démarre.");
    }

    // Méthode pour accélérer
    public void accelere(double increment) {
        if (estDemarree) {
            vitesse += increment;
            System.out.println("La voiture accélère. Vitesse = " + vitesse + " km/h");
        } else {
            System.out.println("La voiture n'est pas démarrée.");
        }
    }

    // Méthode pour obtenir la puissance du moteur associé à la voiture
    public int deQuellePuissance() {
        return moteur.getPuissance();
    }

    // Méthode pour changer le moteur
    public void changerLeMoteur(Moteur nouveauMoteur) {
        moteur = nouveauMoteur;
        System.out.println("Le moteur a été changé.");
    }

    // Méthode pour afficher l'état de la voiture
    public void afficherEtat() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Vitesse : " + vitesse + " km/h");
        System.out.println("Est démarrée : " + estDemarree);
        System.out.println("Puissance du moteur : " + moteur.getPuissance() + " CV");
    }
}
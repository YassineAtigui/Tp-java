public class Moteur {
    private String nom;
    private int puissance;

    // Constructeur
    public Moteur(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }

    // Méthodes get
    public String getNom() {
        return nom;
    }

    public int getPuissance() {
        return puissance;
    }

    // Méthode pour déterminer la durée de vie restante
    public int dureeDeVieRestante(int kilometrageActuel) {
        // la durée de vie d'un moteur est de 300 000 km
        int dureeDeVieTotale = 300000;
        return Math.max(0, dureeDeVieTotale - kilometrageActuel);
    }
}
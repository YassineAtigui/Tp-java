public class TestVoiture {
    public static void main(String[] args) {
        // Création d'un moteur
        Moteur moteurVoiture = new Moteur("V6", 200);

        // Création d'une voiture avec le moteur
        Voiture maVoiture = new Voiture("Toyota", "Dacia", 0, moteurVoiture);

        // Affichage de l'état initial de la voiture
        maVoiture.afficherEtat();

        // Démarrage de la voiture
        maVoiture.demarre();

        // Accélération de la voiture
        maVoiture.accelere(30);

        // Affichage de l'état après accélération
        maVoiture.afficherEtat();

        // Obtention de la puissance du moteur associé
        System.out.println("Puissance du moteur : " + maVoiture.deQuellePuissance() + " CV");

        // Changement du moteur
        Moteur nouveauMoteur = new Moteur("V8", 300);
        maVoiture.changerLeMoteur(nouveauMoteur);

        // Affichage de l'état après changement de moteur
        maVoiture.afficherEtat();

        // Test de la durée de vie restante du moteur
        int kilometrageActuel = 155000;
        System.out.println("Durée de vie restante du moteur : " + moteurVoiture.dureeDeVieRestante(kilometrageActuel) + " km");
    }
}

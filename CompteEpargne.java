public class CompteEpargne extends Compte {
    private double taux;

    public CompteEpargne(double solde, Agence lAgence, Client proprietaire, double taux) {
        super(solde, lAgence, proprietaire);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public void calculInteret() {
        double interet = getSolde() * taux / 100;
        deposer(interet);
    }

    public String toString() {
        return "CompteEpargne{" +
                "taux=" + taux +
                "} " + super.toString();
    }
}
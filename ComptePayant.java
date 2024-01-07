public class ComptePayant extends Compte {
    private final double TAUX_OPERATION = 5.0;

    public ComptePayant(double solde, Agence lAgence, Client proprietaire) {
        super(solde, lAgence, proprietaire);
    }

    @Override
    public void deposer(double montant) {
        super.deposer(montant - TAUX_OPERATION);
    }

    @Override
    public void retirer(double montant) {
        super.retirer(montant + TAUX_OPERATION);
    }

    public String toString() {
        return "ComptePayant{} " + super.toString();
    }
}
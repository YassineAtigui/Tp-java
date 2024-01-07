public class Compte {
    private String code;
    private double solde;
    private Agence lAgence;
    private Client proprietaire;

    private static int nbCompte = 0;

    public Compte( double solde,Agence lAgence, Client proprietaire) {
        this.code = this.getClass().getName() + (++nbCompte);
        this.solde = solde;
        this.lAgence = lAgence;
        this.proprietaire = proprietaire;
    }

    public String getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        solde -= montant;
    }

    public String toString() {
        return "Compte{" +
                "code='" + code + '\'' +
                ", solde=" + solde +
                ", lAgence=" + lAgence.getNumero() +
                ", proprietaire=" + proprietaire.getCode() +
                '}';
    }
}
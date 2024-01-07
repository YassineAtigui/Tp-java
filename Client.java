public class Client {
    private String code;
    private String nom;
    private String prenom;
    private String adresse;
    private Agence monAgence;
    private Compte[] mesComptes;
    private int nbComptes;
    private static int nbCliets = 0;

    public Client(String nom,String prenom, String adresse, Agence monAgence) {
        this.code = this.getClass().getName() + (++nbCliets);
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.monAgence = monAgence;
        this.mesComptes = new Compte[5]; // assuming a fixed size for simplicity
        this.nbComptes = 0;
    }

    public String getCode() {
        return code;
    }

    public Compte getCompte(String codeCompte) {
        for (int i = 0; i < mesComptes.length; i++) {
            if (mesComptes[i].getCode() == codeCompte){

                return mesComptes[i];
            }
        }
        return null; // Not found
    }

    public void addCompte(Compte compte) {
        mesComptes[nbComptes++] = compte;
    }

    public void deposer(String codeCompte, double montant) {
        Compte compte = getCompte(codeCompte);
        if (compte != null) {
            compte.deposer(montant);
        } else {
            System.out.println("Compte not found.");
        }
    }

    public void retirer(String codeCompte, double montant) {
        Compte compte = getCompte(codeCompte);
        if (compte != null) {
            compte.retirer(montant);
        } else {
            System.out.println("Compte not found.");
        }
    }

    public int getNbComptes() {
        return nbComptes;
    }

    public String toString() {
        return "Client{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", monAgence=" + monAgence.getNumero() +
                ",nbComptes="+nbComptes+'\'' +
                '}';
    }

    public Compte[] getMesComptes(){
        return mesComptes;
    }

}

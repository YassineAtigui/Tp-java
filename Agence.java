public class Agence {
    private String numero;
    private String adresse;
    private Client[] lesClients;
    private Compte[] lesComptes;
    private int nbClients;
    private int nbComptes;
    private static int nbAgences = 0;

    public Agence(String adresse) {
        this.numero = this.getClass().getName() + (++nbAgences);
        this.adresse = adresse;
        this.lesClients = new Client[100]; // 100 max des clients
        this.lesComptes = new Compte[100]; // 100 max des comptes
        this.nbClients = 0;
        this.nbComptes = 0;
    }
    public String getNumero() {
        return numero;
    }
    public Compte getCompte(String codeCompte) {
        for (int i = 0; i < lesComptes.length; i++) {
            if (lesComptes[i].getCode() == codeCompte){

                return lesComptes[i];
            }
        }
        return null; // Not found
    }

    public Client getClient(String codeClient) {
        for (int i = 0; i < lesClients.length; i++) {
            if (lesClients[i].getCode() == codeClient){

                return lesClients[i];
            }
        }
        return null; // Not found
    }

    public void addCompte(Compte compte) {
        lesComptes[nbComptes++] = compte;
    }

    

    public void addClient(Client client) {
        // Add the client to the array of clients
        lesClients[nbClients++] = client;

        // Add the client's accounts to the array of accounts
        for (Compte compte : client.getMesComptes()) {
            lesComptes[nbComptes++] = compte;
        }
    }


    public int getNbClients() {
        return nbClients;
    }

    public int getNbComptes() {
        return nbComptes;
    }
    public String getAdresse() {
        return adresse;
    }
    public String toString() {
        return "Agence{" +
                "numero='" + numero + '\'' +
                ", adresse='" + adresse + '\'' +
                ", lesClients: "+ nbClients+'\'' +
                ", lesComptes:"+ nbComptes+'\'' +

                '}';
    }
}

public class ApplicationBancaire {
    public static void main(String[] args) {
        // a) Créer une seule agence bancaire
        Agence agence = new Agence("Agence Centrale");
        System.out.println( agence.toString());

        // b) Créer un tableau composé de 4 clients
        Client client1 = new Client("John", "Doe", "Address1", agence);
        CompteEpargne compteEpargne1 = new CompteEpargne(1000, agence, client1, 6);
        client1.addCompte(compteEpargne1);

        Client client2 = new Client("Jane", "Doe", "Address2", agence);
        ComptePayant comptePayant1 = new ComptePayant(2500, agence, client2);
        client2.addCompte(comptePayant1);

        Client client3 = new Client("Alice", "Smith", "Address3", agence);
        ComptePayant comptePayant2 = new ComptePayant(0, agence, client3);
        ComptePayant comptePayant3 = new ComptePayant(3000, agence, client3);
        client3.addCompte(comptePayant2);
        client3.addCompte(comptePayant3);

        Client client4 = new Client("Bob", "Johnson", "Address4", agence);
        CompteEpargne compteEpargne2 = new CompteEpargne(2300, agence, client4, 6);
        ComptePayant comptePayant4 = new ComptePayant(0, agence, client4);
        client4.addCompte(compteEpargne2);
        client4.addCompte(comptePayant4);

        System.out.println( client1.toString());
        System.out.println( compteEpargne1.toString());

        // e) Ajouter les clients à l'agence
        agence.addClient(client1);
        System.out.println( agence.toString());
        agence.addClient(client2);
        System.out.println( agence.toString());
        agence.addClient(client3);
        System.out.println( agence.toString());


        // c) Déposer une somme quelconque dans le(s) compte(s) d'un client
        client1.deposer(compteEpargne1.getCode(), 500);
        client2.deposer(comptePayant1.getCode(), 1000);
        client3.deposer(comptePayant2.getCode(), 500);
        client4.deposer(compteEpargne2.getCode(), 1000);

        // d) Retirer une somme quelconque dans le(s) compte(s) d'un client
        client1.retirer(compteEpargne1.getCode(), 200);
        client2.retirer(comptePayant1.getCode(), 300);
        client3.retirer(comptePayant2.getCode(), 100);
        client4.retirer(comptePayant4.getCode(), 500);

        System.out.println( compteEpargne1.toString());
        
        System.out.println( agence.toString());
        
        


        
}
}

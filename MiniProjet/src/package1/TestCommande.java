package package1;

public class TestCommande {
	public static void main(String[] args) {
Client C1 = new Client(1,"adam","sand","Florida");
Client C2 = new Client(2,"Sarah","backer","France");
Client C3 = new Client(3,"elena","wodly","sweeden");

Produit P1 = new Produit('X','P',17);
Produit P2= new Produit('Q','L',70);
Produit P3 = new Produit('R','L',2);
Produit P4 = new Produit('K','P',30);

LigneCommande L1 = new LigneCommande(P1,40,true);
LigneCommande L2 = new LigneCommande(P2,40,false);
LigneCommande L3 = new LigneCommande(P3,40,true);
LigneCommande L4 = new LigneCommande(P4,40,false);

LigneCommande[] commandes1 = {L1 , L2,L4 };
LigneCommande[] commandes2 = {L1 , L3 };
LigneCommande[] commandes3 = {L3 , L4,L2 };
LigneCommande[] commandes4 = {L1 , L4 };
LigneCommande[] commandes5 = {L4 , L2 };


Commande commande1 = new Commande(1,C1,false,commandes1);
Commande commande2 = new Commande(2,C2,false,commandes2);
Commande commande3 = new Commande(3,C3,false,commandes3);
CommandeUrgente commande4 = new CommandeUrgente(4,C1,false,commandes4);
CommandeUrgente commande5 = new CommandeUrgente(5,C2,false,commandes5);

commande1.livrerCommande();
System.out.println("Détails des clients:\n");
System.out.println(C1);
System.out.println(C2);
System.out.println(C3);
System.out.println("\nDétails des produits:"); 
System.out.println(P1);
System.out.println(P2);
System.out.println(P3);
System.out.println(P4);
System.out.println("\nDétails des commandes:"); 
System.out.println(commande1);
System.out.println(commande2); 
System.out.println(commande3);
System.out.println(commande4);
System.out.println(commande5);



}
}
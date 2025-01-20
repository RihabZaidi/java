package package1;
import java.util.Arrays;

public class Commande {
	
	private int num;
	private Client client;
	private boolean etat;
	private  LigneCommande[] commandes;////tableau d'objet nommé commande de type ligneCommande (classe)
	
	
	
	
 public Commande(int num,Client client,boolean etat, LigneCommande[] commandes) {
	 this.num = num;
	 this.client = client;
	 this.etat = etat;
	 this.commandes = commandes;
 }
 
 public LigneCommande[] getLignes() {//function type of table return table
	 return commandes;
	 
 } 
	 
 
 public boolean getEtat() {
	return this.etat;
 }
 public void livrerCommande() {
	    for (LigneCommande commande : commandes) {
	        if (commande.getQuantite() <= commande.getProduit().getQuantite()) {
	            commande.setEtat(true);
	            commande.getProduit().setQuantite(commande.getProduit().getQuantite() - commande.getQuantite());
	        } else {
	            for (LigneCommande c : commandes) {
	                c.setEtat(false);
	            }
	            break;
	        }
	    }
	}



public String toString() {
	 return "Commande [numéro = " + num + ", client= " + client + ", commandes=" + Arrays.toString(commandes) + ", etat=" + etat + "]";
 }
 
 
}


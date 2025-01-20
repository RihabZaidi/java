package package1;


public class CommandeUrgente extends Commande {
	
	
  public CommandeUrgente(int num,Client client,boolean etat, LigneCommande[] commandes) {
	  super(num,client,etat,commandes);
  }
 
  public String toString() {
	  return  "commande urgente:"+super.toString();
  }
}

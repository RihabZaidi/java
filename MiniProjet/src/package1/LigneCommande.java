package package1;

public class LigneCommande {
	
	private Produit produit;//type produit
	private int qtC;//quantite commande
	private boolean etat;//livree ou non
	
	
	
 public LigneCommande (Produit produit,int qtC,boolean etat) {
	 this.produit = produit;
	 this.qtC = qtC;
	 this.etat = etat;
 }
 
 public Produit getProduit(){
	 return this.produit;//renvoie le produit commande
 }
 public int getQuantite() {
	 return this.qtC;//renvoie la qt commmandée
 }
 
 public boolean getEtat() {
	 return this.etat;// renvoie l'etat de produit livréè ou non
 }
 public void setEtat(boolean NewEtat) {
	 this.etat = NewEtat;//retourner la nouvelle etat d'un produit
 }
 public String toString() { return "LigneCommande[produit=" + produit + ", quantite=" + qtC + ", etat=" + etat + "]";}
 
 
 
 
 
 
 
}

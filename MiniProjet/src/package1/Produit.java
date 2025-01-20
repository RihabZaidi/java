package package1;

public class Produit {
	private char ref;
	private char libelle;
	private int qt;//quantite en stock
	
	//initialisation du constructeur
  
	public Produit(char ref,char libelle,int qt) {
	   this.ref = ref;
	   this.libelle = libelle;
	   this.qt = qt;
	   
   }
   
   //la methode setQuantite qui permet d'additinner une nouvelle quantite non negative dans la quantite en stock;
   
   public void setQuantite(int newQt) {
	   if (newQt >= 0) {
		   this.qt = newQt;
	   }
	   else {
		   System.out.println("la quantite de stock entrer est negative veuillez entrer une valeur positive!"); 
	   }
   }
   //la methode retourne un entier de la quantite en stock
   
   public int getQuantite() {
	   return this.qt;
   }
   public String toString() {
	return "Produit[réference=" + ref + ", libelle=" + libelle + ", quantite=" + qt + "]";
	   
   }
}

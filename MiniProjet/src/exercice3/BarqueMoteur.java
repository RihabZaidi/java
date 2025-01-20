package exercice3;

public class BarqueMoteur extends Barque {
   private int puissance;
public BarqueMoteur(String nom,int numAutorisation,int puissance) {
	super(nom,numAutorisation);
	this.puissance = puissance;
}
public int getPuissance() {
	return puissance;
	}

public String toString() {
	return super.toString()+",puissance= "+puissance;
}

}




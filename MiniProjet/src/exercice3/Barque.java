package exercice3;

public class Barque {
private String nom;
private int numAutorisation;

public Barque(String nom,int numAutorisation) {
	this.nom = nom;
	this.numAutorisation = numAutorisation ;
}

public String toString() {
	return  "le nom du Barque est: "+nom+" \n,le numero du Barque est: "+numAutorisation;
}



}

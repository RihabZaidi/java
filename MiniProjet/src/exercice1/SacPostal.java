package exercice1;
import java.util.ArrayList;



public class SacPostal {

private ArrayList <Lettre> lettres;
private int maxCapacite = 100;
private double maxPoid = 5000.0;

public SacPostal() {
lettres = new ArrayList<>();
}

public boolean ajouterLettre(Lettre lettre) {
	if (lettres.size() < maxCapacite && getPoidTotal() <= maxPoid ) {
		lettres.add(lettre);
		return true ;}
	
	else {
		return false;
	}
	
}
	public double getPoidTotal(){
		double totalPoid = 0;
		for(Lettre lettre : lettres) {
			totalPoid += lettre.getPoid();}
	return totalPoid;
		}
	public double getAffTotal() {
		double totalAff = 0;
		for(Lettre lettre : lettres) {
			totalAff += lettre.getValeurAffr() ;}
	return 	totalAff;
	}
	
	public String toString() {
		String resultat="";
		resultat += "Poid Total: "+getPoidTotal()+("g\n");
		resultat += "Affranchissement Total: "+getAffTotal()+" Dinar\n";
		
		resultat += "Contenu:\n ";
		for(Lettre lettre : lettres) {
			resultat += lettre.toString() + "\n";}
		return resultat;
		
		 
	}
}
	






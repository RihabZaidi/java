package exercice3;

import java.util.ArrayList;
import java.util.List;

public class Port {
private String nom;
private double capacity;
private List<Barque> barques;

public Port(String nom, int capacity) {
	this.nom = nom;
	this.capacity = capacity;
	this.barques = new ArrayList<>();}
	
	
	public boolean ajouterBarque(Barque barque) {
		if(barques.size() < capacity) {
			barques.add(barque);
			return true;
		}
		else {
			System.out.println("over capacity");
			return false;
		}
		}
	
	
	
	
	
	public double calculTaxe() {
		double taxeTotal = 0;
		for(Barque barque : barques) {
			if(barque instanceof BarqueMoteur) {
				int puissance = ((BarqueMoteur) barque).getPuissance();
				if(puissance < 5) {
					taxeTotal += 100* 0.1;
				}
				else if (puissance >= 5) {
					taxeTotal += 100 * 0.2;
				
				}}
				else {
					taxeTotal += 100;
				}
			}
		return taxeTotal;
	}
	public String toString() {
		return "nom = "+nom+"\ncapacité= "+capacity+"\nbarques= "+barques;
				
	}
}







package exercice1;

public class Lettre {
	private String adD,adE;
	private double poid;
	private double affr;

	public Lettre(String adD,String adE,double poid) {
		this.adD = adD;
		this.adE = adE;
		this.poid = poid;
		this.affr = getValeurAffr();
	}
	
	
	public void  determine_aff() {
		double affr1 = 0.250;
		double affr2 = 0.500;
		double affr3 = 1; 
		
		if(poid <= 50) {
			this.affr = affr1;
		}
		else if(poid > 50 && poid <= 100) {
			this.affr = affr2;
		}
		else {
			this.affr = affr3;
		}
	}
	
	public double getValeurAffr() {
		return  affr;
	}
	public double getPoid() {
		return this.poid;
	}
	public String toString() {
		return  "La lettre postale: \n addresse destinataire = "+adD+" \n addresse expéditeur = "+adE+" \n affranchissement = "+affr;
	}
}

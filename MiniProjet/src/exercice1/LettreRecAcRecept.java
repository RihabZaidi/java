package exercice1;

public class LettreRecAcRecept extends LettreRecommandée{
private String adR;
private double frais;
public LettreRecAcRecept (String adD,String adE,double poid,double nbrRec,String adR,double frais) {
	super(adD,adE,poid,nbrRec);
	this.adR = adR;
	this.frais = frais;
}
public void  setFrais(double nvFrais) {
	 nvFrais = frais;
}
public void modifierFrais() {
	 this.frais = frais;
}
public String toString() {
	return (super.toString()+" \n addresse de retour= "+adR+" \n,frais acuse reception= "+frais);
}
}

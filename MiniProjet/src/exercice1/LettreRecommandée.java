package exercice1;

public class LettreRecommandée extends Lettre {
private double nbrRec ;
public  LettreRecommandée(String adD,String adE,double poid,double nbrRec ) {
	super( adD, adE, poid);
	this.nbrRec = nbrRec;
}
public void setMontant(double nvNbrRec) {
	nvNbrRec = nbrRec;
}
public String toString() {
	return (super.toString()+" \n le montant est "+nbrRec+" dinars");
}

}


package exercice1;

public class TestPost {

	public static void main(String[] args) {
		
	SacPostal S = new SacPostal();
	Lettre L1 = new Lettre("ad1","ad2",10.0);
	LettreRecommandée L2 = new LettreRecommandée("d1","d2",2.1,4.0);
	LettreRecAcRecept L3 = new LettreRecAcRecept("ad1","ad2",10.0,10,"adr3",20);
	
	L3.modifierFrais();
	S.toString();
	
	
	}
	}
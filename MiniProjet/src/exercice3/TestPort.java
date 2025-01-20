package exercice3;



public class TestPort {

	public static void main(String[] args) {
		Port port = new Port("port de peche",3);
        
		
		Barque barque1 = new Barque("barque1",2);
		BarqueMoteur barque2 = new BarqueMoteur("barque2",12,8);
		
		port.ajouterBarque(barque1);
		port.ajouterBarque(barque2);
		
		System.out.println(port);
		System.out.println("taxe totale: " +port.calculTaxe() + "dinars");
		
	}

}

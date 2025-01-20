package exercice1;

public class Test {

	public static void main(String[] args) {
		
			Account a1 = new Account(1000);
			Account a2 = new Account(20000);
			a1.deposer(2000);
			a2.retirer(1000);
			a1.ajouter_interet(200);
			System.out.println(a1.getBalance());
			System.out.println(a2.getBalance());

	}

}

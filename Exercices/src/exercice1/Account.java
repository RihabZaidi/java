package exercice1;

public class Account { 
	private double balance;
	
	
	
	public Account() {
		balance = 0;
	}
	public Account(double balanceInitial){
    	balance = balanceInitial;
    }
   public double getBalance() {
	   return balance;
   }
	public void deposer(double montant) {
	   balance += montant;	
	}
	public void retirer(double montant) {
		balance -= montant;
	}
	public void ajouter_interet(double taux){
		balance = balance*(1+taux);
		
	}}
	

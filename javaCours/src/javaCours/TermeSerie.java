package javaCours;

import java.util.Scanner;

public class TermeSerie {

	public static void main(String[] args) {
		Scanner R = new Scanner (System.in);
		 
		
		 
		 
		 System.out.println("Veuillez entrer n: ");
		 int  n = R.nextInt();
		 double s = 0;
		 for (double i = 1;i<=n;i++) {
			  s += 1 / i;
		 }
System.out.println("la somme de cette serie est: " +  s);
	}

}

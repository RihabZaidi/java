package javaCours;

import java.util.Scanner;

public class RacineCarres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		 
	
		 
		 
		 System.out.println("Veuillez entrer un nombre positif: ");
		 int  nbr = sc.nextInt();
		 
		 if (nbr > 0) {
		System.out.println("le log de " +nbr+ " est "  +Math.sqrt(nbr)); 
		 }
		 else if (nbr < 0) {
			 System.out.println("donner un nombre positif.");
		 }
		 else {
			 System.out.println("la valeur entree est nulle donc on quite le programme.");
		 }
		 while (nbr!=0);
		 sc.close();
	}

}

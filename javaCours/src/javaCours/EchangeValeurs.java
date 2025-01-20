package javaCours;

import java.util.Scanner;

public class EchangeValeurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Bonsoir!");
		 
		 
		 System.out.println("Veuillez saisir a: ");
		 int  a = sc.nextInt();
		 
		 System.out.println("Veuillez saisir b");
		 int  b = sc.nextInt();
		 
		
		 
		 int aux;
		 aux = a;
		 a = b;
		 b=aux;
		 System.out.println("a = "+a );
		 System.out.println("b = "+b );
		 
		 
		 
		 
	}

}

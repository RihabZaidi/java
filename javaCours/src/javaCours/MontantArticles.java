package javaCours;
import java.util.Scanner;
public class MontantArticles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Bonsoir!");
		 
		 
		 System.out.println("Veuillez saisir le premier nombre: ");
		 int  ent1 = sc.nextInt();
		 
		 System.out.println("Veuillez saisir le deuxieme nombre ");
		 int  ent2 = sc.nextInt();
		 
		 
		 int sous1 = ent1 - ent2;
		 System.out.println(ent1+ " - "+ ent2 +" = "+ sous1);
		 int sous2 = ent2 - ent1;
		 System.out.println(ent2+ " - "+ ent1 +" = "+ sous2);
		 int multip = ent1 * ent2;
		 System.out.println(ent1+ " * "+ ent2 +" = "+ multip);
		 int add = ent1 + ent2;
		 System.out.println(ent1+ " + "+ ent2 +" = "+ add);
		 int div1 = ent1/ent2;
		 System.out.println(ent1+ " / "+ ent2 +" = "+ div1);
		 int div2 = ent1/ent2;
		 System.out.println(ent2+ " / "+ ent1 +" = "+ div2);
		 
		 System.out.println("Au revoir!");
	}

}

package javaCours;
import java.util.Scanner;

public class LimitPrimitif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner (System.in);
 
 System.out.println("enter la longueur du rectangle: ");
 int  longueur = sc.nextInt();
 
 System.out.println("enter la lorgeur du rectangle: ");
 int  largeur = sc.nextInt();
 
 int perimetre = (largeur+longueur)*2;
 int surface = largeur*longueur;
 
 System.out.println("le perimetre d'un rectangle de largeur "+largeur+" et longueur "+longueur+" est: "+perimetre);
 System.out.println("le surface d'un rectangle de largeur "+largeur+" et longueur "+longueur+" est: "+surface);
 
 
 
 
 
 
 
 
	}

}

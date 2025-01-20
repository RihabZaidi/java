package javaCours;
import java.util.Scanner;

public class Exx1 {

	public static void main(String[] args) {
		int n;
		int[] vect = {1,2,3,4,5,6,7};
Scanner scanner = new Scanner(System.in);
System.out.println("entrer la taille du table ");
     n = scanner.nextInt();
     
     for (int i=0 ;i<n;i++) {
    	 System.out.println(vect[i]+" ");
     }
	}
	
	int n;
	int[][] vect2 = new int [3][2];
	vect2[0][0]=10;
	vect2[0][1]=20;
	
Scanner scanner = new Scanner(System.in);
System.out.println("entrer la taille du table ");
 n = scanner.nextInt();
 
 for (int i=0 ;i<n;i++) {
	 System.out.println(vect[i]+" ");
 }
 
 
	

}

package pk2;
import java.util.Scanner;
public class Triangle {
	
	public static void main(String [] args) {
 Scanner sc = new Scanner(System.in);
  /*System.out.print("entrer dimensions du triangle: ");
  int h1 = sc.nextInt();
  int h2 = sc.nextInt();
  
  
  int s = h1+h2;
  System.out.println("le surface est: "+s);
  int p = h1 * h2;
  System.out.println("le perimetre est: "+p);
}*/
	/*	int vect[] = {1,2,5,7};
		int [] vect1 ;
		vect2 = new int[10];*/
	/*System.out.println("entrer la taille du tableau: ");
	int t = sc.nextInt();
	int [] Tab = new int [t];
	for (int i =0 ;i<Tab.length;i++) {
		Tab[i] = 2+i;
	
	System.out.println("Tab[i] = "+Tab[i]);}
	int max = 0;
	
	for (int i =0 ;i<Tab.length;i++) {
		if(max > Tab[i]) {
			max = Tab[i];
		}
		System.out.println("le tableau aprés trie :");
		System.out.println("Tab[i] = "+Tab[i]);
	}*/
	int [][] T =  {{1,2,3}, {4,5,6}};
	for (int i =0 ;i<T.length;i++) {
		for (int j =0 ;j<T.length;j++) {
	System.out.println(T[i][j]);}}
	
}}

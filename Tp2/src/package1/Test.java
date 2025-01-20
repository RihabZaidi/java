package package1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s;
		/*System.out.println("enter ur name");
		String name= scanner.nextLine(); 
		System.out.println("hello "+name);
		
		System.out.println("enter first integer");
		int x = scanner.nextInt();
		
		System.out.println("enter second integer");
		int y = scanner.nextInt();
		s=x*y;
		System.out.println("le produit est "+s);*/
		
		
		System.out.println("enter ur name");
		
      String name = scanner.nextLine();
      System.out.println("enter ur prenom");
      String prenom = scanner.nextLine();
      
      System.out.println("le nom en majuscule est "+name.toUpperCase());
      char[] s = prenom.toCharArray();
      
      s[0]= Character.toUpperCase(s[0]);
      for(int i=1;i<=s.length;i++) {
    	  s[i]=Character.toLowerCase(s[i]);
      }
      System.out.println(" prenom after modification is: ",s);
      
      
	}

}

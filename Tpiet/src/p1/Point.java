package p1;

public class Point {
      double abs;
      double ord;
      static int nbp=0;
		
public String toString() {
	return "point [abs=" + abs+ " ,ord= "+ord +"]";
  
}

System.out.println(" Manipulation d'un simple point"); 

void deolace(double abs, double ord) {
abs+=abs;
ord+=ord;
}
}

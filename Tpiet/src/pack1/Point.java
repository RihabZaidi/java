package pack1;

public class Point {
public int abs;
public int ord; 

//initialisation du constructeur 
public Point(Point p) {
	abs=p.abs;
	ord=p.ord;}

Point(int a){
	abs=ord=a;
}
Point (int a,int b){
	abs=a;
	ord=b;
}

	//affichage
	public void affich() {
		System.out.println("la point est de cordonnees:("+abs+","+ord+")");
	}
}






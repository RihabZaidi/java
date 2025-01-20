package tp1;

import java.util.Vector;


class Point{
	double abs , ord;
	
	Point(){
		abs = ord =0.0;
	}
	Point(double a){
		abs = ord =a;
	}
	Point(double a , double b){
		abs = a;
		ord = b;
	}
	
	public Point(Point p) {
		abs = p.abs;
		ord = p.ord;
		
	}
	public String toString() {
		return "point [abs =" +abs+", ord=" + ord +"]";
	}
	public void affiche() {
		System.out.println(toString());
	}
	public double distance(Point p) {
		return Math.sqrt(Math.pow((p.abs-abs),2)) + (Math.pow(p.ord-ord), 2)));
	}
}
public class test{
	public static void main (String [] args) {
		Point p1 = new Point();
		Point p2 = new Point (3.5);
		Point p3 = new Point (4.2,6);
		Point p4 = new Point (-1.5,7.2);
		Point p5 = new Point (p3);
		
	}
}









	






public class Point {

	public static void main(String[] args) {
		

	}

}

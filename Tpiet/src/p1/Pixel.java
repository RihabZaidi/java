package p1;
package p1.java.*;

public class Pixel extends Point {
 String coul;
 public String toString() {
	 return "point ["+abs+", "+ord+"], la couleur est: "+coul;
 }
 System.out.println(" Manipulation d'un pixel"); 
 
 Pixel (double abs,double ord,String coul){
	 this.abs=abs;
	 this.ord= ord;
	 this.coul=coul;
	 
 }
 
}

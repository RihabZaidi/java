package pk1;

public class PointMere {
	public void setPoint(int x,int y ) {
		this.x=x;
		this.y=y;}
	public void deplace(int dx,int dy ) {
			x+=dx;
			y+=dy;
		}
		
   public void 	affCoord () {
	   System.out.println("coordonnees:"+x+" "+y);
   }
   private int x,y;
	}
	



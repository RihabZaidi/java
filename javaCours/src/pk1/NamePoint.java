package pk1;

public class NamePoint extends PointMere {
	private char nom;
	
	public void setNamePoint(int x,int y,char nom) {
		setPoint(x,y);
		this.nom = nom;
	}
	public void setName(char nom) {
		this.nom = nom;
	}
	public void affNameCoord() {
	System.out.println("point de nom"+nom+" ");
	affCoord();
	
	}
	
	
}

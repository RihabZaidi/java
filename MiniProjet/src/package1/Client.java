package package1;

public class Client {
   private int num;
   private String Nom;
   private String prenom;
   private String adress;
public Client(int num,String nom,String prenom,String adress) {
	  this.num = num;
	  this.Nom = nom;
	  this.prenom = prenom;
	  this.adress = adress;
  }
  public  String toString() {
	  return "le numero du client est "+num+ " , son nom est "+Nom+" , son prenom est "+prenom+" et son adresse est "+adress; }
}



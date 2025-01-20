package javaCours;

public class Main1 {

	public static void main(String[] args) {
		Human human1 = new Human("ela",65,70); 
        Human human2 = new Human("adam",24,80);
        System.out.println(human1.name);
        human2.drink();
        human2.eat();
	}

}

package javaCours;
import java.util.*;

public class MainArray {

	public static void main(String[] args) {
ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> backerylist= new ArrayList();
        backerylist.add("bread");
        backerylist.add("croissant");
        backerylist.add("millefeuille");
        
        
        ArrayList<String>producelist= new ArrayList();
        producelist.add("tomatoes");
        producelist.add("zuchini");
        producelist.add("potatoes");
	

		ArrayList<String> drinklist= new ArrayList();
	   drinklist.add("soda");
	    drinklist.add("juice");
	    drinklist.add("milk");

	    groceryList.add(backerylist);
	    groceryList.add( producelist);
	    groceryList.add(producelist);
	    System.out.println(groceryList.get(0).get(1));
	}

}

package module6;

import java.util.ArrayList;
import java.util.List;

public class specificArray {

	public static void main(String[] args) {
		
		List<String>list_String= new ArrayList<String>();
		list_String.add("red");
		list_String.add("Green");
		list_String.add("yellow");
		list_String.add("White");
		list_String.add("black");
		
		 	System.out.println(list_String);
		 	list_String.set(2,"pink");
		 	
		 	System.out.println(list_String);
		// TODO Auto-generated method stub

	}

}

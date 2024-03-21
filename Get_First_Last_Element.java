package Set_programs;

import java.util.TreeSet;

public class Get_First_Last_Element {
public static void main(String[] args) {
	TreeSet<String> ref=new TreeSet();
	ref.add("Red");
	ref.add("blue");
	ref.add("green");
	System.out.println(ref);
	
	String first_Element=ref.first();
	System.out.println(first_Element);
	
	String last_Element=ref.last();
	System.out.println(last_Element);
}

}

//Get the number of elements in a hash set
package Set_programs;

import java.util.HashSet;

public class GetNumberOfElement {
	public static void main(String[] args) {
		
		HashSet ref=new HashSet();
		ref.add("blue");
		ref.add("red");
		ref.add("black");
		ref.add("white");
		
		System.out.println(ref);
		System.out.println(ref.size());
	}

}

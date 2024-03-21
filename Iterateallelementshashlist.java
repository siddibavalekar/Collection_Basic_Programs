//Iterate through all elements in a hash listIterate through all elements in a hash list

package Set_programs;

import java.util.HashSet;
import java.util.Iterator;

public class Iterateallelementshashlist {
public static void main(String[] args) {
	HashSet ref=new HashSet();
	ref.add("blue");
	ref.add("red");
	ref.add("black");
	ref.add("white");
	
	Iterator<String> it=ref.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
}
}

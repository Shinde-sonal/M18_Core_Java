package collectionFrameworks;
import java.util.*;
public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>ts = new TreeSet<String>();
		ts.add("This");
		ts.add("Book");
		ts.add("is");
		ts.add("very helpful");
		ts.add("for");               //TreeSet doesn't maintain the insertion order.
		ts.add("me");
		
		//Traversing elements 
		Iterator<String>itr = ts.iterator();
		while(itr.hasNext()) {		
			System.out.println(itr.next());
		}

	}
}

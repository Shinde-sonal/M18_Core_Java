package collectionFrameworks;
import java.util.*;
public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating HashSet and adding elements.
		
				HashSet<String>hs = new HashSet<String>();
				
				hs.add("this is");
				hs.add("for");
				hs.add("me");
				hs.add("is");
				hs.add("very helpful");        //HashSet doesnt maintain the insertion order. 
				
				//Traversing elements 
				Iterator<String>itr = hs.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
	}

}

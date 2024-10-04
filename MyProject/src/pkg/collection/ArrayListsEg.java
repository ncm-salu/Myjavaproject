package pkg.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ar =  new ArrayList();
         ar.add("White");
         ar.add("Red");
         ar.add("Yellow");
         ar.add("Black");
         ar.add("Purple");
         System.out.println(ar);
         System.out.println( ar.get(2));
         System.out.println( ar.remove(3));
         System.out.println(ar);
         System.out.println(ar.contains("blue"));
         
         Iterator it = ar.iterator();
         while(it.hasNext())
         {
        	   System.out.println(it.next()); 
         }
        
         
	}

}

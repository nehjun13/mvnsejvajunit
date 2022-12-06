package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.junit.Test;

public class set_Hashset {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void main(){
//removes duplicates
		Set<String> strset= new HashSet();
		strset.add("a");
		strset.add("b");
		strset.add("b");
		strset.add("c");
		strset.add("d");
		Iterator<String> it = strset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}

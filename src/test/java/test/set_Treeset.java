package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import apple.laf.JRSUIUtils.Tree;

public class set_Treeset {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void main(){
//removes duplicates and sorts
		TreeSet<String> strtreeset = new TreeSet<String>();
		strtreeset.add("aqwqwqw");
		strtreeset.add("bsdasd");
		strtreeset.add("bsadas");
		strtreeset.add("casdasd");
		strtreeset.add("dsdas");
		Iterator<String> it = strtreeset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}

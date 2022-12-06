package test;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class arrayList {

	//public static void main(String[] args) {
	@Test
	public void main(){
		// TODO Auto-generated method stub

		ArrayList<String> LstArrayList= new ArrayList <String>();
		LstArrayList.add("test1");
		LstArrayList.add("test2");
		LstArrayList.add("test3");
		LstArrayList.add("test4");
		LstArrayList.add("test5");
		for (int i=0;i<LstArrayList.size();i++) {
			System.out.println(LstArrayList.get(i));
		}
		
		Iterator<String> itr=LstArrayList.iterator();  
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

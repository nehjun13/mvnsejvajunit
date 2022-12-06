package test;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

public class linkedList {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void main(){
		LinkedList<String> lstlinkedlist = new LinkedList<String>();
		lstlinkedlist.add("a");
		lstlinkedlist.add("b");
		lstlinkedlist.add("b");
		lstlinkedlist.add("c");
		lstlinkedlist.add("d");
		Iterator<String> it = lstlinkedlist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

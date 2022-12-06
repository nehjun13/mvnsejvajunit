package test;

import java.util.Enumeration;
import java.util.Hashtable;

import org.junit.Test;

public class hashtable {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void main(){
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Username", "abc");
		ht.put("password", "pw");
		// ht.put("address", null);
		System.out.println(ht.get("Username"));
		Enumeration<String> e = ht.keys();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key + "-----" + ht.get(key));

		}
	}

}

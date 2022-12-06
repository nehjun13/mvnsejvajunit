package test;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class hashmap {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void main(){
		HashMap<String, String> map= new HashMap<String, String>();
		map.put("Username", "abc");
		map.put("password", "pw");
		map.put("address", null);
		map.put("domain", "QA test");
		map.put(null, "Automation");

		Set<String> s=map.keySet();
		
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			String key=(String)it.next();
			System.out.println(key+"------"+map.get(key));
		}
		
	}
}

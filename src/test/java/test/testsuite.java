package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.github.dockerjava.api.model.Driver;

import methods.generic;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({arrayList.class,draganddrop.class,e2e_purchasesingleitem.class,hashmap.class, hashtable.class, linkedList.class,screenshot.class,
	set_Hashset.class,set_LinkedHashset.class,set_Treeset.class,test.class  })
public class testsuite extends generic{
	@BeforeClass
	public static void message() {
		System.out.println("to be tested through Junit");
	}
	@AfterClass
	public static void messagequit() {
		try{driver.close();}
		catch (Exception e){
			System.out.println("driver not open");
		}
	}

}

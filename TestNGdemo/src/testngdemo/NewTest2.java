package testngdemo;

import java.util.logging.Logger;

import org.testng.annotations.Test;

public class NewTest2 {
	
         public Logger Log = Logger.getLogger(Log.class.getName());


  
 
	@Test(priority=3)// skipping the method
  public void f1() {
		DOMConfigurator.configure("log4j.xml");
		  Log.info("New driver instantiated");
		  
		System.out.println("first method");
  }
	

	@Test(priority=2)
  public void f2() {
		System.out.println("second method");
  }
	

	@Test(priority=1)
  public void f3() {
		System.out.println("third method");
  }
	

	@Test(priority=0)
  public void f4() {
		System.out.println("fourth method");
  }
}

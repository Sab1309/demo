package testngdemo;

import org.testng.annotations.Test;

public class NewTest1 {
  
	
	@Test(priority=1,enabled=false)
  public void test1() {
		System.out.println("this is test 1");
  }
	
	@Test(priority=3)
	  public void test2() {
		System.out.println("this is test 2");
	  }
	
	@Test(priority=2)
	  public void test3() {
		System.out.println("this is test 3");
	  }
	
	@Test(priority=0)
	  public void test4() {
		System.out.println("this is test 4");
	  }
	
	@Test(priority=4)
	  public void test5() {
		System.out.println("this is test 5");
	  }
	
	
	
	
	
}

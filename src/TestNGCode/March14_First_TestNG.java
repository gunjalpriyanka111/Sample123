package TestNGCode;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class March14_First_TestNG {
	
  @Test(groups = {"basic"},priority = 3)         // basic is a grp. which will run when we include it
  public void Hello() {
	  System.out.println("function Hello");
  }


@Test(priority = 1)               //if priority is not given then it will consider priority=0 
public void hii() {
	  System.out.println("function hii");
}

@Test(priority = 2)
public void by() {                          //it will not run  bcoz we exclude it in xml file
	  System.out.println("function by");
}

@Test(priority = -4)              // minus is less than 0 .. so it will run before prio=0
public void gone() {
	  System.out.println("function gone");
}

@Test(priority = 4,enabled=false)    // not run bcoz we enabled it
public void hello() {
	  System.out.println("function hello");
}
@BeforeMethod
public void bm() {
	  System.out.println("Before any method");
}

@AfterMethod
public void am() {
	  System.out.println("After any method");
}
}
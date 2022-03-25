package TestNGCode;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstProg {
 
	
	@Test(priority=1)
	public void F() {
		System.out.println("Function F");
	}

	@Test                      
	// it will consider priority=0
	public void HELLO() {
		System.out.println("Function HELLO");
	}

	@Test(priority=-1)
	public void BYE() {
		System.out.println("Function BYE");
	}

	@Test(priority=2,enabled=false)                //it will not execute
	public void GONE() {
		System.out.println("Function GONE");

	}
	@BeforeMethod
		public void BM() {
			System.out.println("Before any method");
			}
	
			@AfterMethod
			public void AM() {
				System.out.println("After any method");
				
			
		}
	}

package TestNGCode;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class March19_Assert {
  @Test(dataProvider = "dp")
  public void hard(Integer m, Integer n,Integer o) {
	  Integer add=m+n;
	  Assert.assertEquals(add, o);
	  System.out.println("Just after Hard assert");           //Hard assert will not execute the result once it is failed
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 11, 2,3},
      new Object[] { 2, 4,6 },
      new Object[] { 2, 7,6 },
      new Object[] { 22, 4,26 },


    };
  }
  
  @Test(dataProvider = "dp")
  public void soft(Integer m, Integer n,Integer o) {
	  Integer add=m+n;
	  SoftAssert as=new SoftAssert();                //soft assert will execute the result although it is failed
	  as.assertEquals(add, o);
	  System.out.println("Just after soft assert");
  }
  
  
  
  
  
  
  
  
  
}

package TestNGCode;

import org.testng.annotations.Test;

public class March16_Dependencies {
	int x=100,y=200;
  @Test(groups = {"basic"})
  public void add() {
	  System.out.println("Addition is "+(x+y));
	  }
  
  @Test(groups = {"basic"})
  public void sub() {
	  System.out.println("Subtraction is "+(x-y));	  
  }
  
  @Test(groups = {"basic"})
  public void Div() {
	  System.out.println("Division is "+(x/y));	  
  }
  
  @Test(groups = {"basic","Area"})                //This multi. method is in the both grps. basic & Area .. so it will run @ both time
  public void Mul() {
	  System.out.println("Multiplication is "+(x*y));	  
  }
  
  @Test(groups = {"Area"})
  public void RectArea() {
	  System.out.println("Area is "+(x*y));	  
  }
  
  
  @Test(groups = {"Area"})
  public void sqrArea() {
	  System.out.println("Area is is "+(x*x));	  
  }
  
  
  
  
  
  
  
  
  
  
}

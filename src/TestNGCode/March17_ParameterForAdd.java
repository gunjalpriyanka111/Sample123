package TestNGCode;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class March17_ParameterForAdd {
  @Test
  @Parameters({"num1","num2"})
  public void f(int n1,int n2) {
	  System.out.println("Addition is" +(n1+n2));
  }
}

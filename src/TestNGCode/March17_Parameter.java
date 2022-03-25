package TestNGCode;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class March17_Parameter {
	WebDriver driver=null;
  @Test
  @Parameters({"browser","cpath","mpath"})
  public void f(String br,String chromepath) {
	  if(br.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver(); 
	  }
	  else {
		  System.setProperty("webdriver.gecko.driver", mozilapath);
		  driver=new FirefoxDriver();
		  
	  }
  }


@Test(dependsOnMethods = {"f"})
@Parameter({"site"})
public void f2(String site, String srch) {
	driver.get(site);
	driver.findElement(By.xpath("//*[name='q']")).sendKeys(srch);
	driver.findElement(By.xpath("//*[name='q']")).submit();
}
}
package TestNGCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class March15_DependentMethod {
	 WebDriver driver;
	 
	 @Test()
	  public void init() {        //init is a method of initialisation
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.google.com");
		 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium 4.0");
		 driver.findElement(By.xpath("//*[@name='q']")).submit();
		 
	  }
	  
	  @Test(dependsOnMethods = "init")                //display method will run after init method bcoz we show dependency
	  public void display() {
		  String str= driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
		  System.out.println("Search result: "+str);
		  
	  }
  }


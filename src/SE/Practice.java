package SE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.get("https://www.google.com");
	//	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Testing");
	//	driver.findElement(By.xpath("//input[@name=\"q\"]")).submit();      // google search cha button 
//	String result=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();       //to display the figure of search result i.e. eg.34000000
	//System.out.println(result);
//driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("gunjalpriyanka111@gmail.com");driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345678");
//driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
//driver.findElement(By.xpath("//input[@id=\"email\" and @name=\"email\"] ")).sendKeys("gpriyankastar@gmail.com");

	driver.get("https://www.naukri.com");
	driver.findElement(By.xpath("//*[@class=\"mTxt\"]")).click();
	driver.findElement(By.xpath("//a[@title=\"Jobs by Category\"]")).click();
	
	}

}



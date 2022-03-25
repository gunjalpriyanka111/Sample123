package SE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_l {

	public static void main(String[] args) {
		String path ="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" , path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("12345"); 
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("8484");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		

	}

}

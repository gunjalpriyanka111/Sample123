package SE;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class And_Or_xpath {

	public static void main(String[] args) {
	String path ="E:\\selenium\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//input[@name=\"email\" and @type=\"text\" or id=\"email\"]")).sendKeys("123456789");
driver.findElement(By.xpath("//input[@type=\"password\" and @id=\"pass\"]")).sendKeys("987654");
driver.findElement(By.linkText("Forgotten password?")).click();








	}
	
	
	
}

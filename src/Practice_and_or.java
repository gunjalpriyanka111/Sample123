import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_and_or {

	public static void main(String[] args) {
	String path="E:\selenium.chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//input[@type=\"password\" and @id=\"pass\"]")).sendKeys("12345");   // not working
driver.findElement(By.id("pass")).sendKeys("12345");     //not working
driver.findElement(By.id("pass")).submit();   //not working

	}

}

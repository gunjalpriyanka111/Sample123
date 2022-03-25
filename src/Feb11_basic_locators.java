import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb11_basic_locators {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//a[@id=\"createacc\"]")).submit() ; // x path of create account ... not working.. ask sir
		
		
		
		
		

	}

}

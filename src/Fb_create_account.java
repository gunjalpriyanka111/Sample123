import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_create_account {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");
driver.findElement(By.partialLinkText("Create New Account")).click();
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("priyanka");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("gunjal");
driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("8484899321");
driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
	}

}

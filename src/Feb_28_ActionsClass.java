import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Feb_28_ActionsClass {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.get("https://www.google.com/");
Actions act=new Actions(driver);
driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Selenium");
act.sendKeys(Keys.TAB).build().perform();
driver.findElement(By.xpath("//*[@name=\"q\"]//following::input[3]")).click();

	}

}

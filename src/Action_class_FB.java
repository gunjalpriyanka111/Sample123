import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_FB {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		
		act.keyDown(ele,Keys.SHIFT).sendKeys("priyanka").keyUp(ele,Keys.SHIFT).build().perform();
			act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();


	}

}

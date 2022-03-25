import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class March_01_actionClass {

	public static void main(String[] args) {
		
			String path="E:\\selenium\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//driver.get("https://www.facebook.com/");
			Actions act=new Actions(driver);
		
	//	act.moveToElement(driver.findElement(By.xpath("//*[text()=\" Meta )))"
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				WebElementele=driver.findElement(By.xpath("//a[text()=\" BANK \"] "));
				WebElement ele2=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
				 //WebElement ele2=driver.findElement(By.partialLinkText("BANK"));
			act.dragAndDrop(ele, ele2).build().perform();
			act.moveToElement(driver.findElement(By.xpath("//*)))
				
	}
	

}

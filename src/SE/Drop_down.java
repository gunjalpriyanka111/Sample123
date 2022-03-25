package SE;

import java.time.Year;
import java.time.YearMonth;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) {
		String path ="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	
	driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Select day=new Select(driver.findElement(By.xpath("//select[@title=\"Day\"]")));
		//day.selectByValue("8");
		//Thread.sleep(3000);
		day.selectByVisibleText("8");
		Select month=new Select(driver.findElement(By.xpath("//select[@title=\"Month\"]")));
		//month.selectByValue("7");
		month.selectByVisibleText("Jul");
		Select year=new Select(driver.findElement(By.xpath("//select[@title=\"Year\"]")));
		//year.selectByValue("1995");
		year.selectByVisibleText("1995");

		
		
	}

}

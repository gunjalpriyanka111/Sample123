package SE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_day3 {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("gpriyankastar@gmail.com");



	}

}

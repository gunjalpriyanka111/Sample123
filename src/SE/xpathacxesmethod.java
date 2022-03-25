package SE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathacxesmethod {

	public static void main(String[] args) {
		String path ="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" , path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

	}

}

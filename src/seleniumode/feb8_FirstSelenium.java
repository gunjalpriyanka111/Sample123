package seleniumode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb8_FirstSelenium {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		// we use concept of inheritance here
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("Title is"+title);
		System.out.println("Current URL= "+driver.getCurrentUrl());
driver.close();
	}

}

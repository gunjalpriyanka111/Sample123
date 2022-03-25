package SE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_sel_prog {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);  //path=E:\\selenium\\chromedriver.exe
		WebDriver driver=new ChromeDriver();
		// we use concept of inheritance here
		driver.get("https://www.google.com");
		/*String title=driver.getTitle();
		System.out.println("Title is"+title);
		
		System.out.println("Current URL= "+driver.getCurrentUrl());*/
	//	String CurrentUrl=driver.getCurrentUrl();
		System.out.println("current url is:" +driver.getCurrentUrl());

driver.close();
	}

}

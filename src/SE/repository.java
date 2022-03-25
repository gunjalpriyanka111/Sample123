package SE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class repository {

	public static void main(String[] args)  throws IOException  { 

		FileInputStream fio=new FileInputStream(System.getProperty("user.dir")+"\\repository.properties");
		Properties prop =new Properties();
		prop.load(fio);
		String dpath= prop.getProperty("path");
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		driver.get(prop.getProperty("url"));
		String searchword=prop.getProperty("searchword");
		String myxpath=prop.getProperty("searchbox");
		driver.findElement(By.xpath(myxpath)).sendKeys(searchword);
		driver.findElement(By.xpath(myxpath)).submit();



	}


}


package SE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb_23_java_script {

	public static void main(String[] args) throws InterruptedException {
		String path="E:\\selenium\\chromedriver.exe";            
		System.setProperty("webdriver.chrome.driver", path);             
		WebDriver driver=new ChromeDriver();              
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		JavascriptExecutor js=(JavascriptExecutor) driver;            //object = js
		//js.executeScript("window.location='https://www.google.com/'");  we navigate to google window
		js.executeScript("window.location=arguments[0]", "https://www.google.com/");     
		System.out.println(js.executeScript("return document.title").toString());
		System.out.println(js.executeScript("return document.URL").toString());
		System.out.println(js.executeScript("return document.domain").toString());
		WebElement ele=driver.findElement(By.xpath("//*[@name=\"q\"]"));
		js.executeScript("arguments[1].value='selenium class';",0,ele);  
		//driver.findElement(By.xpath("//*[@name='q'")).sendKeys("selenium class in pune");

		js.executeScript("alert('Search value is placed in search box');");
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		alt.dismiss();


		WebElement ele2 =driver.findElement(By.xpath("//*[@name=\"q\"]//following::input[3]"));
		js.executeScript("arguments[0].click();",ele2);
		/*
js.executeScript("window.scrollBy(0,800)");
WebElement el3=driver.findElement(By.xpath("//*@aria-lable=\"Page 2\"]"));
js.executeScript("arguments[0].scrollIntoView()", ele3);
		 */
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}

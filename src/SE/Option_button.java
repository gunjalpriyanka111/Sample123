package SE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Option_button {

	public static void main(String[] args) {
		String path="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);  //path=E:\\selenium\\chromedriver.exe
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
WebElement ele=driver.findElement(By.xpath("//input[@value=\"1\"]"));
//is this enable ? can we provide values ?
if(ele.isEnabled())
	System.out.println("this field is enabled");
else
	System.out.println("this field is not enabled");

//is this selected ?
if(ele.isSelected())
	System.out.println("this field is selected");
else
	System.out.println("this field is not selected");
//is this displayed on web page ?
if(ele.isDisplayed())
	System.out.println("this webelement is Displayed on web page");
else
	System.out.println("this field is not Displayed on web page");



	}

}

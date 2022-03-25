package SE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEb_Alert {

	public static void main(String[] args) {
		Alert alt;
		String path="E:\\selenium\\chromedriver.exe";            // path
		System.setProperty("webdriver.chrome.driver", path);             //gecko
		WebDriver driver=new ChromeDriver();              // firefox driver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		alt=driver.switchTo().alert();      //we switched to alert window
		System.out.println("Text: "+alt.getText());
		alt.accept();              //after accepting /dismissing control will go to main window
		                             //alt.dismiss(); is optional method for alt.accept();
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		alt=driver.switchTo().alert();
		System.out.println("Confirmation Alert Text: "+alt.getText());
		alt.accept();            //means you are accepting or choosing Yes/Confirm/OK

		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		alt=driver.switchTo().alert();
System.out.println("prompt alert box:"+alt.getText());
alt.accept();
	}

}

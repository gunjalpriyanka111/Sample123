import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Repository {

	public static void main(String[] args) throws IOException {

		String path ="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" , path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		FileInputStream fin= new FileInputStream("E:\\seleniumInput.xslx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet mysheet=wb.getSheet("Sheet1");
		int rowcount=mysheet.getLastRowNum()-mysheet.getFirstRowNum();
		for(int i=0;i<=rowcount;i++) 
		{
			XSSFRow currrRow=mysheet.getRow(i);
			String val=currrRow.getCell(0).getStringCellValue();
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys(val);
			// driver.findElement(By.xpath("//*[@name='q']//following::input[3]")).click();
			driver.findElement(By.xpath("//*[@name='q']")).submit();
			String res=driver.findElement(By.xpath("//div[@id=\"result-stats\"]")).getText();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//*[@name='q']")).clear();
System.out.println(val+"  "+res);
		}
	driver.close();

	}

}




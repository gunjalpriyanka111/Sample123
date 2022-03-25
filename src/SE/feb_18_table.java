package SE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb_18_table {

	public static void main(String[] args) {
		String path ="E:\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver" , path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement>RowInTable=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		int totalrow=RowInTable.size();       // I will get count of rows
		List<WebElement> colsInTable=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th"));
		int totalcol=colsInTable.size();        //I will get count of columns
		for (int i=1;i<=totalcol;i++) {
			String text=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th["+i+"]")).getText();
			System.out.print(text+"\t");              //it will print 1st row (header) of table
			
		}
		for(int i=2;i<=totalrow;i++) {              //all rows will print
			for(int j=1;j<=totalcol;j++) {
				String text=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+"\t");    // we give/t for space and in sysout we remove ln so that o/p will not come vertically 
			}
			
			System.out.println();
		}
	}

}

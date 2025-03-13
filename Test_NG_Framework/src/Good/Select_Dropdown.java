package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("select1"));
		Select s = new Select(dd);
		s.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='phone']")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}

}

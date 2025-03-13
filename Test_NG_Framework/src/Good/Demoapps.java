package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoapps {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Text Box']")).click();
		driver.findElement(By.id("name")).sendKeys("sandeep");
		driver.findElement(By.id("email")).sendKeys("sandeepcs477@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123abbbbq");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.xpath("//button[text()='Yes'and @id='btn2']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'1')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'2')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'3')]")).click();
		driver.findElement(By.xpath("//section[contains(text(),'Link')]")).click();
		driver.findElement(By.xpath("//section[ text()='Web Table']")).click();
		
		
		
		
	}

}

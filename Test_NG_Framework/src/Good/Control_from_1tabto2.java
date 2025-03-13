package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Control_from_1tabto2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software2/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		 driver.findElement(By.xpath("//span[.='Downloads']")).click();
		 Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		

			Thread.sleep(1000);
			WebElement Link1 = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));
			
			driver.findElement(By.xpath("(//a[@class='card-link'])[2]"));
		
		
	}

}

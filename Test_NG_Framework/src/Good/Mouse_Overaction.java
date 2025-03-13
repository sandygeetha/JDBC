package Good;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Overaction {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	 driver.navigate().to("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 
	 
	 WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
	 Actions act = new Actions(driver);
	 Thread.sleep(2000);
		act.moveToElement(ele).perform();
		
		 Thread.sleep(2000);
		driver.quit();
	 
	 
	}

}

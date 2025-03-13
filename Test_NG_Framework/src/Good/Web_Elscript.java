package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Elscript
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 WebElement TEXT = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 boolean result = TEXT.isDisplayed();
		 
		 System.out.println(result);
		 boolean result1 = TEXT.isEnabled();
		 System.out.println(result1);
		 
		 boolean result2 = TEXT.isSelected();
		 System.out.println(result2);
		 
		 TEXT.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		 Thread.sleep(2000);
		 TEXT.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Puma men shoes");
		 TEXT.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
}//input[@id='nav-search-submit-button']
}

package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software2/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		WebDriverWait w = new WebDriverWait(driver,10);
		WebElement slide = driver.findElement(By.xpath("//input[@type='range']"));// This is for slider validation the method
		
		
		
//		WebDriverWait w = new WebDriverWait(driver,10);
//		
//		w.until(ExpectedConditions.urlContains("qspiders"));
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		w.until(ExpectedConditions.titleContains("Text Box"));
//		String t = driver.getTitle();
//		System.out.println(t);
		
	}

}

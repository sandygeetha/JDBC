package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findf {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='search']")).click();
		driver.findElement(By.name("search_query")).sendKeys("videos");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.cssSelector("div[class='ytp-inline-preview-scrim']")).click();
		
		
	}

}

package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathscript {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='search_query']")).click();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("play love me like you do song");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//div[@id='dismissible']")).click();
		
	}

}

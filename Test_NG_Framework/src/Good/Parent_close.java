package Good;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_close {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Software2/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement btn = driver.findElement(By.xpath("//button[.='New Browser Window']"));
		btn.click();
		
	String P_id = driver.getWindowHandle();
		
		System.out.println(P_id);
		
	Set<String> wins = driver.getWindowHandles();
	System.out.println(wins);
	
	for(String win:wins)
	{
		 WebDriver w = driver.switchTo().window(win);//1,2
		String Titel = w.getTitle();//1,2
		System.out.println(Titel);
	
	{
		if(win.contains(P_id))
			
		{
			driver.close();
		}
	}
	}}}
	
		
	
		
		
		
		
	


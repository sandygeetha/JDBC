package Good;

import java.text.Normalizer.Form;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Rev 
{
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		Form selenium import webdriver
		from webdriver_manager.chrome import ChromeDriverManager

		driver = webdriver.Chrome(ChromeDriverManager().install())
		
	
		driver.get("file:///C:/Users/user/Documents/check.html");
		List<WebElement> links = driver.findElements(By.xpath("//input[@type='CHECKBOX']"));
		int count = links.size();
		System.out.println(count);
		
		for(int i=0;i < count ;i++)
		{
			WebElement ele = links.get(i);
			ele.click();
		}
		Thread.sleep(2000);
		for(int i=0;i > count;i--)
		{
			WebElement ele = links.get(i);
			ele.click();
			
		}
			
	}

}

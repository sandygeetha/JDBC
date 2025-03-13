package Good;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_Tex {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count=links.size();
	System.out.println(count);
	
	for(int i=0; i<count;i++)
	{
		WebElement ele=links.get(i);
		String text = ele.getText();
		System.out.println(text);
		
	}
}
}

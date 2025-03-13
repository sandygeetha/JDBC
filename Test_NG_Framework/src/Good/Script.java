package Good;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script
{
public static void main(String[] args) throws InterruptedException 
{
	String key = "webdriver.chrome.driver";
	String value = "./Softwares/chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver = new ChromeDriver();
	Thread.sleep(3000);

driver.close();
	
	
}
}

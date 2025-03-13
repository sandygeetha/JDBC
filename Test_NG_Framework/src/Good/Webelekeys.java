package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelekeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("file:///C:/Users/user/Documents/Checkboxdisplayed.html");
		 WebElement textbox =driver.findElement(By.id("i1"));
		 textbox.sendKeys(Keys.CONTROL+"A");
		 Thread.sleep(2000);
		 textbox.sendKeys(Keys.DELETE);
	}
}

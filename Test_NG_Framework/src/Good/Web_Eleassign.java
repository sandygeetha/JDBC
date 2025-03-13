package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Eleassign 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	 driver.get("file:///C:/Users/user/Documents/assignweb.html");
	 WebElement USN =driver.findElement(By.id("i1"));

	 USN.sendKeys(Keys.CONTROL+"A");
	 Thread.sleep(2000);
	 USN.sendKeys(Keys.CONTROL+"X");
	 Thread.sleep(2000);
	 USN.sendKeys(Keys.CONTROL+"C");
	 
	 WebElement Confirmpsw =driver.findElement(By.id("i3"));
	 
	 
	 Confirmpsw.sendKeys(Keys.CONTROL+"A");
	 Thread.sleep(2000);
	 Confirmpsw.sendKeys(Keys.DELETE);
	 Confirmpsw.sendKeys(Keys.CONTROL+"V");
	 USN.sendKeys(Keys.CONTROL+"V");
	 
	 WebElement PSW =driver.findElement(By.id("i2"));
	 PSW.sendKeys(Keys.CONTROL+"A");
	 Thread.sleep(2000);
	 USN.sendKeys(Keys.DELETE);
	 USN.sendKeys(Keys.CONTROL+"V");
	 
}
}

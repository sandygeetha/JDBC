package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelement {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Documents/Checkboxdisplayed.html");
		  WebElement textbox = driver.findElement(By.id("i1"));
		Thread.sleep(2000);
		textbox.clear();
		driver.quit();
	}

}

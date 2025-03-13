package Good;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_specific {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./Software2/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
	WebElement link1 = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));
	WebElement link2 = driver.findElement(By.xpath("(//a[@class='card-link'])[2]"));
	WebElement link3 = driver.findElement(By.xpath("(//a[@class='card-link'])[3]"));
	
	 ArrayList<WebElement> arr = new ArrayList<WebElement>();
	 arr.add(link1);
	 arr.add(link2);
	 arr.add(link3);
	 Actions act = new Actions(driver);
	 Robot r = new Robot();
	 for (WebElement we:arr)
	 {
		 act.contextClick(we).perform();
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);
		 
	 }
	 
}}
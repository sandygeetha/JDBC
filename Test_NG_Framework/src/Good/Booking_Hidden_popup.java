package Good;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Booking_Hidden_popup {
	
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement btn = driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]"));
	btn.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='truncate airPortName '])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
	Thread.sleep(1000);
    driver.findElement(By.xpath("//span[.='Departure']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//p[.='5'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//p[.='6'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[.='Search']")).click();
    Thread.sleep(2000);
     
    TakesScreenshot ts = (TakesScreenshot)driver;
   File temp = ts.getScreenshotAs(OutputType.FILE);
   File per = new File("C:\\Users\\user\\Desktop\\screen shot\\D2.jpeg");
	FileHandler.copy(temp, per);
	Date d=new Date();
	System.out.println(d);		
	String d1 = d.toString();
	String d2 = d1.replaceAll(":", "-");
	System.out.println(d2);
	
	
	
	
	
	driver.quit();
}
}

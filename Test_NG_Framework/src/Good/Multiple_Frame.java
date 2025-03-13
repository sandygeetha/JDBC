package Good;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Frame {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Downloads/Mainpage.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement T1 = driver.findElement(By.id("T1"));
		T1.sendKeys("Xyz");
		Thread.sleep(1000);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='frame1']"));
		 driver.switchTo().frame(frame1);
		 WebElement T2 = driver.findElement(By.id("T2"));
		 T2.sendKeys("abc");
		 T2.clear();
		 Thread.sleep(2000);
		 
	driver.switchTo().defaultContent();
		 driver.switchTo().frame("f2");
		 WebElement T3 = driver.findElement(By.id("T3"));
	T3.sendKeys("Sun");
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("f3");
		 WebElement T4 = driver.findElement(By.id("T4"));
		 T4.sendKeys("Smile");
		 

}}

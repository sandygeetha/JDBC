package Good;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Downloads/Mainpage.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement T1 = driver.findElement(By.id("T1"));
		T1.sendKeys("Sandeep");
		Thread.sleep(1000);
		//driver.switchTo().frame(0);//By passing index value
		//driver.switchTo().frame("f1");//By passing name or id(frame1)
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='frame1']"));
		 driver.switchTo().frame(frame1);// By passing address of frame
		 WebElement T2 = driver.findElement(By.id("T2"));
		 T2.sendKeys("Vibha");
		 
		 

}
}
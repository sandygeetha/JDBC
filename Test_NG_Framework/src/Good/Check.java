package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/home.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("n1")).sendKeys("abc");
		driver.findElement(By.id("i2")).sendKeys("xyz");
		driver.findElement(By.name("n3")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("n2")).clear();
		
		

}
}

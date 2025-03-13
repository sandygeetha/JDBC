package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlgun {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/Gun.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("n1")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.name("n2")).sendKeys("abc");
		
}
}

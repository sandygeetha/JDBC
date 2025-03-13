package Good;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./Software2/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		driver.manage().window().maximize();
		Thread.sleep(1000);
WebElement btn = driver.findElement(By.id("browserButton3"));
btn.click();
driver.manage().window().maximize();
Set<String> win = driver.getWindowHandles();

System.out.println(win);
 int count = win.size();
 System.out.println(count);
 
	 for(String w:win)
	 {
		 System.out.println(w);
		 String t = driver.getTitle();
		 System.out.println(t);
	 }
	driver.quit();	 
		 
 }
 
 
 }



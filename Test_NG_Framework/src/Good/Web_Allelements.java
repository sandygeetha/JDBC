package Good;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web_Allelements
{
	private static final org.openqa.selenium.Dimension Dimension = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	 driver.navigate().to("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 {
	WebElement btn=driver.findElement(By.id("email"));
	 String some=btn.getAttribute("autofocus");
	 System.out.println(some);
	 }
	 WebElement bElement=driver.findElement(By.xpath("//button[@type='submit']"));	 
	org.openqa.selenium.Dimension Size = bElement.getSize();
	int H=Size.getHeight();
	int W=Size.getWidth();
	System.out.println("The size is"+H);
	System.out.println("The size is"+W);
	{
	WebElement bcElement=driver.findElement(By.xpath("//button[@type='submit']"));
	String tag = bcElement.getTagName();
	 System.out.println(tag);
	}
	 
	 Thread.sleep(2000);
	 { 
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 
	 
		 org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(200,300);
		 driver.manage().window().setSize(d);
	 

	 //driver.quit();
	}
	
	}
}

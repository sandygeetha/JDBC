package Good;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		String Titel=driver.getTitle();
		System.out.println(Titel);
		Thread.sleep(1000);
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		String Source=driver.getPageSource();
		System.out.println(Source);
	}

}

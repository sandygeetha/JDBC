package Good;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubelunch {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("newsongs");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//h3[@class='style-scope ytd-promoted-video-renderer']")).click();
	    Thread.sleep(2000);
		 driver.findElement(By.xpath("(//like-button-view-model[@class='YtLikeButtonViewModelHost'])[1]")).click();
	  
		
		

}
}




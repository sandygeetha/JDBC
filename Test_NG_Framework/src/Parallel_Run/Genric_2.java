package Parallel_Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Genric_2 
{
	WebDriver driver;
	@Parameters("Browsername")
	@BeforeMethod
	
	public void openappn(String Browsername)
	{
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Software3/chromedriver.exe");
			 driver=new ChromeDriver(); 
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./Software3/geckodriver.exe");
			 driver=new FirefoxDriver(); 
		}
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeappn()
	{
		driver.close();
	}
	

}

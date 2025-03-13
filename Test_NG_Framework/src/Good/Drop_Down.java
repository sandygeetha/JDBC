package Good;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Downloads/drop.html");
		WebElement dd = driver.findElement(By.id("Hotel"));
		Select s = new Select(dd);// select class to handle the dropdown
		Thread.sleep(2000);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.deselectByIndex(2);
		Thread.sleep(2000);
		List<WebElement> option = s.getOptions();
		int count = option.size();
		System.out.println(count);
		for (int i = 0;i<count;i++)
		{
			WebElement opt = option.get(i);
			String txt = opt.getText();
			System.out.println(txt);
			
		}
		
		
		driver.quit();
		
	}

}

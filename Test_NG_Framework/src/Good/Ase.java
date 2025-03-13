package Good;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ase 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software1/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Downloads/drop.html");
		WebElement dd = driver.findElement(By.id("Hotel"));
		Select s = new Select(dd);// select class to handle the dropdown
		Thread.sleep(2000);
		List<WebElement> option = s.getOptions();
		int count = option.size();
		System.out.println(count);
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0;i<count;i++)
		{
			WebElement opt = option.get(i);
			String txt = opt.getText();
	System.out.println(txt);
			a.add(txt);
			
			//Collections.sort(a,Collections.reverseOrder());----//For ascending orderCollections.sort(a)
			//For descending order ----Collections.sort(a,Collections.reverseOrder());
			
			Collections.sort(a);
		}
		
		
		System.out.println(a);
		
		for (int j = 0;j<count;j++)
		{
			WebElement opt = option.get(j);
			String txt = opt.getText();
			System.out.println(txt);
		}
}
}
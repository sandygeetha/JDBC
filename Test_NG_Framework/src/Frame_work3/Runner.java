package Frame_work3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Runner extends Genric
{
@Test
public void testcase()
{
	WebElement usn = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("pass"));
	WebElement lognbtn = driver.findElement(By.name("login"));
	usn.sendKeys("sandy");
	pwd.sendKeys("vibha@123");
	lognbtn.click();
}
}

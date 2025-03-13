package Parallel_Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoM_02 {

	@FindBy(id="email")
	private WebElement USN ;
	
	@FindBy(id="pass")
	private WebElement PWD ;
	
	@FindBy(name="login")
	private WebElement Btn ;
	
	
	public PoM_02(WebDriver driver)
	{
PageFactory.initElements(driver,this);

}
	public void enterUSN(String us)
	{
		USN.sendKeys("us");
	}
		public void enterPWD(String pw)
		{
			PWD.sendKeys("pw");
		}
		
		public void login ()
		{
		Btn.click();
	}
}



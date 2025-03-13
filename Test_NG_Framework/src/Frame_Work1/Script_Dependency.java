package Frame_Work1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_Dependency 
{
@Test()
public void openappn()
{
	Reporter.log("say good always",true);
}
@Test(priority = 1,dependsOnMethods = "openappn")
public void tc()
{
	Reporter.log("Test cases",true);
	Assert.fail();
}

@Test(priority = 2,dependsOnMethods = "tc")
public void  closeappn()
{
	Reporter.log("Do it now",true);
	
}
}

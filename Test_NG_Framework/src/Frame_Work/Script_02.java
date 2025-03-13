package Frame_Work;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_02 
{
@ Test (invocationCount = 2)
public void Sample()
{
	Reporter.log("Hi",true);
}



@Test(priority = 1,invocationCount = 4)
public void Demo()
{
	Reporter.log("Hello",true);
}
}





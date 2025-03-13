package Frame_Work1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_03 {
	
		@Test(enabled = false)
		public void sample1()
		{
			Reporter.log("So much to do in life",true);
		}
			@Test(invocationCount = 2)
			public void sample2()
			{
				Reporter.log("I will be doing it as soon",true);
		}

	}



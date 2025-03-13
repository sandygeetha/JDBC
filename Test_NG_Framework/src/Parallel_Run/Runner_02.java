package Parallel_Run;

import org.testng.annotations.Test;

public class Runner_02 extends Genric_2 
{

		@Test
		public void testcae()
		{
			PoM_02 p =new PoM_02(driver);
			p.enterUSN("sun");
			p.enterPWD("Sandy@1243");
			p.login();
		}
	}


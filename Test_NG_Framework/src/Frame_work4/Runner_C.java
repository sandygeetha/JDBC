package Frame_work4;

import org.testng.annotations.Test;

public class Runner_C extends Genric_1{

	@Test
	public void testcae()
	{
		PoM_frame p = new PoM_frame(driver);
		p.enterUSN("Vibha");
		p.enterPWD("Sandy@123");
		p.login();
	}
}

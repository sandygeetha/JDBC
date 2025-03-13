package Frame_work4;

import org.testng.annotations.Test;

public class Runner2 extends Genric_1{

	@Test
	public void testcae()
	{
		PoM_frame p = new PoM_frame(driver);
		p.enterUSN("sun");
		p.enterPWD("Sandy@1243");
		p.login();
	}
}

//parallel execution i will change the source in xml then run by specifying the attribute in test as parameter and thread-count 
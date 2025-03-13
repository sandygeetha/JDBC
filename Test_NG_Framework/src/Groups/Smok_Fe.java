package Groups;

import org.testng.annotations.Test;

public class Smok_Fe {
	@Test(groups= {"smokeTC"})
	public void smokeTC1()
	{
		System.out.println("This is smoke testcase1");
	}
@Test(groups= {"smoke"})
public void smokeTC2()
{
	System.out.println("This is smoke testcase2");
}
@Test(groups= {"Functional"})
public void FTTC1()
{
	System.out.println("FT2");
}
}

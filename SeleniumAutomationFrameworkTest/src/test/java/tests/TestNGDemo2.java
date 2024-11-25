package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test(groups= {"AllClassTest"})
public class TestNGDemo2 {
	
	@Test(priority=1,groups= {"windows.Sanity","windows.Regression"})
	public void test4() {
		System.out.println("This is a Test4");
	}
	@Test(priority=0,groups={"windows.Smoke"},enabled=true,retryAnalyzer = listeners.RetryListener.class)
	public void test5() {
		System.out.println("This is Test5");
		Assert.assertTrue(false);
	}
	@Parameters({"2"})
	@Test(groups={"windows.Sanity"},enabled=true,retryAnalyzer = listeners.RetryListener.class)
	public void test6(String j)  {
		int i=Integer.parseInt(j);
		
			System.out.println(i);
			System.out.println("This is Test6");
		
		
	}

}

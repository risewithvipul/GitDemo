package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testComponents.BaseClass;


public class TestNGDemo1 extends BaseClass {
	
	@Test(dependsOnMethods = {"test3"}, priority=-1)
	
	public void test1() {
		System.out.println("This is a Test1");
		
	}
	@Test(groups="sanity2",dependsOnGroups = {"sanity1"},retryAnalyzer = listeners.RetryListener.class)
	public void test2() {
		System.out.println("This is Test2");
		Assert.assertTrue(false);
	}
	
	@Test(groups="sanity1")
	
	public void test3()  {
		try {
		int i=10/0;
		
		}
		catch(ArithmeticException e){
			System.out.println("This is Test3");
		}
		
	}

}

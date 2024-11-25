package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import testComponents.BaseClass;

public class TestListeners extends BaseClass implements ITestListener  {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("********************Test Case has been Started********************"+result.getName());
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("********************Test Case has been failed********************"+result.getName());
		try {
		takeScreenshot(result.getName());
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("********************Test Case has been successfully Run********************"+result.getName());
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("********************Test Case has been Skipped********************"+result.getName());
		
		
	}
	
	
	

}

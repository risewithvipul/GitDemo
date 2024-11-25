package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testComponents.BaseClass;

public class TakeScreenShot extends BaseClass {
	
	public void takeScreenshot(String str) {
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File file=new File(System.getProperty("user.dir") + "//reports//" + str + ".png");
	//System.out.println(file);
	try {
		FileUtils.copyFile(source, file);
	} catch (IOException e) {
		e.printStackTrace();
	}

}
}

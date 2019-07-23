package InterviewQuestions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenShots extends WebDriverTestCase {
	
	@Test
	public void TakeScreenShot() throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Jayanth\\WorkSpace\\SeleniumConcepts\\ScreenShots\\S1.png"));
	}
}

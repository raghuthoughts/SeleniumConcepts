package InterviewQuestions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FramesTesting extends WebDriverTestCase {

	@Test
	public void verifyingFrames() throws InterruptedException 
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role = 'presentation']")));
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='sample-form']/following-sibling::div/div[4]/iframe")));
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
	}
	
	
}

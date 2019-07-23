package InterviewQuestions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingCheckBoxandDropDown  extends WebDriverTestCase {
	 String op;
	
	@Test (priority=0)
	public void CheckBoxHandling() 
	{
		  driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		  op = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText(); 
	}
	
	@Test (priority=1)
	public void DropDownHandling()
	{   
          WebElement DropDown = driver.findElement(By.id("dropdown-class-example"));		
		  Select s = new Select(DropDown);
		  s.selectByVisibleText(op);
	}
	@Test (priority=2)
	public void TextBoxHandling() 
	{
		driver.findElement(By.xpath("//div[@class='right-align']/fieldset[@class='alert_example']/input[1]")).sendKeys(op);
	}
	
	@Test(priority=3)
	public void AlertBoxHandling() 
	{
		driver.findElement(By.xpath("//div[@class='right-align']/fieldset[@class='alert_example']/input[2]")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
	@Test (priority=4)
	 public void WindowHandling() 
	{
		driver.findElement(By.xpath("//div[@class='left-align']/fieldset/button")).click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String Window1 = it.next();
		String Window2 = it.next();
		driver.switchTo().window(Window2);
		driver.findElement(By.xpath("//div[@class='container']/nav/ul//li[2]")).click();
		driver.switchTo().window(Window1);
	}
	@Test (priority=5)
	public void FramesHandling() throws InterruptedException 
	{
	   List<WebElement> list = driver.findElements(By.tagName("iframe"));
	   Iterator<WebElement> it=  list.iterator();
	   WebElement frame = it.next();
	   driver.switchTo().frame(frame); 
	}
}

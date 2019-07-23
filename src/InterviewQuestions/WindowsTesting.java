package InterviewQuestions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class WindowsTesting extends WebDriverTestCase {
	
	static Set<String> set;
  
    
	
	@Test (priority=0)
	@SuppressWarnings("unused") public void SwitchToWindows() 
	{
		driver.findElement(By.xpath("//a[text()='Gmail Terms of Use']")).click();
		 set = driver.getWindowHandles();
		 Iterator<String> it = set.iterator();
		 
		 String Window1 = it.next();
		 String Window2 = it.next();
 		 driver.switchTo().window(Window2);
		 driver.findElement(By.xpath("//div[@id='maia-main']//div[1]//ul//li[1]/a")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));// Using this we can open link in another Tab 
		 
	}
	
	@Test (priority=1)
	@SuppressWarnings("unused") public void SwitchToWindowsHandle() 
	{
		 set = driver.getWindowHandles();
		 Iterator<String> it1 = set.iterator();
		 String Window1 = it1.next(); 
		 String Window2 = it1.next();
		 String Window3 = it1.next();
		 driver.switchTo().window(Window3);
         driver.findElement(By.xpath("//a[text()='Google’s Terms of Service']")).click();
         driver.switchTo().window(Window1);
         
         set = driver.getWindowHandles();
		 Iterator<String> it2 = set.iterator();
         while(it2.hasNext()) 
         {
        	 driver.switchTo().window(it2.next());
        	 System.out.println(driver.getTitle());
         }
	}
	
}

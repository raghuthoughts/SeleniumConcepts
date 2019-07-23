package InterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BingSearch extends WebDriverTestCase {
   
	@Test (priority=0)
	public void VerifyTitle() 
	{
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "Bing");
	}
	
	@Test (priority=1)
	public void VerifyInputSearch() 
	{
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		List <WebElement> list= driver.findElements(By.xpath("//ul[@class='sa_drw']/li//div[@class='sa_tm']"));
		System.out.println(list.size());
		
		for(int i =0;i<list.size();i++) 
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium interview questions"))
			{
				list.get(i).click();
				break;
			}
		}
	}
}

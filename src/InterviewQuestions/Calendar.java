package InterviewQuestions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Calendar extends WebDriverTestCase {
	
	
	@Test
	public void CalendarExample() 
	{
		driver.findElement(By.xpath("//input[@name='or-depart']")).click();
		
		String date = "15-May-2020";
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		String dateVal = month+year;
	   
	    while( !(driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div/div[1]/span[1]")).getText()+driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div/div[1]/span[2]")).getText()).contains(dateVal)) 
	    {
	    	driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/a")).click();
	    }
		     
		 String BeforeXpath = "//table[@class='ui-datepicker-calendar']/tbody/tr[";
		 String AfterXpath = "]/td[";
		 
			 Boolean flag = false;
			 for(int rowNum =1;rowNum<=5;rowNum++) 
			 {
				 for(int ColNum =1;ColNum<=7;ColNum++) 
				 {
					 String dayValue = driver.findElement(By.xpath(BeforeXpath + rowNum + AfterXpath + ColNum + "]")).getText();
					if(dayValue.equals(day)) 
					{
						driver.findElement(By.xpath(BeforeXpath + rowNum + AfterXpath + ColNum + "]")).click();
						flag=true;
						break;
					}
				 }
				 if(flag) 
				 break;
			 }
		 
	}

	
}

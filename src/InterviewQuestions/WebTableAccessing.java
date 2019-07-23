package InterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableAccessing extends WebDriverTestCase  {
	
	@Test
	public void AcessingWebTable() 
	{
		 int pts = 0;
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td/a[@class='cb-text-link']"));
		for(int i = 0; i<list.size();i++) 
		{
			String Teams = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td/a[@class='cb-text-link']")).get(i).getText();
			String Matches = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td[2][@class='cb-srs-pnts-td']")).get(i).getText();
			String Won = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td[3][@class='cb-srs-pnts-td']")).get(i).getText();
			String Lost = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td[4][@class='cb-srs-pnts-td']")).get(i).getText();
			String Tied = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td[5][@class='cb-srs-pnts-td']")).get(i).getText();
			String NR = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td[6][@class='cb-srs-pnts-td']")).get(i).getText();
			String Points = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td[7][@class='cb-srs-pnts-td text-bold']")).get(i).getText();
			String NRR = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr/td[8][@class='cb-srs-pnts-td']")).get(i).getText();
			
			System.out.println(Teams  + "  "  +  Matches  +  "   "  +  Won  +  "   "  +  Lost  +  "   "  +  Tied  +  "   "  +  NR  +  "   "  +  Points   +  "   "   +  NRR);
			System.out.println("---------------------------------------------------------------");
			int pointsvalue = Integer.parseInt(Points);
			pts = pts+pointsvalue;
		}
		
		System.out.println(pts);
	}

}

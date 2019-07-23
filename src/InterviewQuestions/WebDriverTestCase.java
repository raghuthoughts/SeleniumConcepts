package InterviewQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTestCase {
 
	static WebDriver driver;
	static Properties props;
	
	public WebDriverTestCase() 
	{ 
		try {
		props = new Properties();
		FileInputStream in = new FileInputStream("C:\\Users\\Jayanth\\WorkSpace\\SeleniumConcepts\\src\\InterviewQuestions\\Config.properties");
		props.load(in);
		}catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch(IOException I) 
		{
			I.printStackTrace();
		}
		
		if(props.getProperty("Browser").contains("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		 }else if(props.getProperty("Browser").contains("Firefox")) 
		 {
			 	WebDriverManager.firefoxdriver().arch64().setup();
				driver = new FirefoxDriver();
		 }
			driver.manage().window().maximize();
			//driver.get(props.getProperty("url5"));
			//driver.get(props.getProperty("url4"));
			//driver.get(props.getProperty("url1"));
			//driver.get(props.getProperty("url2"));
			//driver.get(props.getProperty("url3"));
			driver.get(props.getProperty("url6"));
			
		
	}
	
}

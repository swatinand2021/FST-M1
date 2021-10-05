package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity4lms {
	
	   WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod1() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("https://alchemy.hguy.co/lms");
	        
	        //maximize window
	        driver.manage().window().maximize();
	    }
@Test
public void function() {
	  
	//to perform Scroll on application using Selenium
   JavascriptExecutor js = (JavascriptExecutor) driver;  
   
	  WebElement linkTextLocator = driver.findElement(By.xpath("((//div[@class='ld_course_grid col-sm-8 col-md-4 '])[2])"));	  
	  
	  // Scrolling down the page till the element cab be viewed		
   js.executeScript("arguments[0].scrollIntoView();", linkTextLocator);
   
   System.out.println("Second most popular course: " + linkTextLocator.getText());
   
   String expectedstring = "Email Marketing Strategies";
   Assert.assertTrue( linkTextLocator.getText().contains(expectedstring),"Email Marketing Strategies");       
   
   System.out.println("Text in second most popular course matches : " + expectedstring);
       }

@AfterMethod
public void afterMethod1() {
   //Close the browser
   driver.quit();
}
}
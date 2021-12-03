package testngtest;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity8lms  {
	
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
	
	driver.findElement(By.linkText("Contact")).click();
	
	// Check the title of the page
    String title = driver.getTitle();
        
    //Print the title of the page
    System.out.println("Page title is: " + title);
	
	
	//to perform Scroll on application using Selenium
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    
    WebElement linkTextLocator = driver.findElement(By.xpath("//div/h2[@class='uagb-heading-text']"));	  
	  
	  // Scrolling down the page till the element cab be viewed		
    js.executeScript("arguments[0].scrollIntoView();", linkTextLocator);
    
    //Enter user data
    
    driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Swati Nanda");
    driver.findElement(By.id("wpforms-8-field_1")).sendKeys("swatinand@gmail.com");
    driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Need support");
    driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Test support message");
    driver.findElement(By.id("wpforms-submit-8")).click();
    
    WebElement Confirmation = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']")); 
    
    String Confirmationmessage = Confirmation.getText();
    
  //Print the confirmation message
    System.out.println("The confirmation is : " + Confirmationmessage);
	
}
@AfterMethod
public void afterMethod1() {
    //Close the browser
    driver.quit();
}
}
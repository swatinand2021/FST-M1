package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2lms {
	
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
	  WebElement linkTextLocator = driver.findElement(By.xpath("//h1[text()=' Learn from Industry Experts ']"));
      System.out.println("Text in Heading: " + linkTextLocator.getText());
          
      //Assertion for page title
      Assert.assertEquals("Learn from Industry Experts", linkTextLocator.getText());
      
      System.out.println("Text in Heading matches : " + linkTextLocator.getText());
          }
  
  @AfterMethod
  public void afterMethod1() {
      //Close the browser
      driver.quit();
  }
}


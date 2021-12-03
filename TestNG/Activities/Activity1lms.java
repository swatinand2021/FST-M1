package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1lms {
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
    public void exampleTestCase1() {
        // Check the title of the page
        String title = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
            
            //Assertion for page title
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
                    
         //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());
        
         }

    @AfterMethod
    public void afterMethod1() {
        //Close the browser
        driver.quit();
    }
}
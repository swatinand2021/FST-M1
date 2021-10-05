package testngtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5lms {
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
        // Check the title of the page
        driver.findElement(By.linkText("My Account")).click();
        
        //Get page title
        
        String myacctitle = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + myacctitle);
            
            //Assertion for page title
        Assert.assertEquals("My Account – Alchemy LMS", myacctitle);
                    
         //Print title of new page
        System.out.println("New page title is: " + myacctitle);
        
         }

    @AfterMethod
    public void afterMethod1() {
        //Close the browser
        driver.quit();
    }
}


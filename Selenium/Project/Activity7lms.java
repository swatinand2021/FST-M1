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


public class Activity7lms {
	
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
	
	driver.findElement(By.linkText("All Courses")).click();
	
	String pageTitle = driver.getTitle();
    assertEquals(pageTitle, "All Courses – Alchemy LMS");
    
    
    List<WebElement> courses= driver.findElements(By.className("ld_course_grid"));
    
    System.out.println(courses.size());
    
    for (WebElement webElement : courses) {
        String name = webElement.getText();
        System.out.println(name);
    }  
    
	
       }
    
    @AfterMethod
    public void afterMethod1() {
        //Close the browser
        driver.quit();

}
}

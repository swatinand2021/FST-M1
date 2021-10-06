
package testngtest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9lms {

	
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
 
JavascriptExecutor js = (JavascriptExecutor) driver;  
 

driver.findElement(By.xpath("((//div[@class='ld_course_grid col-sm-8 col-md-4 '])[1])")).click();	

WebElement Loginbutton = driver.findElement(By.xpath("//a[@class='ld-button']"));

//Scrolling down the page till the element cab be viewed		
js.executeScript("arguments[0].scrollIntoView();", Loginbutton);

driver.findElement(By.xpath("//a[@class='ld-button']")).click();
driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

driver.findElement(By.xpath("//div[contains(@class,'ld-item-title')] [contains(text(),'Developing Strategy')]")).click();

String pageTitle1 = driver.getTitle();
System.out.println("Course Page title is: " + pageTitle1);

//Find mark complete button and click if available


if(!driver.findElements(By.xpath("//input[@class='learndash_mark_complete_button']")).isEmpty()){
	driver.findElements(By.xpath("//input[@class='learndash_mark_complete_button']")).get(0).click();
}else{
	System.out.println("Mark complete doesnot exist");
}


}
@AfterMethod
public void afterMethod1() {
 //Close the browser
 driver.quit();

}

}



package testngtest;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6lms {
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
    driver.findElement(By.xpath("//a[text()='My Account']")).click();
    String pageTitle = driver.getTitle();
    assertEquals(pageTitle, "My Account – Alchemy LMS");
    driver.findElement(By.xpath("//a[text()='Login']")).click();
    driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
    driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
    driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
    String title = driver.getTitle();
    assertEquals(title, "My Account – Alchemy LMS");
}
@AfterMethod
public void afterMethod1() {
    //Close the browser
    driver.quit();
}
}
package test66;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;


public class Form 
{
	public static WebDriver driver;
    
	   @BeforeTest
	     public static void setUp() 
	     {
	         
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\1037361\\workspace\\testing8\\src\\test\\resources\\chromedriver.exe");
	      //System.setProperty("webdriver.firefox.driver","D:\\geckodriver.exe");
	     
	             driver  = new ChromeDriver(); 
	     }
}
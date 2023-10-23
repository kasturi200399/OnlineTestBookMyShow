package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class LoginPageTest {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Load chromeDriver
	System.setProperty("WebDriver.chrome.driver","E:\\selenium\\chromedriver-win32-118-final\\chromedriver.exe");
	//Opening the Chrome Browser
	WebDriver driver=new ChromeDriver();  // Create an object of the Webdriver
	driver.manage().window().maximize();
		
	driver.get("https://in.bookmyshow.com/explore/home/"); //Open the website
	
	//####   Xpath's for the webelement
	Thread.sleep(2000);
	WebElement locationName =driver.findElement(By.xpath("//span[text()='Bengaluru']")); //Location Icon Xpath
	
	locationName.click();  // Perform click event on the xpath

	// Xpath for the signin Button
	Thread.sleep(2000);
	WebElement signBtn=driver.findElement(By.xpath("//div[text()='Sign in']"));
	
	signBtn.click(); //perform clilk event on signIn button
	
	// Xpath for the Continue with Email ID button
	Thread.sleep(2000);
	WebElement countinueEmail=driver.findElement(By.xpath("//div[text()='Continue with Email']"));
	
	countinueEmail.click(); // Perform Click Event on Continue with Email button

	// Finding the email ID textBox 
	Thread.sleep(2000);
	WebElement emailBtn=driver.findElement(By.xpath("//input[@id ='emailId']"));
	
	emailBtn.sendKeys("selauto@yopmail.com");  //set the email id as input in the textBox
	
	// Finding the Xpath for the Continue Button
	Thread.sleep(2000);
	WebElement countinueBtn = driver.findElement(By.xpath("//button[text()='Continue']"));
	
	countinueBtn.click();  // Performing the click operation on the continue button
		
	//Close Browser
	driver.close();
	
	}
}

package module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./jar/chromedriver.exe");  //to set the path
	    WebDriver driver = new ChromeDriver();    // open the browser
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //wait for 10 sec
 // enter url
	    driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
//	find element for entering the user name	
	    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ay664353");
// find element for enter  key
	    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(Keys.ENTER);
// find element to enter the password in password text field 
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pulkitjain");
// find element to click on click button
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
// find element to click on profile button
	    driver.findElement(By.xpath("//span[@class='gb_Ia gbii']")).click();
// to click on signout button
	    driver.findElement(By.linkText("Sign out")).click();
// to close the the browser 
	    driver.close();
	}
	
	
	}


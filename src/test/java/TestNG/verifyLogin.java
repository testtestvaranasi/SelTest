package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyLogin {
	WebDriver driver;
	Actions act;
	@BeforeMethod
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();	
		act = new Actions(driver);
		driver.manage().window().maximize();
	}	

 
@Test
 public void verifyloginMethod() throws InterruptedException {	      
	    driver.get("https://qa3dexp.nventco.com/3dpassport/login?service=https%3A%2F%2Fqa3dexp.nventco.com%2F3dspace%2Fcommon%2FemxNavigator.jsp");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("E1125316");
	    driver.findElement(By.name("password")).sendKeys("Plm12345");
	    driver.findElement(By.xpath("//div[@class='commands']")).click(); 
  }

@Test
public void verifySignoutMethod() throws InterruptedException, AWTException {	      
	   driver.get("https://qa3dexp.nventco.com/3dpassport/login?service=https%3A%2F%2Fqa3dexp.nventco.com%2F3dspace%2Fcommon%2FemxNavigator.jsp");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("E1125316");
	    driver.findElement(By.name("password")).sendKeys("Plm12345");
	    driver.findElement(By.xpath("//div[@class='commands']")).click();
	    Thread.sleep(50000);
	    driver.findElement(By.xpath("//div[@class='profile topbar-menu-item topbar-cmd fonticon fonticon-user-alt']")).click();
	    
	    
	    Point signOut = driver.findElement(By.xpath("/html/body/div[23]/div[1]/div[1]/ul/li[7]/div/span")).getLocation();
	     Robot roboteng = new Robot();	    
	     roboteng.mouseMove(signOut.x,signOut.y+145);
	     Thread.sleep(5000);
	     WebElement markNews = driver.findElement(By.xpath("/html/body/div[23]/div[1]/div[1]/ul/li[7]/div/span"));
	     markNews.click();
	     
	     Thread.sleep(500);
 }



@AfterMethod
public void close() {
	 // driver.close();
	//  driver.quit();
}
 }

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyCreatePart {
	WebDriver driver;
	Actions act;
	@BeforeMethod	
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();	
		act = new Actions(driver);
		driver.manage().window().maximize();
	}	
 

	/*
@Test
 public void verifyalogin() throws InterruptedException {	      
	    driver.get("https://qa3dexp.nventco.com/3dpassport/login?service=https%3A%2F%2Fqa3dexp.nventco.com%2F3dspace%2Fcommon%2FemxNavigator.jsp");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("E1125316");
	    driver.findElement(By.name("password")).sendKeys("Plm12345");
	    driver.findElement(By.xpath("//div[@class='commands']")).click(); 
	 
 }

 
 @Test
  public void verifyCreatePartType() throws InterruptedException, AWTException {	                  
      driver.get("https://qa3dexp.nventco.com/3dpassport/login?service=https%3A%2F%2Fqa3dexp.nventco.com%2F3dspace%2Fcommon%2FemxNavigator.jsp");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.findElement(By.name("username")).sendKeys("E1125316");
      driver.findElement(By.name("password")).sendKeys("Plm12345");
      driver.findElement(By.xpath("//div[@class='commands']")).click();
      Thread.sleep(50000);
      driver.findElement(By.xpath("//div[@class='add topbar-menu-item topbar-cmd fonticon fonticon-plus']")).click();
      //Thread.sleep(5000);
      
      //For Top Menu       
        
       Point engineering = driver.findElement(By.xpath("/html/body/div[23]/div[1]/div[1]/ul/li[5]/div[1]/span")).getLocation();
       Robot roboteng = new Robot();
       roboteng.mouseMove(engineering.x,engineering.y+110);
       
       Thread.sleep(500);
       
       //For Sub-Menu
       
       Point part = driver.findElement(By.xpath("/html/body/div[23]/div[3]/div/ul/li[3]/div[1]/span")).getLocation();
       Robot robotpart = new Robot();
       robotpart.mouseMove(part.x+50,part.y+125);
       
       Thread.sleep(500);
      
       
       Point createnewpart = driver.findElement(By.xpath("/html/body/div[23]/div[12]/div/ul/li[2]/div/span")).getLocation();
       Robot robotcreatepart = new Robot();	
       WebElement markNews = driver.findElement(By.xpath("/html/body/div[23]/div[12]/div/ul/li[2]/div/span"));
       markNews.click();
       robotcreatepart.mouseMove(createnewpart.x,createnewpart.y+120);

       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
       //Once the browser is opened with the given Url ,by default it will not be full maximized , we need to maximize it by using the above code.  
       WebElement Element = driver.findElement(By.xpath("/html/body/div[23]/iframe")); // To identify a frame i.e Frame1 we need to identify it by using either Id or Name properties.  
       // Here 'Element' variable holds Complete information about the frame such as Frame displayed / Exists ,Frame coordinates , etc.  
       driver.switchTo().frame(Element) ;    
       
       Thread.sleep(5000);  
        
       driver.findElement(By.name("btnTypeActual")).click();
       
       Thread.sleep(10000);   
       
       driver.close();
  }*/
	

  
@Test
  public void verifyCreatePartMethod() throws InterruptedException, AWTException {	                  
	    driver.get("https://qa3dexp.nventco.com/3dpassport/login?service=https%3A%2F%2Fqa3dexp.nventco.com%2F3dspace%2Fcommon%2FemxNavigator.jsp");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("E1125316");
	    driver.findElement(By.name("password")).sendKeys("Plm12345");
	    driver.findElement(By.xpath("//div[@class='commands']")).click();
	    Thread.sleep(50000);
	    driver.findElement(By.xpath("//div[@class='add topbar-menu-item topbar-cmd fonticon fonticon-plus']")).click();
	    //Thread.sleep(5000);
	    
	    //For Top Menu 
	      
      /*  new Actions(driver)
        .moveToElement(
        		driver.findElement(By
                        .xpath("/html/body/div[23]/div[1]/div[1]/ul/li[5]/div[1]/span")))
        .build().perform();
        Thread.sleep(500);        */     
	     
	     Point engineering = driver.findElement(By.xpath("/html/body/div[23]/div[1]/div[1]/ul/li[5]/div[1]/span")).getLocation();
	     Robot roboteng = new Robot();
	     //WebElement markNews = driver.findElement(By.xpath("/html/body/div[23]/div[1]/div[1]/ul/li[5]/div[1]/span"));
	     //markNews.click();
	     roboteng.mouseMove(engineering.x,engineering.y+110);
	     
	     Thread.sleep(500);
	     
	     //For Sub-Menu
	      /* new Actions(driver)
	        .moveToElement(
	        		driver.findElement(By
	                        .xpath("/html/body/div[23]/div[3]/div/ul/li[3]/div[1]/span")))
	        .build().perform();
	     
	        Thread.sleep(500);  */
	     
	     
	     
	     Point part = driver.findElement(By.xpath("/html/body/div[23]/div[3]/div/ul/li[3]/div[1]/span")).getLocation();
	     Robot robotpart = new Robot();
	     robotpart.mouseMove(part.x+50,part.y+125);
	     
	     Thread.sleep(500);
	    
	     
        //For Sub-Sub-Menu
	     
	     /*   new Actions(driver)
	        .moveToElement(
	        		driver.findElement(By
	                        .xpath("/html/body/div[23]/div[12]/div/ul/li[2]/div/span")))
	        .build().perform();
	     
	        Thread.sleep(500); */
	    
	     Point createnewpart = driver.findElement(By.xpath("/html/body/div[23]/div[12]/div/ul/li[2]/div/span")).getLocation();
	     Robot robotcreatepart = new Robot();	
	     WebElement markNews = driver.findElement(By.xpath("/html/body/div[23]/div[12]/div/ul/li[2]/div/span"));
	     markNews.click();
	     robotcreatepart.mouseMove(createnewpart.x,createnewpart.y+120);

	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	     //Once the browser is opened with the given Url ,by default it will not be full maximized , we need to maximize it by using the above code.  
	     WebElement Element = driver.findElement(By.xpath("/html/body/div[23]/iframe")); // To identify a frame i.e Frame1 we need to identify it by using either Id or Name properties.  
         // Here 'Element' variable holds Complete information about the frame such as Frame displayed / Exists ,Frame coordinates , etc.  
         driver.switchTo().frame(Element) ;    
	     
         Thread.sleep(5000);  
          
	     driver.findElement(By.name("TypeActualDisplay")).sendKeys("Battery and Accessory Part");
	     Thread.sleep(5000); 
	     Point createnewpartOrg = driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/input[1]")).getLocation();
	     Robot robotcreatepartorg = new Robot();	     
	     robotcreatepartorg.mouseMove(createnewpartOrg.x+1500,createnewpartOrg.y+240);
	     WebElement markNewsorg = driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[1]/table/tbody/tr/td"));
	     markNewsorg.click();
	              
         //driver.findElement(By.name("btnTypeActual")).click();
         
	     Thread.sleep(10000); 
	     
     
	     Select partFamily = new Select(driver.findElement(By.xpath("//*[@id=\"PartFamilyId\"]")));
	     partFamily.selectByVisibleText("Batteries");	    
	     
		 driver.findElement(By.id("VPMProductName1")).sendKeys("Test Data sel");
		 
		//saving New Part new file
		 
		 driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/a/button")).click();
	     
         
      
  }
 

  @AfterMethod
  public void close() {
	//driver.close();
	//  driver.quit();
  }
}
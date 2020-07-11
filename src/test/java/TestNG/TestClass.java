package TestNG;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;


import org.testng.annotations.Test;

public class TestClass {
	
		WebDriver driver;
		Actions act;
		String parentWinHandle;
		@BeforeClass
		public void launch() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();	
			act = new Actions(driver);
			driver.manage().window().maximize();
		}
		
		@Test
		 public void verifyALogintoApplication() throws InterruptedException, AWTException {	                  
			    driver.get("https://qa3dexp.nventco.com/3dpassport/login?service=https%3A%2F%2Fqa3dexp.nventco.com%2F3dspace%2Fcommon%2FemxNavigator.jsp");
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driver.findElement(By.name("username")).sendKeys("E1125316");
			    driver.findElement(By.name("password")).sendKeys("Plm12345");
			    driver.findElement(By.xpath("//div[@class='commands']")).click();
			    Thread.sleep(50000);
			    System.out.println("Login Successfully button clicked");
			    parentWinHandle = driver.getWindowHandle();
			    
			    
	 }
		
		@Test
		 public void verifyBAddExistingParttoLibrary() throws InterruptedException, AWTException {	                  
			    //Thread.sleep(5000);
			    driver.findElement(By.xpath("//div[@class='compass-small-over']")).click();
			    
			    Thread.sleep(5000);
			    //driver.findElement(By.linkText("Classify & Reuse")).click();
			    driver.findElement(By.xpath("//*[@id=\"icon-ENOCLRE_AP\"]")).click();
			    
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     //Once the browser is opened with the given Url ,by default it will not be full maximized , we need to maximize it by using the above code.  
			     WebElement Element = driver.findElement(By.xpath("//*[@id=\"content\"]")); // To identify a frame i.e Frame1 we need to identify it by using either Id or Name properties.  
		         // Here 'Element' variable holds Complete information about the frame such as Frame displayed / Exists ,Frame coordinates , etc.  
		         driver.switchTo().frame(Element) ;    
			     
		         Thread.sleep(5000);  
		         
		         driver.findElement(By.xpath("/html/body/form[1]/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td[3]/a")).click();
		         
		         //tree node expand
		         
		         Thread.sleep(10000);
		         
		         
		         Robot robotlevel1 = new Robot();	     
		         robotlevel1.mouseMove(55,384);
			     
			   //Clicks Left mouse button
		         robotlevel1.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		         robotlevel1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("AddExistingPart Tree Level 1 button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(5000);
			     
			     
			     Robot robotlevel2 = new Robot();	     
			     robotlevel2.mouseMove(75,433);
			     
			   //Clicks Left mouse button
			     robotlevel2.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotlevel2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("AddExistingPart Tree Level 2 button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(5000);
			     
			     Robot robotlevel3 = new Robot();	     
			     robotlevel3.mouseMove(95,460);
			     
			   //Clicks Left mouse button
			     robotlevel3.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotlevel3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("AddExistingPart Tree Level 3 button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(5000);
			     
			     Robot robotlevel4 = new Robot();	     
			     robotlevel4.mouseMove(115,485);
			     
			   //Clicks Left mouse button
			     robotlevel4.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotlevel4.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("AddExistingPart Tree Level 4 button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(5000);
			     
			     Robot robotlevel5 = new Robot();	     
			     robotlevel5.mouseMove(155,485);
			     
			   //Clicks Left mouse button
			     robotlevel5.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotlevel5.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("AddExistingPart Level 4 Content button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(5000);
		                                      
		                		 
		        		 
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     //Once the browser is opened with the given Url ,by default it will not be full maximized , we need to maximize it by using the above code.  
			     WebElement Element1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/iframe")); // To identify a frame i.e Frame1 we need to identify it by using either Id or Name properties.  
		         // Here 'Element' variable holds Complete information about the frame such as Frame displayed / Exists ,Frame coordinates , etc.  
		         driver.switchTo().frame(Element1) ;  
		                 
		         Thread.sleep(5000);
		         driver.findElement(By.xpath("/html/body/form[1]/div[1]/div[1]/div[2]/div[1]/table/tbody/tr/td[1]")).click();
		         
		         Thread.sleep(5000);
		         driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a/label")).click();
		         
		        
	            Thread.sleep(20000);
			     
			     Robot robotpopupscreenlevel1 = new Robot();	     
			     robotpopupscreenlevel1.mouseMove(720,435);
			     
			   //Clicks Left mouse button
			     robotpopupscreenlevel1.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotpopupscreenlevel1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("Popup search button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(20000);		    
	            
			     
			     Robot robotpopupscreenlevel2 = new Robot();	     
			     robotpopupscreenlevel2.mouseMove(782,532);
			     
			   //Clicks Left mouse button
			     robotpopupscreenlevel2.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotpopupscreenlevel2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("checkbox selection button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(20000);
			     
			     Robot robotpopupscreensubmit = new Robot();	     
			     robotpopupscreensubmit.mouseMove(1382,850);
			     
			   //Clicks Left mouse button
			     robotpopupscreensubmit.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotpopupscreensubmit.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("Popup search button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(20000);
			    
	 }

		@Test
		 public void verifyCCreatePart() throws InterruptedException, AWTException {	          
			    //Thread.sleep(50000);
			    System.out.println("Create Part Start");
			    
			    Robot robothome = new Robot();	     
			    robothome.mouseMove(1855,125);
			   //Clicks Left mouse button
			    robothome.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			    robothome.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			    System.out.println("Home button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//div[@class='add topbar-menu-item topbar-cmd fonticon fonticon-plus']")).click();
			    
			    Thread.sleep(5000);
			   
			    Point engineering = driver.findElement(By.xpath("//span[text()='Engineering']")).getLocation();
			    Robot roboteng = new Robot();
			    roboteng.mouseMove(engineering.x,engineering.y+110);
			    Thread.sleep(500);       
			     
			     
			     Point part = driver.findElement(By.xpath("//span[text()='Part']")).getLocation();
			     Robot robotpart = new Robot();
			     robotpart.mouseMove(part.x+50,part.y+125);
			     Thread.sleep(500); 
			     
			     Point createnewpart = driver.findElement(By.xpath("//span[text()='Create Part']")).getLocation();
			     Robot robotcreatepart = new Robot();	
			     WebElement markNews = driver.findElement(By.xpath("//span[text()='Create Part']"));
			     markNews.click();
			     robotcreatepart.mouseMove(createnewpart.x,createnewpart.y+120);
			     Thread.sleep(500);

			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     //Once the browser is opened with the given Url ,by default it will not be full maximized , we need to maximize it by using the above code.  
			     WebElement Element = driver.findElement(By.xpath("/html/body/div[24]/iframe")); // To identify a frame i.e Frame1 we need to identify it by using either Id or Name properties.  
		         // Here 'Element' variable holds Complete information about the frame such as Frame displayed / Exists ,Frame coordinates , etc.  
		         driver.switchTo().frame(Element) ;    
			     
		         Thread.sleep(5000);  
		          
			     driver.findElement(By.name("TypeActualDisplay")).sendKeys("Fixed Capacitor Part");
			     Thread.sleep(5000); 
			     Point createnewpartOrg = driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/input[1]")).getLocation();
			     Robot robotcreatepartorg = new Robot();	     
			     robotcreatepartorg.mouseMove(createnewpartOrg.x+1500,createnewpartOrg.y+240);
			     WebElement markNewsorg = driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/div[1]/table/tbody/tr/td"));
			     markNewsorg.click();
			              
		         //driver.findElement(By.name("btnTypeActual")).click();
		         
			     Thread.sleep(10000); 
			     
		     
			     Select partFamily = new Select(driver.findElement(By.xpath("//*[@id=\"PartFamilyId\"]")));
			     partFamily.selectByVisibleText("Capacitor Ceramic Single Layer");	    
			     
			    // driver.findElement(By.xpath("//*[@id=\"NoOfParts\"]")).sendKeys("3");;
			     
				 driver.findElement(By.id("VPMProductName1")).sendKeys("Test Data sel");
				 
				//saving New Part new file
				 
				 driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/a/button")).click(); 
				 
				 Thread.sleep(10000); 
			
				 
		}
		
		@Test
		 public void verifyDUpdateEBOMthroughImport() throws InterruptedException, AWTException {
				 
			/*	 Robot robotlevel1 = new Robot();	     
		         robotlevel1.mouseMove(55,320);
			     
			   //Clicks Left mouse button
		         robotlevel1.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		         robotlevel1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); */
			
			     clickLeftNavMenu(parentWinHandle, "catMenu", "li_ENCEBOMPowerViewCommand");
			
			     System.out.println("UpdateEBOMthroughImport Level 1 button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(10000);
			     
			     Robot robotlevel2 = new Robot();	     
			     robotlevel2.mouseMove(900,320);
			     
			   //Clicks Left mouse button
			     robotlevel2.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotlevel2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("UpdateEBOMthroughImport EBOM Import button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(10000);
			
			     // enter the file path onto the file-selection input field
			     
			   
			   //Once the browser is opened with the given Url ,by default it will not be full maximized , we need to maximize it by using the above code.  
			     WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"pagecontent\"]")); // To identify a frame i.e Frame1 we need to identify it by using either Id or Name properties.  
		         // Here 'Element' variable holds Complete information about the frame such as Frame displayed / Exists ,Frame coordinates , etc.  
		         driver.switchTo().frame(Element1) ;  
			     
			     driver.findElement(By.name("file")).sendKeys("C:\\Data\\TestFilesBOMTastic.xlsx");

			        // enter the file path onto the file-selection input field
			       
			     
			     ////////
			     
			     Robot robotlevel5 = new Robot();	     
			     robotlevel5.mouseMove(1770,1015);
			     
			   //Clicks Left mouse button
			     robotlevel5.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotlevel5.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("UpdateEBOMthroughImport Level 3 button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			     
			     //driver.findElement(By.xpath("//div[@class='btn-primary']")).click();
			     Thread.sleep(5000);
		         
		      
		  }
		 
		@Test
		 public void verifyERemoveEBOM() throws InterruptedException, AWTException {
				 
			 Thread.sleep(10000);
			/* Robot robotlevelrem1 = new Robot();	     
			 robotlevelrem1.mouseMove(55,320);
		     
		   //Clicks Left mouse button
			 robotlevelrem1.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			 robotlevelrem1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); */
			 
			 clickLeftNavMenu(parentWinHandle, "catMenu", "li_ENCEBOMPowerViewCommand");
			 
		     System.out.println("Level 1 button clicked");
		     
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     
		     Thread.sleep(10000);
		     
		     Robot robotlevelrem2 = new Robot();	     
		     robotlevelrem2.mouseMove(1200,320);
		     
		   //Clicks Left mouse button
		     robotlevelrem2.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		     robotlevelrem2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		     System.out.println("Level 2 button clicked");
		     
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     
		     Thread.sleep(5000);
		     
		     Robot robotlevelrem3 = new Robot();	     
		     robotlevelrem3.mouseMove(1200,365);
		     
		   //Clicks Left mouse button
		     robotlevelrem3.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		     robotlevelrem3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		     System.out.println("Level 2 button clicked");
		     
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     
		     Thread.sleep(10000);
		     
		     Robot robotlevelrem4 = new Robot();	     
		     robotlevelrem4.mouseMove(270,440);
		     
		   //Clicks Left mouse button
		     robotlevelrem4.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		     robotlevelrem4.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		     System.out.println("Level 2 button clicked");
		     
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     
		     Thread.sleep(5000);
		     
		     Robot robotlevelrem5 = new Robot();	     
		     robotlevelrem5.mouseMove(390,320);
		     
		   //Clicks Left mouse button
		     robotlevelrem5.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		     robotlevelrem5.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		     System.out.println("Level 2 button clicked");
		     
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     
		     Thread.sleep(5000);
		     
		     
		     Robot r = new Robot();
		     r.keyPress(KeyEvent.VK_ENTER);
		     r.keyRelease(KeyEvent.VK_ENTER);
		
		     Thread.sleep(5000);	 		         
		      
		  }
		
		@Test
		 public void verifyFFileUploadCheckIn() throws InterruptedException, AWTException {	          
			    //Thread.sleep(50000);
			    System.out.println("Create Part Start");
			    
			    Robot robothome = new Robot();	     
			    robothome.mouseMove(1855,125);
			   //Clicks Left mouse button
			    robothome.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			    robothome.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			    System.out.println("Home button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//div[@class='add topbar-menu-item topbar-cmd fonticon fonticon-plus']")).click();
			    
			   
			   // driver.findElement(By.xpath("//div[@class='add topbar-menu-item topbar-cmd fonticon fonticon-plus']")).click();
			    
			    Point engineering = driver.findElement(By.xpath("//span[text()='Engineering']")).getLocation();
			    Robot robotengineering = new Robot();
			    robotengineering.mouseMove(engineering.x,engineering.y+110);
			    Thread.sleep(500);       
			     
			     
			     Point specification = driver.findElement(By.xpath("//span[text()='Specifications']")).getLocation();
			     Robot robotspecification = new Robot();
			     robotspecification.mouseMove(specification.x+100,specification.y+125);
			     Thread.sleep(500); 
			     
			     Point createnewspecification = driver.findElement(By.xpath("//span[text()='Create Part Specification']")).getLocation();
			     Robot robotcreatespecification = new Robot();	
			     WebElement markNews = driver.findElement(By.xpath("//span[text()='Create Part Specification']"));
			     markNews.click();
			     robotcreatespecification.mouseMove(createnewspecification.x,createnewspecification.y+120);
			     Thread.sleep(500);
			     
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     //Once the browser is opened with the given Url ,by default it will not be full maximized , we need to maximize it by using the above code.  
			     WebElement Element = driver.findElement(By.xpath("/html/body/div[24]/iframe")); // To identify a frame i.e Frame1 we need to identify it by using either Id or Name properties.  
		         // Here 'Element' variable holds Complete information about the frame such as Frame displayed / Exists ,Frame coordinates , etc.  
		         driver.switchTo().frame(Element) ;    
			     
		         Thread.sleep(5000);  
		         
		        // driver.findElement(By.id("Name")).sendKeys("TestDataSel1");
			     Point createnewspecificationorg = driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[7]/td/table/tbody/tr/td/input[2]")).getLocation();
			     Robot robotspecificationorg = new Robot();	     
			     robotspecificationorg.mouseMove(createnewspecificationorg.x,createnewspecificationorg.y+240);
			     WebElement markNewsorg = driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[7]/td/table/tbody/tr/td/input[2]"));
			     markNewsorg.click();
			     
			     driver.findElement(By.id("Title1")).sendKeys("TestDataSel1");
			     Thread.sleep(5000); 
			              
			     driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/a/button")).click();
			     
			     
			     Thread.sleep(10000);
				/* Robot robotlevelrem1 = new Robot();	     
				 robotlevelrem1.mouseMove(55,345);
			     
			   //Clicks Left mouse button
				 robotlevelrem1.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
				 robotlevelrem1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);*/
			     
			     clickLeftNavMenu(parentWinHandle, "catMenu" , "li_APPDocumentFiles");
			     
			     System.out.println("Level 1 button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			     
			    	     
			    
			     
			     Thread.sleep(10000);
			     
			     Robot robotlevelrem2 = new Robot();	     
			     robotlevelrem2.mouseMove(240,290);
			     
			   //Clicks Left mouse button
			     robotlevelrem2.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			     robotlevelrem2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			     System.out.println("Level 2 button clicked");
			     
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     
			     Thread.sleep(10000);
			     //Nilesh Code Start  
			    
                 //Store the current window handle
                   String winHandleBefore = driver.getWindowHandle();
                   //String popupWindow = "";
                   
                   //switchToNewWindow(2);
                   
                   
                   int count =0;
                   for(String winHandle : driver.getWindowHandles()){
                         count++;
                         if(count==2)
                         {
                                //break;//control will be switched to second window
                                //System.out.println(winHandle);//will return the reference of second window
                                driver.switchTo().window(winHandle);
                         }

                        }

                   
                   WebElement frame1 = driver.findElement(By.name("checkinFrame"));
                   driver.switchTo().frame(frame1);
                   WebElement driverPopup = driver.findElement(By.name("bfile0"));
                   driverPopup.sendKeys("C:\\Data\\TestFilesBOMTastic.xlsx");
                   
                   Thread.sleep(10000); 
                   
                   ((JavascriptExecutor)driver).executeScript("checkinFile();");
                  
                   
                   Thread.sleep(10000);
                   driver.switchTo().window(parentWinHandle);
          	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
          	       
	
		      
		  }		      
				 
	

@Test
public void verifyGPromoteSpecificationMethod() throws InterruptedException, AWTException {	     
           
	  //parentWinHandle = driver.getWindowHandle();  
    
    Thread.sleep(10000);
    clickLeftNavMenu(parentWinHandle, "catMenu", "li_AEFLifecycle");
    System.out.println("Level 1 button clicked");
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
    Thread.sleep(10000);
    
    Robot robotlevelrem2 = new Robot();	     
    robotlevelrem2.mouseMove(285,375);
    
  //Clicks Left mouse button
    robotlevelrem2.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
    robotlevelrem2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    System.out.println("Level 2 button clicked");
    
    
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
    driver.switchTo().window(parentWinHandle);
    
    Thread.sleep(10000);  
	     
}
		
@Test
public void verifyZSignoutMethod() throws InterruptedException, AWTException {	  
				Robot robothome = new Robot();	     
				robothome.mouseMove(1855,125);
				//Clicks Left mouse button
				robothome.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
				robothome.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				System.out.println("Home button clicked");
		     
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    
			    driver.findElement(By.xpath("//div[@class='profile topbar-menu-item topbar-cmd fonticon fonticon-user-alt']")).click();		    
			    
			    //Point signOut = driver.findElement(By.xpath("/html/body/div[23]/div[1]/div[1]/ul/li[7]/div/span")).getLocation();
			    Point signOut = driver.findElement(By.xpath("//span[text()='Sign Out']")).getLocation();
			     Robot roboteng = new Robot();	    
			     roboteng.mouseMove(signOut.x,signOut.y+145);
			     Thread.sleep(5000);
			     //WebElement markNews = driver.findElement(By.xpath("/html/body/div[23]/div[1]/div[1]/ul/li[7]/div/span"));
			     WebElement markNews = driver.findElement(By.xpath("//span[text()='Sign Out']"));
			     markNews.click();
			     
			     Thread.sleep(500);
		 }
		
public void clickLeftNavMenu(String parentWinHandle, String menuID, String menuTitle) {
		    String currentWinHandle = driver.getWindowHandle();
		    driver.switchTo().window(parentWinHandle);
		    List<WebElement> elements = driver.findElements(By.id(menuID));
		  /*  System.out.println("Number of elements in " + menuID +":" +elements.size());
		    for (int i=0; i<elements.size();i++){
		           System.out.println("class text:" + elements.get(i).getAttribute("class"));
		   
		    }*/
		   
		   
		   WebElement catMenu = elements.get(0);
		   
		   
		   // List<WebElement> ulLinks = catMenu.findElements(By.tagName("ul"));
		  
		    List<WebElement> liLinks = catMenu.findElements(By.tagName("li"));
		   
		    for (int i=0; i<liLinks.size();i++){
		        //System.out.println("liLinks:" + liLinks.get(i).getAttribute("name"));
		       
		        if(liLinks.get(i).getAttribute("name").compareToIgnoreCase(menuTitle)== 0) {
		            liLinks.get(i).click();
		        }
		     }
		   
		    driver.switchTo().window(currentWinHandle);
		}

		  @AfterClass
		  public void close() throws InterruptedException {
			 // Thread.sleep(10000);
			//driver.close();
			//driver.quit();
		  }
		}
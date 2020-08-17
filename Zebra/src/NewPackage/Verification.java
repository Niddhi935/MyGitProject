package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verification {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nidshah\\OneDrive - ALLEGIS GROUP\\Documents\\Nid document\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Verify the Title
		 String baseUrl = "https://www.thezebra.com/";
	     String expectedTitle = "The Zebra: Instantly Compare Insurance Quotes";
	     String actualTitle = "";
	     driver.get(baseUrl);
	     actualTitle = driver.getTitle();
	     
	     if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Title is same!");
	        } else {
	            System.out.println("Test Failed");
	        }
	     //Verify the Logo
	    if(driver.findElement(By.xpath("//span[contains(@class,'sr-only')]  [contains(text(),'The Zebra®')]")) != null)
	         
	    {
	    	 System.out.println("Homepage Logo is Present");
	    }else
	    {
	    	System.out.println("Homepage Logo is not Present");
	    }
	    
	     
	     //Verify the Radio Button for car insurance
	     boolean car = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/div[1]/div[1]/label")).isSelected();
	     if(car = true)
	     {
	    	 System.out.println("Car insurance Radio button is selected");
	     }else
	     {
	    	 System.out.println("Car insurance Radio button is not selected");
	     }
	    	 
	     
	     
	   //Verify the Radio Button for Home insurance
	     if(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/div[1]/div[3]/label")).isDisplayed())
	    {
	    	 System.out.println("Home insurance Radio button is present");
	    }else
	    {
	    	System.out.println("Home insurance Radio button is not present");
	    }
	     
	     
	     //Verify the TextBox for car Zipcode
	     if(driver.findElement(By.name("zipcode")).isEnabled())
	     {
	    	 System.out.println("Zipcode text box is Enabled");
	     }else
	     {
	    	 System.out.println("Zipcode text box is not Enabled");
	     }
	     
	     
	     //Verify the Start Button 
	     if(driver.findElement(By.cssSelector("button[class='btn btn-square btn-icon-right btn-arrow form-inline-submit-button']")).isEnabled())
	     {
	    	 System.out.println("Start Button is Enabled");
	     }else
	     {
	    	 System.out.println("Start Button is not Enabled");
	     }
	     //Verify the Phone number
	     if(driver.findElement(By.xpath("//span[contains(@class,'cta-phone-display')]  [contains(text(),'1.888.255.4364')]")) != null)
	     {
	    	 System.out.println("Phone Number is Present");
	     }
	     else
	     {
	    	 System.out.println("Phone Number is not Present");
	     }
	     
	     //Verify the Compare Link
	  boolean compare = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/a/span")).isDisplayed();
	  if(compare = true)
	  {	  
	     System.out.println("Compare dropdown is appearing");
	  }else {
		  System.out.println("Compare dropdown is not appearing");
	  }
	     
	     //Verify the Tools & Tips Link
	    boolean Tool = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/a/span")).isDisplayed();
	    if(Tool = true)
	    {
	    	System.out.println("Tools & Tips dropdown is appearing");
	    }else
	    {
	    	System.out.println("Tools & Tips dropdown is not appearing");
	    }
	    
	     
	    //Verify the Company Link
	     boolean Company = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/a/span")).isDisplayed();
	     if(Company = true)
	     {
	    	 System.out.println("Company dropdown is appearing");
	     }else
	     {
	    	 System.out.println("Company dropdown is not appearing");
	     }
	     
	     
	     
	}
		
}

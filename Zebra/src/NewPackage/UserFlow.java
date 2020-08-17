package NewPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class UserFlow {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nidshah\\OneDrive - ALLEGIS GROUP\\Documents\\Nid document\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.thezebra.com/");
		
		
		//Enter zipcode ad click on start
		
		driver.findElement(By.name("zipcode")).sendKeys("21075");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/div[2]/div[1]/div[2]/button/span[1]")).click();
			
		
		//Navigate to the start page
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.navigate().to("https://www.thezebra.com/z/questions/start/");
		driver.findElement(By.xpath("//*[@id=\"currently_insuredstart\"]/div[2]/label[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"residence_ownershipstart\"]/div[2]/label[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"user_intentstart\"]/div[2]/label[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"startSaveBtn\"]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		//Navigate to the start detail page
		driver.navigate().to("https://www.thezebra.com/z/questions/start/details/");
		driver.findElement(By.xpath("//*[@id=\"garaging_addressInput\"]")).sendKeys("8004 blue stream drive,");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		List<WebElement> suggestion = driver.findElements(By.xpath("//*[@id=\"PlacesAutocomplete__suggestion-ChIJm_R3tADht4kRROUtiR_kUCQ\"]"));
		for (WebElement suggest : suggestion) 
		{
			System.out.println(suggest.getText());
			if(suggest.getText().equals("8004 Blue Stream Drive, Elkridge, MD, USA"))
			{
				suggest.click();
				break;
			}		
		}
		
				
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("first_namestart")).sendKeys("nshah");
		driver.findElement(By.id("last_namestart")).sendKeys("shah");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("date_of_birthstart")).sendKeys("02/14/1992");
		driver.findElement(By.id("startDetailsSaveBtn")).click();
				
		//Navigate to the loading page
				
		driver.navigate().to("https://www.thezebra.com/z/loading");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				
		//Navigate to the vehicle page
		
		
		driver.navigate().to("https://www.thezebra.com/z/questions/vehicles/select/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"yearYear-0Input-0\"]"));
		List<WebElement> year = driver.findElements(By.xpath("//*[@id=\"year-0-2019-0\"]"));
	  	for (WebElement value : year) 
		{
			System.out.println(value.getText());
			if(value.getText().equals("2019"))
			{
				value.click();
				break;
			}
		}
		
	  
		
	  	driver.findElement(By.xpath("//*[@id=\"makeMake-0Input-0\"]"));
	  	List<WebElement> model = driver.findElements(By.xpath("//*[@id=\"make-0-Acura-0\"]")); 
		for (WebElement value2 : model)
		{
			System.out.println(value2.getText());
			if(value2.getText().equals("Acura"))
			{
				value2.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"modelModel-0Input-0\"]"));
		List<WebElement> make = driver.findElements(By.xpath("//*[@id=\"model-0-Tlx-0\"]"));
		for (WebElement value3 : make)
		{
			System.out.println(value3.getText());
			if(value3.getText().equals("TLX"))
			{
				value3.click();
				break;
			}
		}
				
		driver.findElement(By.xpath("//*[@id=\"submodelSubmodel-0Input-0\"]"));
		List<WebElement> submodel = driver.findElements(By.xpath("//*[@id=\"submodel-0-4drSedan-0\"]"));
		for (WebElement value4 : submodel) 
		{
			System.out.println(value4.getText());
			if(value4.getText().equals("4dr Sedan"))
			{
				value4.click();
				break;
			}
		}
										
		driver.findElement(By.xpath("//*[@id=\"vehiclesSelectSaveBtn\"]")).click();
				
				
		//Navigate to the vehicle detail page
		driver.navigate().to("https://www.thezebra.com/z/questions/vehicles/details/");
				
		driver.findElement(By.xpath("//*[@id=\"ownership-0\"]/div[2]/label[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"primary_use-0\"]/div[2]/label[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"miles-input-0\"]")).sendKeys("4000");
		driver.findElement(By.xpath("//*[@id=\"mileage_periodMileage_periodInput-0\"]"));
		List<WebElement> frequency = driver.findElements(By.xpath("//*[@id=\"mileage_period-PerYear-0\"]"));
		for (WebElement per : frequency) 
		{
			System.out.println(per.getText());
			if(per.getText().equals("per year"))
			{
				per.click();
				break;
			}
		}
		
				
		driver.findElement(By.xpath("//*[@id=\"vehiclesDetailsSaveBtn\"]")).click();
				
				
	/*	driver.navigate().to("https://www.thezebra.com/z/questions/drivers/details/");
		driver.findElement(By.xpath("//*[@id=\"first_name-0\"]")).sendKeys("nshah");
		driver.findElement(By.xpath("//*[@id=\"driver-last_name-0\"]")).sendKeys("shah");
		driver.findElement(By.xpath("//*[@id=\"date_of_birth-0\"]")).sendKeys("02/14/1992");				
		driver.findElement(By.xpath("//*[@id=\"garaging_addressInput\"]]")).sendKeys("8004 blue stream drive,");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		List<WebElement> suggestion1 = driver.findElements(By.xpath("//*[@id=\"PlacesAutocomplete__suggestion-ChIJm_R3tADht4kRROUtiR_kUCQ\"]"));
		for (WebElement suggest1 : suggestion1)
		{
			System.out.println(suggest1.getText());
			if(suggest1.getText().equals("8004 Blue Stream Drive, Elkridge, MD, USA"))
			{
				suggest1.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("vehiclesDetailsSaveBtn")).click();
		*/
				
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//Navigate to the driver detail page
		driver.navigate().to("https://www.thezebra.com/z/questions/drivers/details/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//*[@id=\"gender-0\"]/div[2]/label[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"marital_status-0\"]/div[2]/label[1]/div")).click();
		driver.findElement(By.xpath("///*[@id=\"credit_score-0\"]/div[2]/label[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"education-0\"]/div[2]/label[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"violations-0\"]/div[2]/label[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"email-0\"]")).sendKeys("niddhi1215@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"add_another-0\"]/div[2]/label[2]/div"));
		
		driver.findElement(By.xpath("//*[@id=\"summaryShowQuotesBtn\"]")).click();
		
		driver.navigate().to("https://www.thezebra.com/z/rate-select/");
	
		driver.close();
	
		
		
	}

}

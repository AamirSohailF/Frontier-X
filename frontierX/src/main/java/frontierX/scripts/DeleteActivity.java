package frontierX.scripts;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import frontierX.pages.BasicSettings;
import frontierX.pages.HomePage;
import frontierX.pages.LoginPage;

public class DeleteActivity extends BasicSettings {

	@Test
	public void deleteActivity() {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the environment : ");
		String env = s.next();

	    System.out.println("Enter the user for which you want to automate : ");
	    String aut = s.next();
	      
	    if (aut.equalsIgnoreCase("admin") || aut.equalsIgnoreCase("doctor") || aut.equalsIgnoreCase("premium")
	    		|| aut.equalsIgnoreCase("user")) {
			
			
	    	WebDriver driver = null ;
			
			if (env.equalsIgnoreCase("staging") || env.equalsIgnoreCase("stage")) {				
				driver = setUp();
			}
			
			else if (env.equalsIgnoreCase("production") || env.equalsIgnoreCase("prod")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://app.fourthfrontier.com/#/login");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			}
			
			else {
				Assert.fail("Environment not executable");
			}
	    	
	    	
	    	
	    	
	    	
			LoginPage lp = new LoginPage(driver);
			HomePage hp = null ;
			
			if (aut.equalsIgnoreCase("admin")) {
				hp = lp.login("admin@fourthfrontier.com", "automation4f");
			}
			
			else if (aut.equalsIgnoreCase("doctor")) {
				hp = lp.login("doctor@fourthfrontier.com", "automation4f");
			}
			
			else if (aut.equalsIgnoreCase("premium")) {
				hp = lp.login("premium@fourthfrontier.com", "automation4f");
			}
			
			else if (aut.equalsIgnoreCase("user")) {
				hp = lp.login("user@fourthfrontier.com", "automation4f");
			}
			
			else {
				System.out.println("Invalid user name. Please enter valid user name");
			}
			
			
			
			try {			
				hp.enterWorkout("strength");
				hp.clickOnSearchWorkout();
				hp.clickOnActivityButton();
				mySleepInSeconds(3);
				hp.deleteActivity();
				mySleepInSeconds(3);
				hp.keepButton();
				mySleepInSeconds(3);
				hp.logout();
			} 
			
			catch (Exception e) {
				System.out.println("Activity Not Found");
			} 

			
			mySleepInSeconds(3);
			driver.close();
	    	
		}
	    
	    
	    else {
	    	Assert.fail("User is Invalid. Please enter valid user");
		}
	    
	}


	
}

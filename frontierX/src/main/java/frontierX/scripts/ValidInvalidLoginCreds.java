package frontierX.scripts;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import frontierX.pages.BasicSettings;
import frontierX.pages.HomePage;
import frontierX.pages.LoginPage;

public class ValidInvalidLoginCreds extends BasicSettings {

	@Test
	public void loginCredentials() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the environment : ");
		String env = s.nextLine();
		
		System.out.println("Enter the user for which you want to automate : ");
	    String aut = s.nextLine();
	    aut = aut.toLowerCase();
	    
	    System.out.println("Enter " + aut + "'s Email : ");
	    String em = s.nextLine();
	    
	    System.out.println("Enter " + aut + "'s Password : ");
	    String pwd = s.nextLine();

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
		
		
		
		switch (aut) {
		case "admin": 
			if (aut.equalsIgnoreCase("admin")) {
				if (em.equals("admin@fourthfrontier.com") && pwd.equals("automation4f")) {
					hp = lp.login(em, pwd);
					mySleepInSeconds(8);
					driver.close();
				}

				else {
					hp = lp.login(em, pwd);
					mySleepInSeconds(8);
					driver.close();
					Assert.fail("Username does not match with its mail or password");
				}
			break ;
			}
			
			
			
		case "doctor":
			if (aut.equalsIgnoreCase("doctor")) {
				if (em.equals("doctor@fourthfrontier.com") && pwd.equals("automation4f")) {
					hp = lp.login(em, pwd);
					mySleepInSeconds(8);
					driver.close();
				}

				else {
					hp = lp.login(em, pwd);
					mySleepInSeconds(8);
					driver.close();
					Assert.fail("Username does not match with its mail or password");
				}
			break;
	
			}
			
						
		
		case "premium":
			if (aut.equalsIgnoreCase("premium")) {
				if (em.equals("premium@fourthfrontier.com") && pwd.equals("automation4f")) {
					hp = lp.login(em, pwd);
					mySleepInSeconds(8);
					driver.close();
				}

				else {
					hp = lp.login(em, pwd);
					mySleepInSeconds(8);
					driver.close();
					Assert.fail("Username does not match with its mail or password");
				}
				
				break;
	
			}
						
			
		case "user":
			if (aut.equalsIgnoreCase("user")) {
				if (em.equals("user@fourthfrontier.com") && pwd.equals("automation4f")) {
					hp = lp.login(em, pwd);
					mySleepInSeconds(8);
					driver.close();
				}

				else {
					hp = lp.login(em, pwd);
					mySleepInSeconds(8);
					driver.close();
					Assert.fail("Username does not match with its mail or password");
				}
				
				break;
	
			}
			
			
		default:
			driver.close();
			Assert.fail("Invalid User Name Provided. Please Give a valid User Name");
			break;
			
		}
		
		
	}
}

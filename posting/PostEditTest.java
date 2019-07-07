package posting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import data.DataConst;
import registration.RegRun;

public class PostEditTest {
	
	public static void editFirstPost() {
		WebDriver driver = new ChromeDriver();
		
		// create actions instance for double clicking input text field
		Actions a = new Actions(driver);
		
		// go to index page
		driver.get(DataConst.getUrl());
		
		// maximize browser windows
		driver.manage().window().maximize();
		
		// auto-create single test account and login
		try {
			RegRun.RegAndLogTestAccount(driver);
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to create test account");
			e.printStackTrace();
		}
		
		// create a single post
		try 
		{
			PostCreateRun.AutomatedInput(driver, 1);
		} 
		catch (Exception e) 
		{	
			System.out.println("Unable to create posts");
			e.printStackTrace();
		}
		
		String s = "Edit post successful";
		try {
			PostEditRun.editFirstPost(driver, a, s);
		} catch (InterruptedException e) {
			System.out.println("Unable to edit post");
			e.printStackTrace();
		}
	}
}

package posting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import registration.RegRun;
import util.Excel;

public class PostDeleteTest {
	
	public static void deleteFirstNPosts(int n) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
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
			System.out.println("Unable to make test account");
			e.printStackTrace();
		}
		
		// number of posts we want to create
		int j = 3;
		
		// create n number of posts with table data
		for(int i = 1; i <= j; i++) {
			try 
			{
				PostCreateRun.AutomatedInput(driver, i);
			} 
			catch (Exception e) 
			{	
				System.out.println("Unable to create posts");
				e.printStackTrace();
			}
		}
		
		// delete n number of posts
		for(int i = 0; i < n; i++) {
			PostDeleteRun.automatedDelete(driver);
		}
	}
}

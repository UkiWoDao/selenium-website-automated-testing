package posting;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import registration.RegRun;
import util.Excel;
//import util.ImageUpload;

public class PostCreateRun {
	
	public static void ManualInput() throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		/* prompt user for input*/
		System.out.println("Enter post name");
		String name = sc.next();
		
		System.out.println("Enter post location");
		String location = sc.next();
		
		System.out.println("Enter dropdown option");
		String option = sc.next();
		
		System.out.println("Enter post description");
		String text = sc.next();
		
		sc.close();
		
		PostInteract.clickMakePost(driver);
		
		/* create post */
		PostInteract.clickName(driver);
		PostInteract.inputName(driver, name);
		
		PostInteract.clickLocation(driver);
		PostInteract.inputLocation(driver, location);
		
		// choose random picture for upload
		PostInteract.clickImageUpload(driver);
		
		// allow upload time for ancient computers may god have mercy on their soul
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		PostInteract.selectDropdown(driver, option);
		
		PostInteract.clickDescription(driver);
		PostInteract.inputDescription(driver, text);
		
		PostInteract.submitPost(driver);
	}
	
	public static void AutomatedInput(WebDriver driver, int i) throws Exception {
		
		// initialize excel sheet
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getTEXTSHEET());
		
		PostInteract.clickMakePost(driver);
		
		PostInteract.clickName(driver);
		String name = Excel.getCellData(i, 1);
		PostInteract.inputName(driver, name);
		Thread.sleep(500);
		
		PostInteract.clickLocation(driver);
		String location = Excel.getCellData(i, 2);
		PostInteract.inputLocation(driver, location);
		Thread.sleep(500);
		
		PostInteract.selectDropdown(driver, "Walk");
		Thread.sleep(500);
		
		PostInteract.clickDescription(driver);
		String text = Excel.getCellData(i, 0);
		PostInteract.inputDescription(driver, text);
		Thread.sleep(500);
		
		PostInteract.submitPost(driver);
	}
}

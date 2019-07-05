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
	
	public static int rowCount;
	
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
			System.out.println("Something went wrong");
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
		
		PostCreateInteract.clickMakePost(driver);
		
		/* create post */
		PostCreateInteract.clickName(driver);
		PostCreateInteract.inputName(driver, name);
		
		PostCreateInteract.clickLocation(driver);
		PostCreateInteract.inputLocation(driver, location);
		
		// choose random picture for upload
		PostCreateInteract.clickImageUpload(driver);
		
		// allow upload time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		PostCreateInteract.selectDropdown(driver, option);
		
		PostCreateInteract.clickDescription(driver);
		PostCreateInteract.inputDescription(driver, text);
		
		PostCreateInteract.submitPost(driver);
	}
	
	public static void AutomatedInput(WebDriver driver, int i) throws Exception {
		
		// initialize excel sheet
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getTEXTSHEET());
		
		// get number of rows
		rowCount = Excel.getHWorkSheet().getLastRowNum();
		
		// go to index page
		driver.get(DataConst.getUrl());
		
		// maximize browser windows
		driver.manage().window().maximize();
		
		// check path creation method
//		System.out.println(ImageUpload.generatePath());
//		System.out.println(ImageUpload.generatePath());
//		PostCreateInteract.inputImageUpload(driver, ImageUpload.generatePath());
		
		PostCreateInteract.clickMakePost(driver);
		
		PostCreateInteract.clickName(driver);
		String name = Excel.getCellData(i, 0);
		PostCreateInteract.inputName(driver, name);
		
		PostCreateInteract.clickLocation(driver);
		String location = Excel.getCellData(i, 1);
		PostCreateInteract.inputLocation(driver, location);
		
		PostCreateInteract.selectDropdown(driver, "Walk");
		
		PostCreateInteract.clickDescription(driver);
		PostCreateInteract.inputDescription(driver, "Test");
		
		PostCreateInteract.submitPost(driver);
	}
}

package login;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import util.Excel;

public class LogRun {
	
	public static void ManualInput() throws InterruptedException{
		
		Scanner sc = new Scanner(System.in);
		
		// instantiate driver
		WebDriver driver = new ChromeDriver();
		
		// navigate to page
		// TODO: implement get/navigate
		driver.get((DataConst.getUrl()));
		
		// maximize browser windows
		driver.manage().window().maximize();
		
		/* PROMPT USER FOR FORM DATA */
		System.out.println("Input username name");
		String uName = sc.next();
		
		System.out.println("Input password");
		String pass = sc.next();
		
		sc.close();
		
		LogInteract.clickUserName(driver);
		LogInteract.inputUserName(driver, uName);
		
		LogInteract.clickPassword(driver);
		LogInteract.inputPassword(driver, pass);
		
		LogInteract.submit(driver);		
	}
	
	public static void AutomatedInput(WebDriver driver, int i, boolean LogOut) throws Exception {
		
		// initialize excel sheet
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getREGSHEET());
		
		// go to site
		driver.get(DataConst.getUrl());
		
		String data;
				
		/* POPULATE LOGIN FORMS WITH TABLE DATA*/
		LogInteract.clickUserName(driver);
		data = Excel.getCellData(i, 2);
		LogInteract.inputUserName(driver, data);
		
		LogInteract.clickPassword(driver);
		data = Excel.getCellData(i, 4);
		LogInteract.inputPassword(driver, data);
		
		LogInteract.submit(driver);
		
		// keep logged in if true
		if(LogOut == true) {
			LogInteract.logout(driver);
		}
	}
}

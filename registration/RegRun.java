package registration;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import data.DataConst;
import login.LogRun;
import util.Excel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegRun {
	
	// handle optional thread sleeping exceptions
	public static void ManualInput() throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		// instantiate driver
		WebDriver driver = new ChromeDriver();
		
		// navigate to page
		// TODO: implement get/navigate
		driver.get((DataConst.getUrl()));
		
		/* PROMPT USER FOR FORM DATA */
		System.out.println("Input first name");
		String fName = sc.next();
		
		System.out.println("Input last name");
		String lName = sc.next();
		
		System.out.println("Input username name");
		String uName = sc.next();
		
		System.out.println("Input email");
		String mail = sc.next();
		
		System.out.println("Input password");
		String pass = sc.next();
		
		sc.close();
		
		/* POPULATE FORM WITH USER PROVIDED DATA*/
		// TODO: enable demo mode, allow thread sleep if option is checked
		RegInteract.clickFirstName(driver);
		RegInteract.inputFirstName(driver, fName);
		Thread.sleep(100);
		
		RegInteract.clickLastName(driver);
		RegInteract.inputLastName(driver, lName);
		Thread.sleep(100);
		
		RegInteract.clickUserName(driver);
		RegInteract.inputUserName(driver, uName);
		Thread.sleep(100);
		
		RegInteract.clickEmail(driver);
		RegInteract.inputEmail(driver, mail);
		Thread.sleep(100);
		
		RegInteract.clickPassword(driver);
		RegInteract.inputPassword(driver, pass);
		Thread.sleep(100);
		
		RegInteract.submit(driver);	
	}
	
	public static void AutomatedInput(WebDriver driver, int i) throws Exception{
		
		// initialize excel sheet
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getREGSHEET());
		
		// go to page
		driver.get(DataConst.getUrl());
		
		// declare utility variable
		String data;
		
		/* POPULATE REG FORM WITH TABLE DATA */
		RegInteract.clickFirstName(driver);
		data = Excel.getCellData(i, 0);
		RegInteract.inputFirstName(driver, data);
		Thread.sleep(100);
		
		RegInteract.clickLastName(driver);
		data = Excel.getCellData(i, 1);
		RegInteract.inputLastName(driver, data);
		Thread.sleep(100);
		
		RegInteract.clickUserName(driver);
		data = Excel.getCellData(i, 2);
		RegInteract.inputUserName(driver, data);
		Thread.sleep(100);
		
		RegInteract.clickEmail(driver);
		data = Excel.getCellData(i, 3);
		RegInteract.inputEmail(driver, data);
		Thread.sleep(100);
		
		RegInteract.clickPassword(driver);
		data = Excel.getCellData(i, 4);
		RegInteract.inputPassword(driver, data);
		Thread.sleep(100);
		
		RegInteract.submit(driver);
	}
	
	public static void RegAndLogTestAccount(WebDriver driver) throws Exception {
		// initialize excel sheet
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getREGSHEET());
		
		// go to page
		driver.get(DataConst.getUrl());
		
		// declare utility variable
		String data;
		
		// use only first data row
		int i = 1;
		
		/* POPULATE REG FORM WITH TABLE DATA */
		RegInteract.clickFirstName(driver);
		data = Excel.getCellData(i, 0);
		RegInteract.inputFirstName(driver, data);
		Thread.sleep(100);
		
		RegInteract.clickLastName(driver);
		data = Excel.getCellData(i, 1);
		RegInteract.inputLastName(driver, data);
		Thread.sleep(100);
		
		RegInteract.clickUserName(driver);
		data = Excel.getCellData(i, 2);
		RegInteract.inputUserName(driver, data);
		Thread.sleep(100);
		
		RegInteract.clickEmail(driver);
		data = Excel.getCellData(i, 3);
		RegInteract.inputEmail(driver, data);
		Thread.sleep(100);
		
		RegInteract.clickPassword(driver);
		data = Excel.getCellData(i, 4);
		RegInteract.inputPassword(driver, data);
		Thread.sleep(100);
		
		RegInteract.submit(driver);
		
		// login with same data 
		LogRun.AutomatedInput(driver, i);
	}
	
}

package posting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import registration.RegRun;
import util.Excel;

public class PostCreateTest {
	
	public static void RunManualTest() {		

		try 
		{
			PostCreateRun.ManualInput();
		} 
		catch (InterruptedException e) 
		{	
			System.out.println("A friggin' bu... feature!!");
			e.printStackTrace();
		}
	}
	
	public static void RunAutomatedTest() throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		// go to page
		driver.get(DataConst.getUrl());
		
		// maximize browser windows
		driver.manage().window().maximize();
		
		// initialize excel sheet
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getTEXTSHEET());
		
		// get textsheet number of rows
		int n = Excel.getHWorkSheet().getLastRowNum();
		
		// create test account with table data
		RegRun.RegAndLogTestAccount(driver);
		
		// iterate over worksheet rows
		for(int i = 1; i < n; i++) {
			try 
			{
				PostCreateRun.AutomatedInput(driver, i);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

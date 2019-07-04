package login;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import util.Excel;

public class LogTest {
	
	public static void RunManualTest(){
		
//		// set driver file and property
//		File driverFile = new File("C:\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
		
		try {
			LogRun.ManualInput();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void RunAutomatedTest() throws Exception {
		
		// instantiate driver
		WebDriver driver = new ChromeDriver();
		
		// init excel file
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getREGSHEET());
		
		// get number of rows
		int rowCount = Excel.getHWorkSheet().getLastRowNum();
		
		// iterate over worksheet rows
		for(int i = 0; i < rowCount; i++) {
			LogRun.AutomatedInput(driver, i);
		}
	}
}

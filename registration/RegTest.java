package registration;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import util.Excel;

public class RegTest {

	public static void RunManualTest() throws Exception {
		try {
			RegRun.ManualInput();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void RunAutomatedTest() throws Exception {
		
		WebDriver driver = new ChromeDriver();

		// go to page
		driver.get(DataConst.getUrl());

		// maximize browser windows
		driver.manage().window().maximize();
		
		// initialize excel sheet
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getREGSHEET());
		
		// get regsheet row count
		int n = Excel.getHWorkSheet().getLastRowNum();
		
		// iterate over worksheet rows
		try {
			for (int i = 1; i < n; i++) {
				driver.navigate().to(DataConst.getUrl());
				RegRun.AutomatedInput(driver, i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

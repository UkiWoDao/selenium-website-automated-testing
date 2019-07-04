package registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import util.Excel;

public class RegTest {

	public static void RunManualTest() throws Exception {		
		try {
			RegRun.ManualInput();
		} 
		catch 
		(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void RunAutomatedTest(WebDriver driver) throws Exception{
		
		// init excel file
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getREGSHEET());
		
		// get number of rows
		int rowCount = Excel.getHWorkSheet().getLastRowNum();
		
		// iterate over worksheet rows
		try {
			for (int i = 1; i < rowCount; i++) {
				RegRun.AutomatedInput(driver, i);
			}
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}

package registration;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import util.Excel;

public class RegMain {

	public static void main(String[] args) throws Exception {
		
		// set driver file and property
		
		// instantiate driver
		WebDriver driver = new ChromeDriver();
		
		Excel.setXLSFile(DataConst.getPATH(), DataConst.getREGSHEET());
		int rowCount = Excel.getHWorkSheet().getLastRowNum();

		
//		try {
//			RegRun.ManualInput();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// iterate over worksheet rows
		for (int i = 0; i < rowCount; i++) {
			RegRun.AutomatedInput(driver, i);
		}
	}

}

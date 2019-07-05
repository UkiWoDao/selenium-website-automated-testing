package registration;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	public static void RunAutomatedTest(WebDriver driver){
				
		// get regsheet row count
		int n = RegRun.rowCount;
		
		// iterate over worksheet rows
		try {
			for (int i = 1; i < n; i++) {
				RegRun.AutomatedInput(driver, i);
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}

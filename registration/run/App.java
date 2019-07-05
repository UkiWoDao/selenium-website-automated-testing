package run;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import login.LogTest;
import posting.PostCreateRun;
import posting.PostCreateTest;
import registration.RegTest;

public class App {

	public static void main(String[] args) throws Exception {
		
		File driverFile = new File("C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		
		RegTest.RunAutomatedTest(driver);
//		LogTest.RunManualTest();
//		PostCreateTest.RunAutomatedTest();
//		LogTest.RunAutomatedTest();
	}

}


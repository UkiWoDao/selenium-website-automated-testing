package run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import login.LogTest;
import registration.RegTest;

public class App {

	public static void main(String[] args) throws Exception {
		
		// instantiate driver
		WebDriver driver = new ChromeDriver();
		
		RegTest.RunAutomatedTest(driver);
		LogTest.RunManualTest();
	}

}


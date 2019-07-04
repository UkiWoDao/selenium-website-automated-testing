package posting;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data.DataConst;
import registration.RegRun;

public class PostCreateTest {
	
	public static void ManualInput() {
		
		Scanner sc = new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		
		// go to index page
		driver.get(DataConst.getUrl());
		
		// auto-create single test account and login
		try {
			RegRun.RegAndLogTestAccount(driver);
		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
	}
}

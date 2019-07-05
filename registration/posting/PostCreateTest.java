package posting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	public static void RunAutomatedTest(){
		
		WebDriver driver = new ChromeDriver();
		
		// get textsheet number of rows
		int n = PostCreateRun.rowCount;
		
		// iterate over worksheet rows
		for(int i = 1; i < n; i++) {
			try 
			{
				PostCreateRun.AutomatedInput(driver, i);
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package posting;

import org.openqa.selenium.WebDriver;

public class PostDeleteRun {

	public static void automatedDelete(WebDriver d) throws InterruptedException {
		
		// expand post options
		PostInteract.clickPostOptions(d);
//		PostInteract.clickNthPostOptions(d, 2);
		Thread.sleep(400);
		
		// delete first post
		PostInteract.clickDeletePost(d);
		Thread.sleep(400);
	}
}

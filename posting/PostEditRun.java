package posting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PostEditRun {
	
	public static void editFirstPost(WebDriver d, Actions a, String s) throws InterruptedException {
		
		// expand post options
		PostInteract.clickPostOptions(d);
		Thread.sleep(500);
		
		PostInteract.clickEditPost(d);
		Thread.sleep(500);
		
		PostInteract.clickEditDescription(d);
		Thread.sleep(500);
		
		PostInteract.highlightEditDescription(d, a);
		Thread.sleep(500);
		
		PostInteract.inputEditDescription(d, s);
		Thread.sleep(500);
		
		PostInteract.clickEditPostSubmit(d);
	}

}

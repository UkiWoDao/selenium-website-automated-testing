package posting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PostInteract {
	
	/* DASHBOARD PAGE USER MANIPULATION */
	public static void clickMakePost(WebDriver d) {
		PostElems.getMakePost(d).click();
	}
	
	public static void clickName(WebDriver d) {
		PostElems.getName(d).click();
	}
	
	public static void inputName(WebDriver d, String name) {
		PostElems.getName(d).sendKeys(name);
	}
	
	public static void clickLocation(WebDriver d) {
		PostElems.getLocation(d).click();
	}
	
	public static void inputLocation(WebDriver d, String location) {
		PostElems.getLocation(d).sendKeys(location);
	}
	
	public static void clickImageUpload(WebDriver d) {
		PostElems.getImgUpload(d).click();
	}
	
	public static void inputImageUpload(WebDriver d, String s) {
		PostElems.getImgUpload(d).sendKeys(s);
	}
	
	public static void selectDropdown(WebDriver d, String option) {
		PostElems.getDropdown(d).selectByVisibleText(option);;
	}
	
	public static void submitPost(WebDriver d) {
		PostElems.getSubmit(d).click();
	}
	
	public static void clickPostOptions(WebDriver d) {
		PostElems.getPostOptions(d).click();
	}

	public static void clickEditPost(WebDriver d) {
		PostElems.getEditPost(d).click();
	}

	public static void clickDeletePost(WebDriver d) {
		PostElems.getDeletePost(d).click();
	}
	
	// id
	public static void clickImgChange(WebDriver d) {
		PostElems.getImgChange(d).click();
	}
		
	public static void clickTransport(WebDriver d, String s) {
		PostElems.getTransport(d).selectByVisibleText(s);
	}
	
	public static void clickDescription(WebDriver d) {
		PostElems.getDescription(d).click();
	}
	
	public static void inputDescription(WebDriver d, String s) {
		PostElems.getDescription(d).sendKeys(s);
	}
	
	public static void clickEditDescription(WebDriver d) {
		PostElems.getEditDescription(d).click();
	}
	
	public static void highlightEditDescription(WebDriver d, Actions a) {
		WebElement e = PostElems.getEditDescription(d);
		
		/* simulate highlighting the entire text field by dragging the mouse over the parts */  
		a.moveToElement(e, -220, -50)
			.clickAndHold()
			.moveByOffset(385, 220)
			.release()
			.perform();
	}
	
	public static void inputEditDescription(WebDriver d, String s) {
		PostElems.getEditDescription(d).sendKeys(s);
	}
	
	public static void clickEditPostSubmit(WebDriver d) {
		PostElems.getEditSubmit(d).click();
	}
}

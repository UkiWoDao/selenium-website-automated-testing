package posting;

import org.openqa.selenium.WebDriver;

public class PostEditInteract {
	
	public static void clickPostOptions(WebDriver d) {
		PostEditElems.getPostOptions(d).click();
	}

	public static void clickEditPost(WebDriver d) {
		PostEditElems.getEditPost(d).click();
	}

	public static void clickDeletePost(WebDriver d) {
		PostEditElems.getDeletePost(d).click();
	}
	
	public static void clickName(WebDriver d) {
		PostEditElems.getTitle(d).click();
	}
	
	public static void inputName(WebDriver d, String s) {
		PostEditElems.getTitle(d).sendKeys(s);;
	}
	
	public static void clickLocation(WebDriver d) {
		PostEditElems.getLocation(d).click();
	}
	
	public static void inputLocation(WebDriver d, String s) {
		PostEditElems.getLocation(d).sendKeys(s);;
	}
	
	// id
	public static void clickImgChange(WebDriver d) {
		PostEditElems.getImgChange(d).click();
	}
	
	// sendkeys
	
	public static void clickTransport(WebDriver d, String s) {
		PostEditElems.getTransport(d).selectByVisibleText(s);
	}
	
	public static void clickDescription(WebDriver d) {
		PostEditElems.getDescription(d).click();
	}
	
	public static void inputDescription(WebDriver d, String s) {
		PostEditElems.getDescription(d).sendKeys(s);
	}
}

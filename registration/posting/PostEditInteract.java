package posting;

import org.openqa.selenium.WebDriver;

public class PostEditInteract {
	
	public static void clickPostOptions(WebDriver d) {
		PostElems.getPostOptions(d).click();
	}

	public static void clickPost(WebDriver d) {
		PostElems.getEditPost(d).click();
	}

	public static void clickDeletePost(WebDriver d) {
		PostElems.getDeletePost(d).click();
	}
	
	public static void clickName(WebDriver d) {
		PostElems.getTitle(d).click();
	}
	
	public static void inputName(WebDriver d, String s) {
		PostElems.getTitle(d).sendKeys(s);;
	}
	
	public static void clickLocation(WebDriver d) {
		PostElems.getLocation(d).click();
	}
	
	public static void inputLocation(WebDriver d, String s) {
		PostElems.getLocation(d).sendKeys(s);;
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
}

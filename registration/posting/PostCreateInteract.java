package posting;

import org.openqa.selenium.WebDriver;

public class PostCreateInteract {
	
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
	
	public static void clickDescription(WebDriver d) {
		PostElems.getDescription(d).click();
	}
	
	public static void inputDescription(WebDriver d, String text) {
		PostElems.getDescription(d).sendKeys(text);
	}
	
	public static void submitPost(WebDriver d) {
		PostElems.getSubmit(d).click();
	}
}

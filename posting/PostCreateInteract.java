package posting;

import org.openqa.selenium.WebDriver;

public class PostCreateInteract {
	
	/* DASHBOARD PAGE USER MANIPULATION */
	public static void clickPost(WebDriver d) {
		PostCreateElems.getPost(d).click();
	}
	
	public static void clickName(WebDriver d) {
		PostCreateElems.getName(d).click();
	}
	
	public static void inputName(WebDriver d, String name) {
		PostCreateElems.getName(d).sendKeys(name);
	}
	
	public static void clickLocation(WebDriver d) {
		PostCreateElems.getLocation(d).click();
	}
	
	public static void inputLocation(WebDriver d, String location) {
		PostCreateElems.getLocation(d).sendKeys(location);
	}
	
	public static void clickImageUpload(WebDriver d) {
		PostCreateElems.getImgUpload(d).click();
	}
	
	public static void selectDropdown(WebDriver d, String option) {
		PostCreateElems.getDropdown(d).selectByVisibleText(option);;
	}
	
	public static void clickDescription(WebDriver d) {
		PostCreateElems.getDescription(d).click();
	}
	
	public static void inputDescription(WebDriver d, String text) {
		PostCreateElems.getDescription(d).sendKeys(text);
	}
	
	public static void submitPost(WebDriver d) {
		PostCreateElems.getSubmit(d).click();
	}
}

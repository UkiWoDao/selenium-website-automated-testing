package login;

import org.openqa.selenium.WebDriver;

public class LogInteract {
	
	public static void clickUserName(WebDriver driver) {
		LogElems.getUserName(driver).click();
	}
	
	public static void inputUserName(WebDriver driver, String uName) {
		LogElems.getUserName(driver).sendKeys(uName);
	}
	
	public static void clickPassword(WebDriver driver) {
		LogElems.getPassword(driver).click();
	}
	
	public static void inputPassword(WebDriver driver, String uName) {
		LogElems.getPassword(driver).sendKeys(uName);
	}
	
	public static void submit(WebDriver driver) {
		LogElems.getSubmit(driver).click();
	}
	
	public static void logout(WebDriver driver) {
		LogElems.getLogout(driver).click();
	}
}
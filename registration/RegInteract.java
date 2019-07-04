package registration;

import org.openqa.selenium.WebDriver;
import registration.RegElems;

public class RegInteract {
	
	/* REGISTRATION PAGE USER MANIPULATION */
	public static void clickFirstName(WebDriver driver) {
		RegElems.getFirstName(driver).click();
	}
	
	public static void inputFirstName(WebDriver driver, String fName) {
		RegElems.getFirstName(driver).sendKeys(fName);
	}
	
	public static void clickLastName(WebDriver driver) {
		RegElems.getLastName(driver).click();
	}
	
	public static void inputLastName(WebDriver driver, String lName) {
		RegElems.getLastName(driver).sendKeys(lName);
	}
	
	public static void clickUserName(WebDriver driver) {
		RegElems.getUserName(driver).click();
	}
	
	public static void inputUserName(WebDriver driver, String uName) {
		RegElems.getUserName(driver).sendKeys(uName);
	}
	
	public static void clickEmail(WebDriver driver) {
		RegElems.getEmail(driver).click();
	}
	
	public static void inputEmail(WebDriver driver, String mail) {
		RegElems.getEmail(driver).sendKeys(mail);
	}
	
	public static void clickPassword(WebDriver driver) {
		RegElems.getPassword(driver).click();
	}
	
	public static void inputPassword(WebDriver driver, String pass) {
		RegElems.getPassword(driver).sendKeys(pass);
	}
	
	public static void submit(WebDriver driver) {
		RegElems.getSubmit(driver).click();
	}
}

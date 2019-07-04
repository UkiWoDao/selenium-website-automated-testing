package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegElems {
	
	/* GRAB REGISTRATION PAGE WEB ELEMENTS */
	public static WebElement getFirstName(WebDriver d) {
		WebElement e = d.findElement(By.xpath(RegConst.getFIRSTNAME()));
		return e;
	}
	
	public static WebElement getLastName(WebDriver d) {
		WebElement e = d.findElement(By.xpath(RegConst.getLASTNAME()));
		return e;
	}
	
	public static WebElement getUserName(WebDriver d) {
		WebElement e = d.findElement(By.xpath(RegConst.getUSERNAME()));
		return e;
	}
	
	public static WebElement getEmail(WebDriver d) {
		WebElement e = d.findElement(By.xpath(RegConst.getEMAIL()));
		return e;
	}

	public static WebElement getPassword(WebDriver d) {
		WebElement e = d.findElement(By.xpath(RegConst.getPASSWORD()));
		return e;
	}
	
	public static WebElement getSubmit(WebDriver d) {
		WebElement e = d.findElement(By.xpath(RegConst.getREGISTER()));
		return e;
	}
}

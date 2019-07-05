package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import login.LogConst;

public class LogElems {
	
	public static WebElement getUserName(WebDriver driver) {
		WebElement e = driver.findElement(By.xpath(LogConst.getUSERNAME()));
		return e;
	}
	
	public static WebElement getPassword(WebDriver driver) {
		WebElement e = driver.findElement(By.xpath(LogConst.getPASSWORD()));
		return e;
	}
	
	public static WebElement getSubmit(WebDriver driver) {
		WebElement e = driver.findElement(By.xpath(LogConst.getSUBMIT()));
		return e;
	}
	
	public static WebElement getLogout(WebDriver driver) {
		WebElement e = driver.findElement(By.xpath(LogConst.getLOGOUT()));
		return e;
	}
}

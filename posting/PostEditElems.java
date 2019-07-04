package posting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import posting.PostEditConst;

public class PostEditElems {
	
	public static WebElement getPostOptions(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostEditConst.getPOSTOPTIONS()));
		return e;
	}
	
	public static WebElement getEditPost(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostEditConst.getPOSTEDIT()));
		return e;
	}
	
	public static WebElement getDeletePost(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostEditConst.getPOSTDELETE()));
		return e;
	}
	
	public static WebElement getTitle(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostEditConst.getPOSTEDITTITLE()));
		return e;
	}
	
	public static WebElement getLocation(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostEditConst.getPOSTEDITLOCATION()));
		return e;
	}
	
	public static WebElement getImgChange(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostEditConst.getPOSTEDITCHANGEIMG()));
		return e;
	}
	
	public static Select getTransport(WebDriver d) {
		Select s = new Select(d.findElement(By.xpath(PostEditConst.getPOSTEDITTRANSPORT())));
		return s;
	}
	
	public static WebElement getDescription(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostEditConst.getPOSTEDITDESCRIPTION()));
		return e;
	}
}

package posting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostElems {
	
	/* POST CREATION WEB ELEMENTS */
	public static WebElement getMakePost(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getMAKEPOST()));
		return e;
	}
	
	public static WebElement getName(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getNAME()));
		return e;
	}
	
	public static WebElement getLocation(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getLOCATION()));
		return e;
	}
	
	public static WebElement getImgUpload(WebDriver d) {
		WebElement e = d.findElement(By.id(PostConst.getIMGUPLOAD()));
		return e;
	}
	
	public static Select getDropdown(WebDriver d) {
		Select s = new Select(d.findElement(By.xpath(PostConst.getDROPDOWN())));
		return s;
	}
	
	public static WebElement getDescription(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getDESCRIPTION()));
		return e;
	}
	
	public static WebElement getSubmit(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getSUBMIT()));
		return e;
	}
	
	// get top post options
	public static WebElement getPostOptions(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getPOSTOPTIONS()));
		return e;
	}
	
	// target specific post
//	public static WebElement getNthPostOptions(WebDriver d, int n) {
//	WebElement e = d.findElement(By.xpath(PostConst.getPOSTOPTIONS() + "[" + n + "]"));
//	return e;
//}
	
	// get top post edit
	public static WebElement getEditPost(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getPOSTEDIT()));
		return e;
	}
	
	// get top post delete
	public static WebElement getDeletePost(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getPOSTDELETE()));
		return e;
	}
	
//	public WebElement getDeletePost(WebDriver driver) {
//		
//		// get all instances of class "post"
//        List<WebElement> posts = driver.findElements(By.className(PostConst.getPOSTSBYCLASS()));
//        
//        // get delete button of first post
//        WebElement e = posts.get(0).findElement(By.xpath(PostConst.getPOSTDELETE()));
//        return e;
//    }
	
	public static WebElement getTitle(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getPOSTEDITTITLE()));
		return e;
	}
	
	public static WebElement getImgChange(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getPOSTEDITCHANGEIMG()));
		return e;
	}
	
	public static Select getTransport(WebDriver d) {
		Select s = new Select(d.findElement(By.xpath(PostConst.getPOSTEDITTRANSPORT())));
		return s;
	}
	
	public static WebElement getEditDescription(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getPOSTEDITDESCRIPTION()));
		return e;
	}
	
	public static WebElement getEditSubmit(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostConst.getPOSTEDITSUBMIT()));
		return e;
	}
}

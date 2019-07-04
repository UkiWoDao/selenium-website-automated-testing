package posting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostCreateElems {
	
	public static WebElement getPost(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostCreateConst.getMAKEPOST()));
		return e;
	}
	
	public static WebElement getName(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostCreateConst.getNAME()));
		return e;
	}
	
	public static WebElement getLocation(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostCreateConst.getLOCATION()));
		return e;
	}
	
	public static WebElement getImgUpload(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostCreateConst.getIMGUPLOAD()));
		return e;
	}
	
	public static Select getDropdown(WebDriver d) {
		Select s = new Select(d.findElement(By.xpath(PostCreateConst.getDROPDOWN())));
		return s;
	}
	
	public static WebElement getDescription(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostCreateConst.getDESCRIPTION()));
		return e;
	}
	
	public static WebElement getSubmit(WebDriver d) {
		WebElement e = d.findElement(By.xpath(PostCreateConst.getSUBMIT()));
		return e;
	}

}

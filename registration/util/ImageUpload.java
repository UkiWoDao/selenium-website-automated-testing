package util;

import java.io.IOException;
import java.util.Random;

public class ImageUpload {
	
	public static int generateRandomNum() {
		/* data folder contains 5 images named 1, 2, 3... which we access randomly by name*/
		
		// create instance of random
		Random r = new Random();
		
		// generate number from 0 to 4
		int n = r.nextInt(5);
		
		// add 1 to match image names
		n += 1;
		
		return n;
	}
	
	public static String generatePath() {
		String path = "";
		path = "C:\\Users\\Uros\\eclipse-workspace\\selenium-website-automated-testing\\src\\data\\" + generateRandomNum() + ".jpg";
		return path;
	}
	
	public static void inputPath() {
		try {
			Runtime.getRuntime().exec("explorer.exe /select, " + generatePath());
		} 
		catch (IOException e) 
		{
			System.out.println("Upload failed");
			e.printStackTrace();
		}
	}
}

package posting;

public class PostCreateConst {
	
	/* XPATH CONSTANT */
	private static String MAKEPOST = "//*[@id=\"newPostBtn\"]/a";
	private static String SUBMIT = "/html/body/div[1]/div[4]/form/input[3]";
	private static String NAME = "/html/body/div[1]/div[4]/form/input[1]";
	private static String LOCATION = "/html/body/div[1]/div[4]/form/input[2]";
	private static String IMGUPLOAD = "/html/body/div[1]/div[4]/form/label";
	private static String DROPDOWN = "/html/body/div[1]/div[4]/form/select";
	private static String DESCRIPTION = "/html/body/div[1]/div[4]/form/textarea";
	
	public static String getMAKEPOST() {
		return MAKEPOST;
	}

	public static String getNAME() {
		return NAME;
	}

	public static String getLOCATION() {
		return LOCATION;
	}

	public static String getIMGUPLOAD() {
		return IMGUPLOAD;
	}

	public static String getDROPDOWN() {
		return DROPDOWN;
	}
	
	public static String getDESCRIPTION() {
		return DESCRIPTION;
	}
	
	public static String getSUBMIT() {
		return SUBMIT;
	}

}

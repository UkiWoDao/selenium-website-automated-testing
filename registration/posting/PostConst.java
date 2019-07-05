package posting;

public class PostConst {
	
	/* DOM PATH CONSTANTS */
	private static String MAKEPOST = "//*[@id=\"newPostBtn\"]/a";
	private static String SUBMIT = "/html/body/div[1]/div[4]/form/input[3]";
	private static String NAME = "/html/body/div[1]/div[4]/form/input[1]";
	private static String LOCATION = "/html/body/div[1]/div[4]/form/input[2]";
//	private static String IMGUPLOAD = "image"; // element id
	private static String IMGUPLOAD = "/html/body/div[1]/div[4]/form/label";
	private static String DROPDOWN = "/html/body/div[1]/div[4]/form/select";
	private static String DESCRIPTION = "/html/body/div[1]/div[4]/form/textarea";
	private static String POSTOPTIONS = "/html/body/div[1]/div[7]/div[3]/div[1]/div[1]/div/a";
	private static String POSTEDIT = "/html/body/div[1]/div[7]/div[3]/div[1]/div[1]/div/div/i";
	private static String POSTDELETE = "/html/body/div[1]/div[7]/div[3]/div[1]/div[1]/div/div/a";
	private static String POSTEDITTITLE = "//*[@id=\"title\"]";
	private static String POSTEDITLOCATION = "//*[@id=\"location\"]";
	private static String POSTEDITCHANGEIMG = "/html/body/div[1]/div[6]/form/div/label";
	private static String POSTEDITTRANSPORT = "//*[@id=\"transport\"]";
	private static String POSTEDITDESCRIPTION = "//*[@id=\"description\"]";
	
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

	public static String getPOSTOPTIONS() {
		return POSTOPTIONS;
	}

	public static String getPOSTEDIT() {
		return POSTEDIT;
	}

	public static String getPOSTDELETE() {
		return POSTDELETE;
	}

	public static String getPOSTEDITTITLE() {
		return POSTEDITTITLE;
	}
	
	public static String getPOSTEDITLOCATION() {
		return POSTEDITLOCATION;
	}
	
	public static String getPOSTEDITCHANGEIMG() {
		return POSTEDITCHANGEIMG;
	}
	
	public static String getPOSTEDITTRANSPORT() {
		return POSTEDITTRANSPORT;
	}
	
	public static String getPOSTEDITDESCRIPTION() {
		return POSTEDITDESCRIPTION;
	}
}

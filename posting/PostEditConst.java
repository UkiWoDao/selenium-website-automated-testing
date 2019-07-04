package posting;

public class PostEditConst {
	/* XPATHS */
	private static String POSTOPTIONS = "/html/body/div[1]/div[7]/div[3]/div[1]/div[1]/div/a";
	private static String POSTEDIT = "/html/body/div[1]/div[7]/div[3]/div[1]/div[1]/div/div/i";
	private static String POSTDELETE = "/html/body/div[1]/div[7]/div[3]/div[1]/div[1]/div/div/a";
	private static String POSTEDITTITLE = "//*[@id=\"title\"]";
	private static String POSTEDITLOCATION = "//*[@id=\"location\"]";
	private static String POSTEDITCHANGEIMG = "/html/body/div[1]/div[6]/form/div/label";
	private static String POSTEDITTRANSPORT = "//*[@id=\"transport\"]";
	private static String POSTEDITDESCRIPTION = "//*[@id=\"description\"]";
	
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

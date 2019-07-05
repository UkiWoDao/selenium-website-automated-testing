package registration;

public class RegConst {
	
	/* XPATH CONSTANTS */
	private static String FIRSTNAME = "/html/body/div[3]/div[2]/form/input[1]";
	private static String LASTNAME = "/html/body/div[3]/div[2]/form/input[2]";
	private static String USERNAME = "/html/body/div[3]/div[2]/form/input[3]";
	private static String EMAIL = "/html/body/div[3]/div[2]/form/input[4]";
	private static String PASSWORD = "/html/body/div[3]/div[2]/form/input[5]";
	private static String REGISTER = "//*[@id=\"blue_btn\"]";
	
	/* XPATH GETTERS */
	public static String getFIRSTNAME() {
		return FIRSTNAME;
	}
	
	public static String getLASTNAME() {
		return LASTNAME;
	}
	
	public static String getUSERNAME() {
		return USERNAME;
	}
	
	public static String getEMAIL() {
		return EMAIL;
	}
	
	public static String getPASSWORD() {
		return PASSWORD;
	}
	
	public static String getREGISTER() {
		return REGISTER;
	}	
	
}


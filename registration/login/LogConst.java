package login;

public class LogConst {
	
	/* XPATH CONSTANTS*/
	private static String USERNAME = "/html/body/div[3]/div[1]/form/input[1]";
	private static String PASSWORD = "/html/body/div[3]/div[1]/form/input[2]";
	private static String SUBMIT = "/html/body/div[3]/div[1]/form/input[3]";
	private static String LOGOUT = "//*[@id=\"logoutBtn\"]";
	
	/* XPATH GETTERS */
	public static String getUSERNAME() {
		return USERNAME;
	}
	
	public static String getPASSWORD() {
		return PASSWORD;
	}

	public static String getSUBMIT() {
		return SUBMIT;
	}
	
	public static String getLOGOUT() {
		return LOGOUT;
	}
		
}

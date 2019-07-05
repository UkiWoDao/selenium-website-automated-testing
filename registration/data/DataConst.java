package data;

public class DataConst {
	
	private static String url = "http://localhost/izlet/";
	private static String PATH = System.getProperty("user.dir") + "\\src\\data\\Data.xls";
	private static String FILENAME = "Data.xls";
	private static String REGSHEET = "Registracija";
	private static String TEXTSHEET = "Tekst";
	
	public static String getUrl() {
		return url;
	}
	
	public static String getPATH() {
		return PATH;
	}
	
	public static String getFILENAME() {
		return FILENAME;
	}
	
	public static String getREGSHEET() {
		return REGSHEET;
	}
	
	public static String getTEXTSHEET() {
		return TEXTSHEET;
	}		
}

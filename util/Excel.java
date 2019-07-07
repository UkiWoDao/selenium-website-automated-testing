package util;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;

import data.DataConst;

//import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;

public class Excel {

	private static HSSFSheet HFSheet;
	private static XSSFSheet XFSheet;
	private static HSSFWorkbook HWorkWBook;
	private static XSSFWorkbook XWorkbook;
	private static HSSFCell HCell;
	private static XSSFCell XCell;
//	private static HSSFRow Row;
	private static DataFormatter formatter;
	private static String DataFileExtension;

	// initialize excel files up to and including 2007
	public static void setXLSFile(String Path, String SheetName) throws Exception {
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);

			// get workbook from file
			HWorkWBook = new HSSFWorkbook(ExcelFile);

			// get worksheet from workbook
			HFSheet = HWorkWBook.getSheet(SheetName);

			// instantiate formatter object
			formatter = new DataFormatter();
		} catch (Exception e) {
			throw (e);
		}
	}
	
	// initialize 2007+ excel files
	public static void setXLSXFile(String Path, String SheetName) throws Exception {
		try {
			OPCPackage pkg = OPCPackage.open(new File(Path));

			// get workbook from file
			XWorkbook = new XSSFWorkbook(pkg);

			// get worksheet from workbook
			XFSheet = XWorkbook.getSheet(SheetName);

			// instantiate formatter object
			formatter = new DataFormatter();
		} catch (Exception e) {
			throw (e);
		}
	}
	
	// check DataConst "Data" file extension
	public static void checkDataFileExtension() {
		if (DataConst.getFILENAME().matches("Data.xlsx")){
			DataFileExtension = "xlsx";
		} else if (DataConst.getFILENAME().matches("Data.xls")) {
			DataFileExtension = "xls";
		} else {
			System.out.println("No such file");
		}
	}
	
	// call correct method depending on extension
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		
		// check extension before initializing
		checkDataFileExtension();
	
		if(DataFileExtension == "xls") {
			setXLSFile(Path, SheetName);
		} else if (DataFileExtension == "xlsx") {
			setXLSXFile(Path, SheetName);
		}
	}
	
	// data extraction method
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {	
			String CellData = "";
			checkDataFileExtension();
			
			if(DataFileExtension == "xls") {
				HCell = HFSheet.getRow(RowNum).getCell(ColNum);
				
				// convert to string
				CellData = formatter.formatCellValue(HCell);
			} else if (DataFileExtension == "xlsx") {
				XCell = XFSheet.getRow(RowNum).getCell(ColNum);
				
				// convert to string
				CellData = formatter.formatCellValue(XCell);
			}
			
			// String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}

	}
	
	public static String getFileExtension() {
		return DataFileExtension;
	}
	
	// get HSSFworksheet reference
	public static HSSFSheet getHWorkSheet() {
		return HFSheet;
	}
	
	// get XSSFworksheet reference
	public static XSSFSheet getXWorkSheet() {
		return XFSheet;
	}
//	public static void getWorkSheet() {
//		if(DataFileExtension == "xls") {
//			getHWorkSheet();
//		} else if (DataFileExtension == "xlsx") {
//			getXWorkSheet();
//		}
//	}
	
}

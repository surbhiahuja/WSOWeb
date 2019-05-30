package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appFunctions.appFunctions;


public class commonFunctions {
	//public WebDriver driver1 = appFunctions.driver;
	@DataProvider (name="surbhi")
	public static Object[][] excel() throws IOException {
		Object[][] obj = new Object[4][2];
		
        XSSFWorkbook workbook;
		FileInputStream fis = new FileInputStream("C:\\Users\\surbhi.pathak\\Desktop\\TestCase1.xlsx");
		workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
			for (int i = 0; i <sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {

				XSSFSheet xsheet = workbook.getSheetAt(i);

				for (int j = 1; j <= xsheet.getLastRowNum(); j++) {

					Row rw = xsheet.getRow(j);
					for (int k = 0; k <= 1; k++) {
						obj[j-1][k] = rw.getCell(k).getStringCellValue();
						//System.out.println(obj[j][k]);
						
					}
				}
			}
		}

		return obj;
	}
	
	
}

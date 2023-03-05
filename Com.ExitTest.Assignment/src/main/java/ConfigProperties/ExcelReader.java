package ConfigProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public XSSFSheet ExcelData(String sheetName) throws IOException {
		File file=new File(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\ConfigProperties\\\\AppOptionTestData.xlsx");
	    FileInputStream inputStream=new FileInputStream(file);
	    XSSFWorkbook wb=new XSSFWorkbook(inputStream);
	    XSSFSheet sheet=wb.getSheet(sheetName);
	    return sheet;
	}
	
	public String CellData(XSSFSheet sheet,int rowNum) {
		String data=sheet.getRow(rowNum).getCell(0).getStringCellValue();
		return data;
	}

}

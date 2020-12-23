package file.adapter.excel;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class GetRecordsFromExcelFile {

	public static void main(String[] args) throws IOException {
		//1.Open the excel file in read mode
		FileInputStream file= new FileInputStream("C:\\Users\\Mahesh\\eclipse-workspace\\ProjectBasicsOfJava\\src\\test\\data\\source\\TestDataSource.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=rowcount; i++)
		{
			XSSFRow currentrow = sheet.getRow(i); // focused on current row
			
			for(int j=0; j<=colcount; j++)
			{
				String value= currentrow.getCell(rowcount).toString();
				System.out.print(value);
			}
			System.out.println();
		}
		workbook.close();

	}

}

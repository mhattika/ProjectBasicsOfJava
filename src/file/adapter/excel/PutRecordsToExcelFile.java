package file.adapter.excel;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PutRecordsToExcelFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream("C://TestDataSource/TestDataSource.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(); //placeholder for sheet/row/cell

		XSSFSheet sheet=workbook.createSheet("Target");

		for(int i=0;i<=5;i++)
		{
			XSSFRow row=sheet.createRow(i);
			for (int j=0;j<3;j++)
				{
				row.createCell(j).setCellValue("xyz");
				}

		}

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Data processed successfully");
	}

}

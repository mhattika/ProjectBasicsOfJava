package Assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.inetbanking.utilities.XLUtils;

public class RearWriteExcel {

	public static void main(String[] args) throws IOException 
	{
	
		String path=System.getProperty("C:\\Users\\Mahesh\\eclipse-workspace\\ProjectBasicsOfJava\\src\\test\\data\\source\\TestDataSource.xlsx");
		int rownum=getRowCount(path,"Sheet1");
		System.out.println(rownum);
		//int colcount=getCellCount(path,"Sheet1",1);
	}
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		FileInputStream fi= new FileInputStream(xlfile);
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws= wb.getSheet(xlfile);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}

	/*
	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
	fi= new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	int cellcount=row.getLastCellNum();
	wb.close();
	fi.close();
	return cellcount;
	}

	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{

	fi= new FileInputStream(xlfile);
	wb= new XSSFWorkbook(fi);
	ws= wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.getCell(colnum);
	String data;
	try 
	{
	DataFormatter formater = new DataFormatter();
	String cellData = formater.formatCellValue(cell);
	return cellData;
	}

	catch (Exception e){
	data="";
	}

	wb.close();
	fi.close();
	return data;
	}

	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.createCell(colnum);
	cell.setCellValue(data);
	fo= new FileOutputStream(xlfile);
	wb.write(fo);
	wb.close();
	fi.close();
	fo.close();
	}
	*/

}

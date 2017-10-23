package webdriver_examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData 
{

	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("E:\\HRM1.xlsx");
		FileInputStream inputstream = new FileInputStream(f1);
		XSSFWorkbook wb1 = new XSSFWorkbook(inputstream);
		XSSFSheet ws1 = wb1.getSheet("Sheet1");
		Cell c1 = ws1.getRow(1).getCell(2);
		if(c1==null)
		{
			c1 = ws1.getRow(1).createCell(2);
		}
		c1.setCellValue("invalid id , plz try again");
		//ws1.getRow(0).createCell(2).setCellValue("Pass");
		//ws1.getRow(1).createCell(2).setCellValue("Fail");
		FileOutputStream fout = new FileOutputStream(f1);
		wb1.write(fout);
		wb1.close();
		fout.close();		
	}

}

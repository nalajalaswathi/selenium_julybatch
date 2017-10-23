package webdriver_examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadData {

	public static void main(String[] args) throws IOException
	{
		String Username;
		String Password;
		
		File f1 = new File("E:\\HRM.xlsx");
		FileInputStream inputstream = new FileInputStream(f1);
		XSSFWorkbook wb1 = new XSSFWorkbook(inputstream);
		XSSFSheet ws1 = wb1.getSheet("Sheet1");	
		int rowcount = ws1.getLastRowNum();
		//System.out.println("Last rou number is:- " + ws1.getLastRowNum());
		System.out.println("Total no.of rows in sheet1 is:-" + rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			Row r1 = ws1.getRow(i);
			Username = r1.getCell(0).getStringCellValue();
			Password = r1.getCell(1).getStringCellValue();
			System.out.println(Username + " ::::::: " + Password);
		}
		inputstream.close();
		wb1.close();		
	}
}




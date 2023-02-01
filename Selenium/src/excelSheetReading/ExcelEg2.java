package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\khushboo\\WorkBook.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		//string cell type
		
		Cell mycell1 = mySheet.getRow(1).getCell(0);
		System.out.println(mycell1.getCellType());
		String myValue1 = mycell1.getStringCellValue();
		System.out.println("my value is " + myValue1);
		
		//Boolean cell type
		
//		Cell mycell2 = mySheet.getRow(2).getCell(2);
//		System.out.println(mycell2.getCellType());
//		boolean myValue2 = mycell2.getBooleanCellValue();
//		System.out.println("my value is " +myValue2);
		
		//numeric cell
		
		Cell mycell3 = mySheet.getRow(2).getCell(0);
		System.out.println(mycell3.getCellType());
	    double myValue3 = mycell3.getNumericCellValue();
	    System.out.println(myValue3);
	    
		

	}
	
	

}
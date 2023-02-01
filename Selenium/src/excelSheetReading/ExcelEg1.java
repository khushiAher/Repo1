package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile = new File("D:\\khushboo\\WorkBook.xlsx");
		double value = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(2).getCell(1).getNumericCellValue();
		System.out.println("value is"+ value);
		

	}

}

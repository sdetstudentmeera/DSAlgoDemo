package utilities;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelReader {
	public static int totalRow;

	//method to find the excel path and get the sheet name
	/*The getData method takes the file path of the Excel file (excelfilepath) and 
	 the name of the sheet within the Excel file (sheetName) as input parameters.
	  It opens the Excel file using Apache POI's WorkbookFactory, 
	 gets the specified sheet, and then calls the readSheet method to read the data from the sheet.*/
	public List<Map<String,String>> getData(String excelfilepath, String sheetName) throws InvalidFormatException, IOException{
		
		
		Workbook workbook = WorkbookFactory.create(new File(excelfilepath));
		LoggerLoad.info("File Path : " + excelfilepath);
		Sheet sheet = workbook.getSheet(sheetName);
		LoggerLoad.info(" Sheet Name : " + sheetName);
		workbook.close();
		return readSheet(sheet);
		
	}
	//method to read the data from the sheet name read in the above method
	/*The readSheet method takes a Sheet object as input and reads the data row by row.
	  It iterates through each row in the sheet (starting from the second row,
	 as the first row is usually considered as the header row) and reads the cell values for each column.*/
		public List<Map<String,String>> readSheet(Sheet sheet){
			
			Row row;
			Cell cell;
			LoggerLoad.info("Read Sheet data");
			//get the total row of the sheet
			int totalRow = sheet.getLastRowNum();
			LoggerLoad.info("Total Row : " + totalRow);
			
			List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

			for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

				row = sheet.getRow(currentRow);
				LoggerLoad.info("Row : " + row);
				
				int totalColumn = row.getLastCellNum();
				LoggerLoad.info("Total Column : " + totalColumn);

				LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

					cell = row.getCell(currentColumn);
					LoggerLoad.info("Cell : " + cell);
					
					String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
							.getStringCellValue();
					LoggerLoad.info("Column Header Name : " + columnHeaderName);

					columnMapdata.put(columnHeaderName, cell.getStringCellValue());
				}

				excelRows.add(columnMapdata);
			}

			return excelRows;
		}
			
}

/*For each row, a new LinkedHashMap named columnMapdata is created to store the column header 
 * (from the first row) and its corresponding cell value for each column in the row. 
 * The columnMapdata is then added to the excelRows list.
 * 
 * After iterating through all the rows, the excelRows list is returned, containing the data from the Excel sheet.

The code also includes log statements using a custom LoggerLoad to print information about the actions performed,
 such as file path, sheet name, total rows, total columns, etc. 
This is helpful for debugging and understanding the execution flow.

 */
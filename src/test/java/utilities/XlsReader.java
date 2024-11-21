package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class XlsReader {
	
	public static int totalRows;

	public List<Map<String, String>> getData(String xlsFilePath, String sheetname) 
	throws IOException {
		Workbook workbook = WorkbookFactory.create(new File(xlsFilePath));
		Sheet sheet = workbook.getSheet(sheetname);
		workbook.close();
		return readSheet(sheet);
	}
	
	private List<Map<String, String>> readSheet(Sheet sheet) {
		Row row;
		Cell cell;
		totalRows = sheet.getLastRowNum();

		List<Map<String, String>> xlsRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRows; currentRow++) {
			row = sheet.getRow(currentRow);

			int totalColumns = row.getLastCellNum();

			LinkedHashMap<String, String> columnData = new LinkedHashMap<String, String>();
			
			for (int currentColumn = 0; currentColumn < totalColumns; currentColumn++) {
				cell = row.getCell(currentColumn);

				String columnName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();
				columnData.put(columnName, cell.getStringCellValue());
			}
			xlsRows.add(columnData);
		}
		return xlsRows;
	}

	public int countRows() {
		return totalRows;
	}

}

package Day2;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.IOException;

public class DDTUsingExcel {

    @Test
    public void test() throws IOException {
        Workbook book = new XSSFWorkbook("/Users/swati.kalra/Documents/Selenium-Appium/Data2.xlsx");
        Sheet sheet = book.getSheet("Sheet1");

        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        //int rowNum = sheet.getPhysicalNumberOfRows();

        for(int i = 0; i < rowCount+1; i++){
            Row row = sheet.getRow(i);

            for(int j = 0; j < row.getLastCellNum(); j++){
                if(row.getCell(j).getCellType() == CellType.NUMERIC){
                    System.out.print(NumberToTextConverter.toText(Double.parseDouble(row.getCell(j).getNumericCellValue() + "\t")));
                }
                else
                    System.out.print(row.getCell(j).getStringCellValue() + "\t");
            }
        }
    }


}

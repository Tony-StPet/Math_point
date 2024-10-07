package myproject;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.List;

public class ExelCreate {

    public static void createExelWithPoints(List<Point> list, String filename) throws Exception {
        // Создаем тестовый Excel-файл с несколькими листами
        try (FileOutputStream fos = new FileOutputStream(filename);
             Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet1 = workbook.createSheet("Sheet1");

            // Заполняем данными первый лист
            for (int i = 0; i < list.size(); i++) {
                Row row = sheet1.createRow(i);
                row.createCell(0).setCellValue(list.get(i).x);
                row.createCell(1).setCellValue(list.get(i).y);
            }
            workbook.write(fos);
        }
    }
}

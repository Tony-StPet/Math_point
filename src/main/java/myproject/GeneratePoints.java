package myproject;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratePoints extends Point {

    public GeneratePoints(double x, double y) {
        super(x, y);
    }

    public static List<Point> listOfPonts(double minX, double maxX, int n, FuncMath f) {
        List<Point> list = new ArrayList<>();
        double intervalX = (maxX - minX) / (n - 1);
        double x = minX;
        for (double i = minX; i < maxX; i++) {
            list.add(new Point(x, f.calc(x)));
            x += intervalX;
        }
        return list;
    }


}

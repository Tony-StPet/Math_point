//Сделать класс Точка с двумя вещ-ми координатами
//Сделать интерфейс МатФункция, у него метод Вычислить, принимающий вещественный аргумент x и возвращающий вещественное число
//interface MatFunction{
//double calculate(double x);}
// Конкретные классы реализуют каждый одну матфункцию:
// класс ФункцияСинус, класс ФункцияПарабола, класс ФункцияПрямая. Вещественные коэффициенты - свойства объектов, задаются конструкторами
// Сделать класс ГенераторТочек, в котором статический метод сгенерироватьТочки,который принимает на вход:
//минимальное x, максимальное x, количество точек, экземпляр МатФункции и выдает список точек
//---------------------------------------------------------------------------------------------------------
//сделать статический метод, который сохранит список точек в xlsx файл

package myproject;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        List<Point> list1 ;List<Point> list2 ; List<Point> list3 ;
        list1 = GeneratePoints.listOfPonts(0, 40, 21, new ParabFunc(2, 4, 5));
        list2 = GeneratePoints.listOfPonts(0, 40, 21, new Straight(-2, 4));
        //ExelCreate.createExelWithPoints(list1, "Output.xlsx");
        //ExelCreate.createExelWithPoints(list2, "Output2.xlsx");
        list3 = GeneratePoints.listOfPonts(0, 40, 21, new Sinus());
        ExelCreate.createExelWithPoints(list3, "Output3.xlsx");
    }
}
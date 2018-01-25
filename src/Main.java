import epam.sindalouski.calculator.generalcalculator.GeneralCalculatorImpl;
import epam.sindalouski.calculator.calculatortype.CalculatorType;
import epam.sindalouski.calculator.filereader.FileReader;
import java.io.*;
import java.util.ArrayList;

/**
 * В классе main читаются аргумент из командной строки – имя входного файла,
 * устаниавливаются все прочитаные параметры из файла в список
 * создается калькулятор и  выводятся результаты вычислений в консоль
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /** список который будет содержать все параметры прочитанные из файла*/
        ArrayList<String> list = FileReader.getParamsFromFile(args[0].toString());

        /** создается основной калькулятор с базовыми вычислениями*/
        GeneralCalculatorImpl calculator = CalculatorType.getCalculatorType(list);

        /** выдятся результаты вычислений в консоль */
        System.out.println("Result: " + calculator.calculate(list));
    }
}

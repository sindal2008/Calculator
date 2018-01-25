package epam.sindalouski.calculator.calculatortype;

import epam.sindalouski.calculator.generalcalculator.GeneralCalculatorImpl;
import epam.sindalouski.calculator.calculators.SimpleCalc;
import epam.sindalouski.calculator.calculators.SimpleCalcMemory;
import epam.sindalouski.calculator.calculators.EngineeringCalc;
import epam.sindalouski.calculator.calculators.EngineeringCalcMemory;

import java.util.ArrayList;

/**
 * Класс создает необходимый тип калькулятора
 */
public class CalculatorType {

    public static GeneralCalculatorImpl getCalculatorType(ArrayList<String> list) {

        /** ссылка для создания необходимого типа калькулятора*/
        GeneralCalculatorImpl calculator = null;

        /** переменная для хранения типа калькулятора */
        String calcType = list.get(0);
        list.remove(0);

        switch (calcType) {
            case "1":
                calculator = new SimpleCalc();
                break;
            case "2":
                calculator = new SimpleCalcMemory();
                break;
            case "3":
                calculator = new EngineeringCalc();
                break;
            case "4":
                calculator = new EngineeringCalcMemory();
                break;
            default:
                throw new IllegalArgumentException("Ошибка: тип калькулятора не определен");
        }
        return calculator;
    }
}
package epam.sindalouski.calculator.calculators;

import epam.sindalouski.calculator.generalcalculator.GeneralCalculatorImpl;
import java.util.ArrayList;

/**
 * Класс реализует простой тип калькулятора с четырьмя базовыми операциями:
 * сложение, вычитание, умножение и деление
 */
public class SimpleCalc extends GeneralCalculatorImpl {

    /**
     * метод выполняет вычисления
     */
    public double calculate(ArrayList<String> list) {

        // переменная хранит результат вычислений
        double calcResult;

        for(int i = 0; i < list.size(); i++) {

            StringBuilder stringBuilder = new StringBuilder(list.get(i));

            switch (stringBuilder.toString()) {

                case "*":
                    getMultiplication(list, i);
                    --i;
                    break;
                case "/":
                    getDivision(list, i);
                    --i;
                    break;
                case "+":
                    getAddition(list, i);
                    --i;
                    break;
                case "-":
                    getSubtraction(list, i);
                    --i;
            }
        }

        // только один операнд должен оставаться в списке, если входной файл является верным
        calcResult = Double.parseDouble(list.get(0));

        return calcResult;
    }
}

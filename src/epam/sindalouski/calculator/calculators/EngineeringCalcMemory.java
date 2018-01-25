package epam.sindalouski.calculator.calculators;

import java.util.ArrayList;

/**
 * Класс реализует инженерный калькулятор с функцией ячейки памяти
 */
public class EngineeringCalcMemory extends EngineeringCalc {

    /**
     * метод делает вычисления
     */
    public double calculate(ArrayList<String> list) {

        // переменная для хранения результата вычислений
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
                    break;
                case "mc":
                    memoryClear(list, i);
                    --i;
                    break;
                case "ms":
                    memorySet(list, i);
                    --i;
                    break;
                case "mg":
                    memoryGet(list, i);
                    --i;
                    break;
                case "m+":
                    memoryAdd(list, i);
                    --i;
                    break;
                case "m-":
                    memoryDifference(list, i);
                    --i;
                    break;
                case "exp":
                    getExponent(list, i);
                    --i;
                    break;
                case "cos":
                    getCosinus(list, i);
                    --i;
                    break;
                case "sqrt":
                    getSqrt(list, i);
                    --i;
            }
        }

        // только один операнд должен оставаться в списке, если входной файл является верным
        calcResult = Double.parseDouble(list.get(0));

        return calcResult;
    }
}

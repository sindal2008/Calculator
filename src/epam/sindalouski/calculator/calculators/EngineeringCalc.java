package epam.sindalouski.calculator.calculators;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализует инженерный калькулятор
 */
public class EngineeringCalc extends SimpleCalcMemory {

    /**
     * метод нахождения косинуса
     */
    public void getCosinus(List<String> list, int i) {
        setArgument3(Double.parseDouble(list.get(i-1)));
        setArgument1(Math.cos(Math.toRadians(getArgument3())));
        list.remove(i);
        list.set(i-1, Double.toString(getArgument1()));
    }

    /**
     * метод для вычисления экспоненты
     */
    public void getExponent(List<String> list, int i) {
        setArgument3(Double.parseDouble(list.get(i - 1)));
        setArgument1(Math.exp(getArgument3()));
        list.remove(i);
        list.set(i - 1, Double.toString(getArgument1()));
    }

    /**
     * метод вычисления квадратного корня
     */
    public void getSqrt(List<String> list, int i) {
        setArgument3(Double.parseDouble(list.get(i-1)));
        setArgument1(Math.sqrt(getArgument3()));
        list.remove(i);
        list.set(i-1, Double.toString(getArgument1()));
    }

    /**
     * метод для вычислений
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

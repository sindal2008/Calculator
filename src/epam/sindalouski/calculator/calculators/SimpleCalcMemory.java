package epam.sindalouski.calculator.calculators;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс реализует простой калькулятор с ячейкой памяти
 */
public class SimpleCalcMemory extends SimpleCalc {

    /** переменная для ячейки памяти */
    private double memory;

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }

    /**
     * метод устанавливает текущее значение в ячейку памяти
     */
    public void memorySet(List<String> list , int i) {

        setMemory(Double.parseDouble(list.get(i-1)));

        System.out.println(getMemory() + " memorySet");
        list.remove(i);
    }

    /**
     * метод устанавливает значение ячейки памяти для текущего значения
     */
    public void memoryGet(List <String> list , int i) {
        String value = String.valueOf(getMemory());
        list.set(i-1, value);
        System.out.println(list.get(i-1) + " value now. memoryGet");
        list.remove(i);
    }

    /**
     * метод увеличивает значение ячейки памяти на текущее значение
     */
    public void memoryAdd(List <String> list , int i) {
        setMemory(getMemory() + Double.parseDouble(list.get(i-1)));
        System.out.println(getMemory() + " memoryPlus");
        list.remove(i);
    }

    /**
     * метод уменьшает значение ячейки памяти на текущее значение
     */
    public void memoryDifference(List <String> list , int i) {
        setMemory(getMemory() - Double.parseDouble(list.get(i-1)));
        System.out.println(getMemory() + " memoryMinus");
        list.remove(i);
    }

    /**
     * метод очищает значение ячейки памяти
     */
    public void memoryClear(List <String> list , int i) {
        setMemory(0);
        System.out.println(getMemory() + " memoryClear");
        list.remove(i);
    }

    /**
     * метод делает вычисления
     */
    public double calculate(ArrayList<String> list) {

        // переменная для результата вычислений
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
            }
        }

        // только один операнд должен оставаться в списке, если входной файл является верным
        calcResult = Double.parseDouble(list.get(0));

        return calcResult;
    }
}
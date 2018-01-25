package epam.sindalouski.calculator.generalcalculator;

import java.util.List;

/**
 */
public interface GeneralCalculator {

    public void getMultiplication(List<String> list , int i);

    /**
     * Метод операции сложения
     */
    public void getAddition(List<String> list, int i);

    /**
     * Метод вычитания
     */
    public void getSubtraction(List<String> list, int i);

    /**
     * Метод деления
     */
    public void getDivision(List<String> list, int i);
}

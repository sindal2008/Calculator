package epam.sindalouski.calculator.generalcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс содержит все необходимые операции для расчета
 */
public abstract class GeneralCalculatorImpl implements GeneralCalculator {  // extends CalculatorType {

    /** переменная для проведения операций*/
    private double argument1;

    /** переменная для проведения операций */
    private double argument2;

    /** переменная для проведения операций */
    private double argument3;

    /** переменная для операций с ячейкой памяти */
    //private double memory;

    public void setArgument1(double argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(double argument2) {
        this.argument2 = argument2;
    }

    public void setArgument3(double argument3) {
        this.argument3 = argument3;
    }

    public double getArgument1() {
        return argument1;
    }

    public double getArgument2() {
        return argument2;
    }

    public double getArgument3() {
        return argument3;
    }

    /**
     * метод делает вычисления
     */
    public abstract double calculate(ArrayList<String> list);


    /**
     * Метод операции умножения
     */
    public void getMultiplication(List <String> list , int i) {
        setArgument1(Double.parseDouble(list.get(i-1)));
        setArgument2(Double.parseDouble(list.get(i+1)));
        setArgument3(getArgument1() * getArgument2());
        list.remove(i+1);
        list.remove(i);;
        list.set(i-1, Double.toString(getArgument3()));
    }

    /**
     * Метод операция сложения
     */
    public void getAddition(List<String> list, int i) {
        setArgument1(Double.parseDouble(list.get(i-1)));
        setArgument2(Double.parseDouble(list.get(i+1)));
        setArgument3(getArgument1() + getArgument2());
        list.remove(i+1);
        list.remove(i);;
        list.set(i-1, Double.toString(getArgument3()));
    }

    /**
     * Метод операции вычитания
     */
    public void getSubtraction(List<String> list, int i) {
        setArgument1(Double.parseDouble(list.get(i-1)));
        setArgument2(Double.parseDouble(list.get(i+1)));
        setArgument3(getArgument1() - getArgument2());
        list.remove(i+1);
        list.remove(i);;
        list.set(i-1, Double.toString(getArgument3()));
    }

    /**
     * Метод операции деления
     */
    public void getDivision(List<String> list, int i) {
        setArgument1(Double.parseDouble(list.get(i-1)));
        setArgument2(Double.parseDouble(list.get(i-1)));
        setArgument3(getArgument1() / getArgument2());
        list.remove(i+1);
        list.remove(i);;
        list.set(i-1, Double.toString(getArgument3()));
    }
}

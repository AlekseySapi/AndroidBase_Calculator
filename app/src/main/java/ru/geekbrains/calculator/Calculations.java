package ru.geekbrains.calculator;

public class Calculations {

    private double number1;
    private double number2;
    private double result;

    public Calculations() {
        this.number1 = 0;
        this.number2 = 0;
        this.result = 0;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }


}

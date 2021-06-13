package ru.geekbrains.calculator;

public class Calculations {

    private double num1;
    private double num2;
    private boolean isSecondEntry = true;

    public boolean isSecondEntry() {
        return isSecondEntry;
    }

    public void setSecondEntry(boolean secondEntry) {
        isSecondEntry = secondEntry;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double plus(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }


}

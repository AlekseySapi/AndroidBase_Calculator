package ru.geekbrains.calculator;

public class Calculations {

    private double num1, num2;
    private final int ROUND = 3;    // Округление при делении
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

//    Сделал округление, потому что были случаи результата со множеством лишних цифр после запятой - нужно разобраться
    public double plus(double num1, double num2) {
        double scale = Math.pow(10, ROUND);
        return Math.round((num1 + num2) * scale) / scale;
    }

    public double minus(double num1, double num2) {
        double scale = Math.pow(10, ROUND);
        return Math.round((num1 - num2) * scale) / scale;
    }

    public double multiply(double num1, double num2) {
        double scale = Math.pow(10, ROUND);
        return Math.round((num1 * num2) * scale) / scale;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            return -1;
        } else {
            double scale = Math.pow(10, ROUND);
            return Math.round((num1 / num2) * scale) / scale;
        }
    }

}

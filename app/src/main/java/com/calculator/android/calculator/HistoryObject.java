package com.calculator.android.calculator;

public class HistoryObject {

    private double num1;
    private double num2;
    private String operator;
    private double answer;

    public void newEntry(double num_1, double num_2, String _operator, double _answer) {
        setNum1(num_1);
    }

    public void setNum1(double num_1) {
        num1 = num_1;
    }

    public void setNum2(double num_2) {
        num2 = num_2;
    }

    public void setOperator(String _operator) {
        operator = _operator;
    }

    public void setAnswer(double _answer) {
        answer = _answer;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }

    public double getAnswer() {
        return answer;
    }
}

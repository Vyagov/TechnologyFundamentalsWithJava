package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private String operator;
    private double rightOperand;

    public Calculator() {

    }

    public Calculator(double leftOperand, String operator, double rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public double calculateResult() {
        double result;

        switch (this.operator) {
            case "+":
                result = this.leftOperand + this.rightOperand;
                break;
            case "-":
                result = this.leftOperand - this.rightOperand;
                break;
            case "*":
                result = this.leftOperand * this.rightOperand;
                break;
            case "/":
                result = this.leftOperand / this.rightOperand;
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

    public String divideByZero() {
        return "Division by zero!";
    }

    public Double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(Double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(Double rightOperand) {
        this.rightOperand = rightOperand;
    }
}

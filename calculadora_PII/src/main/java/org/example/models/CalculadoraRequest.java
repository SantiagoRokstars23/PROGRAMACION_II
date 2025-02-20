package org.example.models;


public class CalculadoraRequest {
    private double numberOne;
    private double numberTwo;

    private String signo;

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public String getSigno() {
        return signo;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
}

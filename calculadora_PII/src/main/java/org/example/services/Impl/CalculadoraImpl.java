package org.example.services.Impl;

import org.example.exception.CalculadoraException;
import org.example.models.CalculadoraRequest;
import org.example.services.Calculadora;

public class CalculadoraImpl implements Calculadora {


    public double executeOperation(CalculadoraRequest dataRequest) {

        double totalOperation;

        return switch (dataRequest.getSigno()) {
            case "+" -> {
                totalOperation = dataRequest.getNumberOne() + dataRequest.getNumberTwo();
                yield totalOperation;
            }
            case "-" -> {
                totalOperation = dataRequest.getNumberOne() - dataRequest.getNumberTwo();
                yield totalOperation;
            }
            case "*" -> {
                totalOperation = dataRequest.getNumberOne() * dataRequest.getNumberTwo();
                yield totalOperation;
            }
            case "/" -> {
                totalOperation = dataRequest.getNumberOne() / dataRequest.getNumberTwo();
                yield totalOperation;
            }
            default -> throw new CalculadoraException("Error. signo incorrecto");
        };

    }
}

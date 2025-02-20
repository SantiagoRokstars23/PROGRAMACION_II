package org.example.services;

import org.example.models.CalculadoraRequest;

public interface Calculadora {


    /**
     * Ejecuta una operación matemática basada en el operador proporcionado en el
     * Objeto CalculadoraRequest. La operación se realiza en dos BigDecimal
     * Números también proporcionados en la solicitud.
     *
     * @param dataRequest el objeto de solicitud que contiene dos números y un operador
     * @return el resultado de la operación como un BigDecimal
     */
    double executeOperation(CalculadoraRequest dataRequest);
}

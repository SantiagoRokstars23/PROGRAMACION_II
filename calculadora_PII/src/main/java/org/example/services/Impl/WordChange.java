package org.example.services.Impl;

import org.example.models.ContarVocalesConsonantesResponse;
import org.example.models.DataWord;

public class WordChange implements org.example.services.WordChange {

    @Override
    public ContarVocalesConsonantesResponse getContarVocalesConsonantes(DataWord dataRequest) {

        ContarVocalesConsonantesResponse response = new ContarVocalesConsonantesResponse();

        String cadena = "";
        int vocales = 0;
        int consonantes = 0;

        // Convertimos la cadena a minúsculas para simplificar la comparación
        cadena = dataRequest.getPalabra().toLowerCase();

        // Definir las vocales
        String vocalesStr = "aeiou";

        for (char c : cadena.toCharArray()) {
            if (Character.isLetter(c)) { // Verifica si es una letra
                if (vocalesStr.indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        response.setConsonantes(consonantes);
        response.setVocales(vocales);

        return response;
    }

    @Override
    public String getInverseWord(DataWord dataRequest) {
        return new StringBuilder(dataRequest.getPalabra()).reverse().toString();
    }
}

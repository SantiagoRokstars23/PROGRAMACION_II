package org.example.services;

import org.example.models.ContarVocalesConsonantesResponse;
import org.example.models.DataWord;

public interface WordChange {

    /**
     * Cuenta el nￃﾺmero de vocales y consonantes en una palabra dada.
     * Convierte la cadena a minￃﾺsculas para simplificar la comparaciￃﾳn y
     * verifica cada carￃﾡcter.
     *
     * @param dataRequest objeto que contiene la palabra a analizar
     * @return objeto response con el conteo de vocales y consonantes
     */
    ContarVocalesConsonantesResponse getContarVocalesConsonantes(DataWord dataRequest);


    /**
     * Invierte el orden de los caracteres de la palabra proporcionada.
     *
     * @param dataRequest objeto que contiene la palabra a invertir
     * @return la palabra invertida como String
     */

    String getInverseWord(DataWord dataRequest);
}

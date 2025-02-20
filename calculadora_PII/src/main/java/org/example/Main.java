package org.example;

import org.example.models.CalculadoraRequest;
import org.example.models.DataWord;
import org.example.services.Calculadora;
import org.example.services.Impl.CalculadoraImpl;
import org.example.services.Impl.WordChange;

public class Main {

    public static void main(String[] args) {

        //----------------------------------------------------CALCULADORA

        CalculadoraRequest dataCalculadora = new CalculadoraRequest();
        Calculadora calculadora = new CalculadoraImpl();

        dataCalculadora.setNumberOne(2);
        dataCalculadora.setNumberTwo(4);
        dataCalculadora.setSigno("+");

        var total = calculadora.executeOperation(dataCalculadora);
        System.out.println("El total de la operacion es : " + total);


        //----------------------------------------------------CONTEO


        DataWord dataContar = new DataWord();
        org.example.services.WordChange wordChange = new WordChange();

        dataContar.setPalabra("Hola");

        var reponse = wordChange.getContarVocalesConsonantes(dataContar);

        System.out.println("Número de vocales de la palabra: " + dataContar.getPalabra() + " son " + reponse.getVocales());
        System.out.println("Número de consonantes de la palabra " + dataContar.getPalabra() + " son " + reponse.getConsonantes());


        //----------------------------------------------------INVERTIR


        DataWord dataInverse = new DataWord();
        dataInverse.setPalabra("Hello world");

        var inverse = wordChange.getInverseWord(dataInverse);

        System.out.println("La Palabra " + dataInverse.getPalabra() + " inversa es " + inverse);

    }
}
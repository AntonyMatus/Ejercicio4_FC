package com.example;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;

public class Sparkpost {

    public static void main(String[] args) throws SparkPostException {
        String API_KEY = "dcb3a3b03a5e55dc190e6e874b201620b1d2d506";
        Client client = new Client(API_KEY);

        client.sendMessage(
                "",
                "antonyrebolledo@gmail.com",
                "Ejercicio 4 FC",
                "Prueba de envio de mail",
                "<h1> Hola Antony este es un email de prueba enviado desde una clase de JAVA! </h1>"
        );


    }
}

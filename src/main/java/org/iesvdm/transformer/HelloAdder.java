package org.iesvdm.transformer;

// Ejercicio 6: Clase `HelloAdder` que implementa `Transformer<String>`

public class HelloAdder implements Transformer<String> {
    // Método `transform` que añade el saludo "Hello " al inicio de una cadena.
    public String transform(String str) {
        return "Hello " + str;
    }
}

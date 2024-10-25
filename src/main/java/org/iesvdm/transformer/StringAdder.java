package org.iesvdm.transformer;

// Implementa la interfaz `Joiner` para tipos `String`
public class StringAdder implements Joiner<String> {

    // Método `join` que toma dos cadenas y las une con un espacio en medio
    @Override
    public String join(String obj1, String obj2) {
        return obj1 + " " + obj2; // Une las dos cadenas con un espacio entre ellas.
    }
}

package org.iesvdm.transformer;

// Implementa la interfaz `GenericType` para el tipo `Integer`
public class IntegerCheck implements GenericType<Integer> {

    // Método `typeMethod` que verifica si el número entero es par
    @Override
    public boolean typeMethod(Integer object) {
        return object % 2 == 0; // Retorna `true` si `object` es par, `false` si es impar
    }
}

package org.iesvdm.transformer;
import java.util.Arrays;
import java.util.List;

public class TestTransformers {
    public static void main(String[] args) {
        // Prueba IntegerCheck: Verificar números pares
        IntegerCheck integerCheck = new IntegerCheck();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = GenericClass.genericMethod(integerCheck, numbers);
        System.out.println("Even numbers: " + evenNumbers); // Esperado: [2, 4, 6]

        // Prueba StringAdder: Unir dos cadenas
        StringAdder stringAdder = new StringAdder();
        String result = stringAdder.join("Hello", "world");
        System.out.println("Joined strings: " + result); // Esperado: "Hello world"
    }
}

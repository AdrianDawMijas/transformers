package org.iesvdm.transformer;

// Clase GreetingAdder que implementa la interfaz Transformer<String>
// Esta clase permite añadir un saludo personalizado al inicio de cualquier cadena
public class GreetingAdder implements Transformer<String> {
    // Variable de instancia para almacenar el saludo personalizado
    private String greeting;

    // Constructor de la clase que inicializa el saludo con un valor específico
    public GreetingAdder(String greeting) {
        this.greeting = greeting;
    }

    // Método getter para obtener el valor actual del saludo
    public String getGreeting() {
        return greeting;
    }

    // Método setter para cambiar el valor del saludo después de crear el objeto
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    // Implementación del método transform de la interfaz Transformer<String>
    // Añade el saludo seguido de un espacio al inicio de la cadena obj recibida como argumento
    @Override
    public String transform(String obj) {
        return greeting + " " + obj;
    }
}

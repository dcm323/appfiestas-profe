package org.example;

public class Empleado {

        // atributos
        String nombre;

    // constructor

    public Empleado() {
    }

    //metodos especiales
 public String saludar(String nombrecito){
        String saludo="Hola "+nombrecito;
        return saludo;
    }

    public int sumar(int numeroUno, int numeroDos){
        int resultado = numeroUno + numeroDos;
        return resultado;
    }

}
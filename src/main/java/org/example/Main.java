package org.example;

public class Main {
    public static void main(String[] args) {

        //EN EL MAIN LLAMO A MIS CLASES
        //EN EL MAIN CREO LOS OBJETOS DE MIS CLASES
        //EN EL MAIN CREO UNA INSTANCIA DE MI CLASE
        //EN EL MAIN LE SACO COPIA A MIS CLASES Y CREO OBJETOS

       //para usar una clase creo un objeto
        // para crear el objeto llamo la clase
        //usar una clase es poder acceder a los atributos y metodos
        //es el constructor el que crea el objeto

        Empleado objeto = new Empleado();
        //utilizar el objeto para acceder al atributo
        objeto.nombre="pepe";

        //utilizar el objeto para acceder a los metodos
        int sumatoria = objeto.sumar(5,3);
        String resultado=objeto.saludar("Daniel");

        //salidas por consola
        //acceder a mostrar el valor de un atributo
        System.out.println(objeto.nombre);

        //acceder a mostrar el retorno de la funcion
        System.out.println(objeto.saludar("Daniel"));
        System.out.println(resultado);
        System.out.println(sumatoria);






    }
}
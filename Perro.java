/*
Profesor: Lynette García
Auxiliar: Rodrigo Barrera

INTEGRANTE: 
Sergio Alejandro Orellana Colindres (221122)
11/08/2022

Ejercicio 1

Curso: Programación Orientada a Objetos
Sección: 10

*/

//Se crea la clase perro
public class Perro {
    //Se declara la variable numeroperrera
    private int numeroperrera;
    //Raza, color y nombre del perro
    private String color = "";
    private String raza = "";
    private String nombre = "";

    //Se crea  el constructor donde almacenara el nuevo valor de numero perrera
    public Perro(int numeroperrera, String nombre, String color, String raza){
        this.numeroperrera = numeroperrera;
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;

    }
    /*
    * Obtiene el numeroperrera
    * @return un int con el numeroperrera
    */
    public int getNumeroperrera() {
        return numeroperrera;
    }
    /*
    * setNumeroperrera modifica el numero perrera
    * @param numeroperrera: Es la nueva cantidad de numeroperrera
    */
    public void setNumeroperrera(int numeroperrera) {
        this.numeroperrera = numeroperrera;
    }
    /*
    * Obtiene el color
    * @return un String con el color
    */
    public String getColor() {
        return color;
    }
    /*
    * setColor modifica el color
    * @param Color: Es el nuevo color
    */
    public void setColor(String color) {
        this.color = color;
    }
    /*
    * Obtiene la raza
    * @return un String con la raza
    */
    public String getRaza() {
        return raza;
    }
    /*
    * setRaza modifica la raza
    * @param Raza: Es la nueva raza
    */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Se me muestra un mensaje al usuario con numero perrera (numero entre 1 a 20)
    public String toString() {
        String cadena = "";
        cadena = "Numero de perrera: " + numeroperrera;
        return cadena;
    }


}

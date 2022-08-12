/*
Profesor: Lynette García
Auxiliar: Rodrigo Barrera

INTEGRANTE: 
Sergio Alejandro Orellana Colindres (221122)
06/08/2022

Ejercicio 1

Curso: Programación Orientada a Objetos
Sección: 10

*/

//Se importa la funcion Scanner
import java.util.Scanner;

//Se crea la clase principal
public class Principal {
    
    
    /** 
     * @param args
     */
    //Se crea el metodo main
    public static void main(String[] args) {
        //Aqui estoy declarando las variables
        Persona persona = new Persona();
        Scanner teclado = new Scanner(System.in);
        String raza = "";
        String color = "";
        String nombre = "";
        String nombrePersona = "";
        String telefono = "";


        //Aqui estoy inicializando para que entre a la pregunta while
        int pregunta = 1;
        System.out.println("\t\t\tBienvenido a mi programa a búsqueda de perritos");
        while (pregunta != 8){
            //Se le realiza lo que quiere realizar
            System.out.println("¿Qué acción deseas realizar? \n1) Nuevo amigo: \n2) Nuevo perro \n3) Llamar a la perrera \n4) Imprimir anuncio para colocar en postes \n5) Publicar anuncio en el periodico local \n6) Dinero disponible \n7) Encuentro con amigo \n8) Salir \nIngrese la opción aquí: ");
            pregunta = teclado.nextInt();
            
            switch(pregunta){
                case 1:{
                    System.out.println("\nCantidad de dinero disponible: Q" + persona.cantidad());
                    System.out.println("Ingrese sus nuevos datos, por favor: ");
                    String x = teclado.nextLine();
                    System.out.println("Ingrese su nombre: ");
                    nombrePersona = teclado.nextLine();
                    System.out.println("Forma de contactarlo");
                    telefono = teclado.nextLine();
                    persona.llenarPersona(nombre, telefono);
                    break;
                }
                case 2:{
                    String x = teclado.nextLine();
                    System.out.println("Ingrese el nombre de su perro");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese la raza de su perro");
                    raza = teclado.nextLine();
                    System.out.println("Ingrese el color de su perro");
                    color = teclado.nextLine();
                    persona.llenarPerro(raza, color, nombre);
                    break;
                }
                case 3: {
                    persona.estado();
                    System.out.println(persona.getNumeroaleatorio());
                    System.out.println(persona.accion(0, raza, color, nombre));
                    break;
                }
                case 4: {
                    persona.estado();
                    System.out.println("Tienes un total cantidad de: Q" + persona.getCantidadinicial());
                    System.out.println(persona.getNumeroaleatorio());
                    persona.Cantidad(1);
                    System.out.println("Costo de: Q25.00");
                    System.out.println(persona.accion(1, raza, color, nombre));
                    break;
                }
                case 5: {
                    persona.estado();
                    System.out.println("Tienes un total cantidad de: Q" + persona.getCantidadinicial());
                    System.out.println(persona.getNumeroaleatorio());
                    persona.Cantidad(2);
                    System.out.println("Costo de: Q125.00");
                    System.out.println(persona.accion(2, raza, color, nombre));
                    break;
                }
                case 6: {
                    System.out.println("Tienes un total cantidad de: Q" + persona.getCantidadinicial());
                    break;
                }
                case 7: {
                    System.out.println("Lugar donde le ayudo a encontrar a su perro \n" + persona.lugar());
                    System.out.println("Cantidad total gastada para encontar el perro: Q" + persona.getCantidadgastada());
                    break;
                }
            }
        }System.out.println("Gracias por usar mi programa, hasta luego espero que hayas encontrado a tu perro");
        
    }
}

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

//Se importa la  funcion Random
import java.util.Random;

//Se crea la clase persona
public class Persona {
    //Se declaran las variables 
    private double cantidadinicial = 0;
    private double cantidadgastada = 0;
    int numeroaleatorio = 0;
    private Perro perro = new Perro(0, "", "", "");
    private String nombre;
    private String telefono;
    int encontrarperro = 1;
    int reaccion;
    int fondos = 1;
    

    
    /** 
     * @return double
     */
    /*
    * Obtiene la cantidad inicial
    * @return int con la cantida inicial
    */   
    public double getCantidadinicial() {
        return cantidadinicial;
    }
    
    /** 
     * @param cantidadinicial
     */
    /*
    * setCantidadInicial modifica la cantidad inicial
    * @param cantidadinicial: Es la nueva cantidad de cantidad inicial
    */   
    public void setCantidadinicial(double cantidadinicial) {
        this.cantidadinicial = cantidadinicial;
    }
    
    /** 
     * @return double
     */
    /*
    * Obtiene la cantidad gastada
    * @return int con la cantida gastada
    */   
    public double getCantidadgastada() {
        return cantidadgastada;
    }
    
    /** 
     * @param cantidadgastada
     */
    /*
    * setCantidadgastada modifica la cantidad gastada
    * @param cantidadgastada: Es la nueva cantidad de cantidad gastada
    */       
    public void setCantidadgastada(double cantidadgastada) {
        this.cantidadgastada = cantidadgastada;
    }
    
    /** 
     * @return int
     */
    /*
    * Obtiene el numero aleatorio de numero perrera
    * @return int con el valor de numero aleatorio (numeroperrera)
    */     
    public int getNumeroaleatorio() {
        return numeroaleatorio;
    }
    
    /** 
     * @param numeroaleatorio
     */
    /*
    * @param numeroaleatorio y cambia el numeroaleatorio
    */    
    public void setNumeroaleatorio(int numeroaleatorio) {
        this.numeroaleatorio = numeroaleatorio;
    }
    
    /** 
     * @return int
     */
    /*
    * Obtiene el modo que lo ayudo para encontrarlo
    * @return reaccion
    */    
    public int getReaccion() {
        return reaccion;
    }
    
    /** 
     * @param reaccion
     */
    /*
    * setPerro modifica el modo que lo ayudo a encontrarlo 
    * @param reaccion y cambia el valor de la variable reaccion
    */   
    public void setReaccion(int reaccion) {
        this.reaccion = reaccion;
    }
    
    /** 
     * @return int
     */
    /*
    * Obtiene si se encontro el perro
    * @return encontrarperro
    */   
    public int getEncontrarperro() {
        return encontrarperro;
    }
    
    /** 
     * @param encontrarperro
     */
    /*
    * setEncontrarperro modifica si se encontro el perro o no
    * @param encontrarperro y cambia el valor de la variable encontrar perro
    */   
    public void setEncontrarperro(int encontrarperro) {
        this.encontrarperro = encontrarperro;
    } 
    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /** 
     * @return String
     */
    public String getTelefono() {
        return telefono;
    }
    
    /** 
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /** 
     * @return int
     */
    public int getFondos() {
        return fondos;
    }
    
    /** 
     * @param fondos
     */
    public void setFondos(int fondos) {
        this.fondos = fondos;
    } 

    
    /** 
     * @return String
     */
    //Aqui se crea el metodo to String y le muestra un mensaje al usuario con las caracteristicas del perro
    public String toString() {
        String cadena;
        cadena = "El numero perrera es de: " + perro.getNumeroperrera() + "\n";
        return cadena;
    }
    //Aqui se crea el metodo estado
    public void estado(){     
        Random miGenerador = new Random();

        //Se obtiene un valor entre 1 y 20
        numeroaleatorio = miGenerador.nextInt(1, 21);

        //Numeroaleatorio se manda como parametro a la clase perro
        perro = new Perro(numeroaleatorio, perro.getNombre(), perro.getColor(), perro.getRaza());
    }

    
    /** 
     * @param raza
     * @param color
     * @param nombre
     */
    public void llenarPerro(String raza, String color, String nombre){
        System.out.println(perro);
        perro.setColor(color);
        perro.setRaza(raza);
        perro.setNombre(nombre);
    }
    
    /** 
     * @param nombre
     * @param telefono
     */
    public void llenarPersona(String nombre, String telefono){
        setNombre(nombre);
        setTelefono(telefono);
    }

    
    /** 
     * @return double
     */
    public double cantidad(){
        Random miGenerador = new Random();
        encontrarperro = 1;
        //Obtiene una cantidad inicial entre 1 a 1000
        cantidadinicial = miGenerador.nextInt(1, 1001);

        return cantidadinicial;
    }

    
    /** 
     * @param i
     * @return int
     */
    public int Cantidad(int i){
        if(encontrarperro != 0){
            if (i == 1 && cantidadinicial >= 25){
                cantidadinicial = cantidadinicial - 25;
                cantidadgastada = cantidadgastada + 25;
            }
            else if(i == 2 && cantidadinicial >= 125){
                cantidadinicial = cantidadinicial - 125;
                cantidadgastada = cantidadgastada + 125;
            }
            fondos = 0;
        }
        return fondos;
    }
    
    /** 
     * @param i
     * @param raza
     * @param color
     * @param nombre
     * @return String
     */
    //Se crea el metodo estado que devolvera el estado del perro
    //String raza, String color
    public String accion(int i, String raza, String color, String nombre){

        if (encontrarperro != 0){
            //Aqui se verifica que el numero perrera sea menor a 5 
            if (perro.getNumeroperrera() < 5 && i == 0 && raza.equals(perro.getRaza()) && color.equals(perro.getColor()) && nombre.equals(perro.getNombre())){
                reaccion = 1;
                encontrarperro = encontrarperro - 1;
                return "Llevaron a su perro";
            }
                
            //Aqui se verifica que el numero perrera sea menor a 10 y que tenga por lo menos la cantidad de  25 y que tenga las caracteristicas especificas
            if(perro.getNumeroperrera() < 10 && cantidadinicial >= 25 && i == 1 && raza.equals(perro.getRaza()) && color.equals(perro.getColor()) && nombre.equals(perro.getNombre())){
                reaccion = 2;
                encontrarperro = encontrarperro - 1;
                return "Te estan llamando\nSe vio un perrito muy parecido a las caracteristicas que especificaste" + "\nNombre: " + perro.getNombre() + "\nRaza: " + perro.getRaza() + "\nColor: " + perro.getColor();
            }

            //Aqui se verifica que el numero perrera sea menor a 15 y que tenga por lo menos la cantidad de  125                
            else if(perro.getNumeroperrera() < 15 && cantidadinicial >= 125 && i == 2 && raza.equals(perro.getRaza()) && color.equals(perro.getColor()) && nombre.equals(perro.getNombre())){
                reaccion = 3;
                encontrarperro = encontrarperro - 1;
                return "Te estan llamando\nSe vio un perrito muy parecido a las caracteristicas que especificaste" + "\nNombre: " + perro.getNombre() + "\nRaza: " + perro.getRaza() + "\nColor: " + perro.getColor();
            }
            reaccion = 0;
            return "No se encontro a tu perro";
        }
        return "Ya encontraste a tu perro ya no puedes acceder a estas opciones."; 
    }

    /** 
     * @return String
     */
    public String lugar(){
        if (reaccion == 0){
            return "No encontro a su perrito";
        }
        if(reaccion == 1){
            return "La forma que te ayudo a encontrar a tu perrito fue llamar a la perrera";
        }
        else if(reaccion == 2){
            return "La forma que te ayudo a encontrar a tu perrito fue imprimiendo anuncios";
        }
        else if(reaccion == 3){
            return "La forma que te ayudo a encontrar a tu perrito fue pagando un anuncio en un periodico";
        }
        return "No se encontro su perro";
    }
}

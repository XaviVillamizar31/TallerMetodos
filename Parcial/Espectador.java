/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

/**
 *
 * @author xavis
 */
public class Espectador {
    String nombre;
    int edad;
    double dinero;

    public espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    public void pagar(double precio) {
        dinero -= precio;
    }
    
    public boolean tieneEdad(int edadMinima) {
        return edad >= edadMinima;
    }
 
    public boolean tieneDinero(double precioEntrada) {
        return dinero >= precioEntrada;
    }
 
    @Override
    public String toString() {
        return "el nombre del espectador es " + nombre + " de " + edad + " años y con " + dinero + " euros en su bolsillo";
    }
    
    public class Asiento {

        char letra;
        int fila;
        Espectador espectador;
        
        public Asiento(char letra, int fila, Espectador espectador) {
            this.letra = letra;
            this.fila = fila;
            this.espectador = espectador;
        }

        public char getLetra() {
            return letra;
        }

        public void setLetra(char letra) {
            this.letra = letra;
        }

        public int getFila() {
            return fila;
        }

        public void setFila(int fila) {
            this.fila = fila;
        }

        public Espectador getEspectador() {
            return espectador;
        }

        public void setEspectador(Espectador espectador) {
            this.espectador = espectador;
        }
        
        public boolean ocupado() {
        return espectador != null;
    }
 
    @Override
    public String toString() {
        if (ocupado()) {
            return "Asiento: " + fila + letra + " y " + espectador;
        }
 
        return "Asiento: " + fila + letra + " y este asiento está vacio ";
 
    }
        
    }
    
    public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;
 
    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
 
    /*Metodos*/
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public int getDuracion() {
        return duracion;
    }
 
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
 
    public int getEdadMinima() {
        return edadMinima;
    }
 
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
 
    public String getDirector() {
        return director;
    }
 
    public void setDirector(String director) {
        this.director = director;
    }
 
    @Override
    public String toString() {
        return "'" + titulo + "' del director " + director + ", con una duracion de " + duracion + " minutos y la edad minima es de " + edadMinima + " años";
    }
 
}
    
    public class Cine {
 
    /*Atributos*/
    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;
 
    /*Constructor*/
    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {
 
        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenaButacas();
    }
 
    /*Metodos*/
    public Asiento[][] getAsientos() {
        return asientos;
    }
 
    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
    public Pelicula getPelicula() {
        return pelicula;
    }
 
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
 

    private void rellenaButacas() {
 
        int fila = asientos.length;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                
                asientos[i][j] = new Asiento((char) ('A' + j), fila);
            }
            fila--; //Decremento la fila para actualizar la fila
        }
 
    }
    public boolean haySitio() {
 
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
 
                if (!asientos[i][j].ocupado()) {
                    return true;
                }
 
            }
        }
 
        return false;
    }
    public boolean haySitioButaca(int fila, char letra) {
        return getAsiento(fila, letra).ocupado();
    }
 
}
}

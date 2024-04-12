/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

/**
 *
 * @author xavis
 */
// Definición de la clase Linea

class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void desplazar(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}


// Definición de la clase Linea
class Linea {
    private Punto puntoA;
    private Punto puntoB;

    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    public void mueveDerecha(double distancia) {
        puntoA.desplazar(distancia, 0);
        puntoB.desplazar(distancia, 0);
    }

    public void mueveIzquierda(double distancia) {
        puntoA.desplazar(-distancia, 0);
        puntoB.desplazar(-distancia, 0);
    }

    public void mueveArriba(double distancia) {
        puntoA.desplazar(0, distancia);
        puntoB.desplazar(0, distancia);
    }

    public void mueveAbajo(double distancia) {
        puntoA.desplazar(0, -distancia);
        puntoB.desplazar(0, -distancia);
    }

    @Override
    public String toString() {
        return "[" + puntoA + "," + puntoB + "]";
    }
}
    



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

/**
 *
 * @author xavis
 */
public class cuenta {
    
    long numeroCuenta = 72727;
    float DNI = 31237;
    float saldoActual = 10000;
    float interesAnual = 20;
    
    

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    

    public float getDNI() {
        return DNI;
    }

    public float getSaldoActual() {
        return saldoActual;
    }

    public float getInteresAnual() {
        return interesAnual;
    }    
    
     public float actualizarSaldo() {
        float saldoNuevo;
        saldoNuevo = saldoActual + (saldoActual * ((interesAnual / 100) / 365));
        return saldoNuevo;
        
        
    }
    
    public double ingresar(double cantidadIng) {
        double nuevoMonto;
        nuevoMonto = actualizarSaldo() + cantidadIng;
        return nuevoMonto;
    }
    
    public double retirar(double cantidadRet) {
        double nuevoMonto = 0;
        if (this.saldoActual >= cantidadRet) {
            nuevoMonto = actualizarSaldo() - cantidadRet;
        } else {
            System.out.println("No hay saldo suficiente en su cuenta!!");
        }
        return nuevoMonto;
    }
}



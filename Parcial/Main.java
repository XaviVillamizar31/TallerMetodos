package Parcial;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author xavis
 */
public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(0.0, 0.0);
        Punto punto2 = new Punto(1.0, 1.0);

        Linea linea = new Linea(punto1, punto2);
        System.out.println("Línea inicial: " + linea); // Imprime Línea inicial: [(0.0,0.0),(1.0,1.0)]
        linea.mueveDerecha(2.0);
        System.out.println("Desplazada a la derecha: " + linea); // Imprime Desplazada a la derecha: [(2.0,0.0),(3.0,1.0)]
        linea.mueveArriba(3.0);
        System.out.println("Desplazada hacia arriba: " + linea); 
        
       ////////////////////////////
        
        cuenta miCuenta = new cuenta();
            System.out.println("Número de cuenta: " + miCuenta.getNumeroCuenta());
            System.out.println("DNI asociado: " + miCuenta.getDNI());
            System.out.println("Saldo actual: " + miCuenta.getSaldoActual()); 
            System.out.println("Interés anual (%): " + miCuenta.getInteresAnual());
            
            double cantidadIng = 200;
            double cantidadRet = 200;
            
            double nuevoIngreso = miCuenta.ingresar(cantidadIng);
            System.out.println("Después de retirar " + cantidadIng + "€, el nuevo saldo es: " + nuevoIngreso);
            
            double nuevoIngreso2 = miCuenta.retirar(cantidadRet);
            System.out.println("Después de ingresar " + cantidadIng + "€, el nuevo saldo es: " + nuevoIngreso2);
            
      //////////////////////////////////
      
        
    }
}
        



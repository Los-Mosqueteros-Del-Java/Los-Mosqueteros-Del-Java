package es.plaiaundi.ed.calculadora;

import java.util.Scanner;

/**
 * Punto de entrada: muestra una demostracion de cada operacion.
 */
public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Calculadora del equipo ===");
        
        System.out.println("Introduce el primer número:");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int b = sc.nextInt();

        // Demostraciones: cada persona anade AQUI debajo su linea
        System.out.println("Suma: " + calc.sumar(a, b));
        System.out.println("Resta: " + calc.restar(a, b));
        System.out.println("Multiplicación: " + calc.multiplicar(a, b));
        
        sc.close(); // Buena práctica para cerrar el Scanner
    }
}

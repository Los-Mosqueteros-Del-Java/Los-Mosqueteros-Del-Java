package es.plaiaundi.ed.calculadora;

/**
 * Calculadora basica del equipo.
 * Cada operacion la implementa una persona distinta, en su propia rama.
 */
public class Calculadora {

    /**
     * Resta dos numeros enteros.
     * Responsable: Persona A (rama feature/resta).
     *
     * @param a sumando
     * @param b sumando
     * @return a + b
     */
    public int sumar(int a, int b) {
        
        return a + b;
    }

    /**
     * Resta dos numeros enteros.
     * Responsable: Persona B (rama feature/resta).
     *
     * @param a minuendo
     * @param b sustraendo
     * @return a - b
     */
    public int restar(int a, int b) {
        // TODO Persona B: implementar la resta
        return a - b;
    }

    /**
     * Multiplica dos numeros enteros.
     * Responsable: Persona C (rama feature/multiplicacion).
     *
     * @param a primer factor
     * @param b segundo factor
     * @return a * b
     */
    public int multiplicar(int a, int b) {
        // TODO Persona C: implementar la multiplicacion
        return (a * b);
    }
}

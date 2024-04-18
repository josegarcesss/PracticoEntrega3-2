/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoentrega3.pkg2;

/**
 *
 * @author sanbe
 */
public class Pilar {
    private final char[] discos;
    private int tope;
    private final int tam;



    private final String nombre;

    public Pilar(int tam, String nombre) {
        this.discos = new char[tam];
        tope = -1;
        this.tam = tam;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    public void llenarPilar() {
        for (int i = tam; i >= 1; i--) {
            char disco = (char) ('0' + i); 
            push(disco);
        }
    }
    public boolean pilarVacio() {
        return (tope == -1);
    }

    public boolean pilarLleno() {
        return (tope == tam - 1);
    }

public void push(char disco) {
    if (pilarLleno()) {
        System.out.println("Error: el pilar está lleno.");
    } else if (!pilarVacio() && disco >= discos[tope]) {
        System.out.println("Error: no se puede colocar un disco más grande sobre uno más pequeño.");
    } else {
        tope++;
        discos[tope] = disco;
    }
}

    public char pop() {
        if (pilarVacio()) {
            System.out.println("Error: el pilar esta vacio.");
            return 0;
        } else {
            char disco = discos[tope];
            discos[tope] = 0;
            tope--;
            return disco;
        }
    }

    public void verElemento() {
        if (pilarVacio()) {
            System.out.println("Error: el pilar está vacio.");
        } else {
            System.out.println("Disco en el tope del pilar: " + discos[tope]);
        }
    }

    public void mostrar() {
        System.out.print("Pilar: ");
        for (int i = tope; i >= 0; i--) {
            System.out.print(discos[i] + " ");
        }
        System.out.println();
    }
}

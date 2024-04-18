/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoentrega3.pkg2;

/**
 *
 * @author sanbe
 */
public class JuegoTorresHanoi {
    private final Pilar pilarA;
    private final Pilar pilarB;
    private final Pilar pilarC;
    private final int numDiscos;

    public JuegoTorresHanoi(int numDiscos) {
        this.numDiscos = numDiscos;
        this.pilarA = new Pilar(numDiscos, "Pilar A");
        this.pilarB = new Pilar(numDiscos, "Pilar B");
        this.pilarC = new Pilar(numDiscos, "Pilar C");
    }


    public void jugar() {
        pilarA.llenarPilar();
        System.out.println("Configuracion inicial:");
        mostrarPilares();
        moverDiscos(numDiscos, pilarA, pilarC, pilarB);
        System.out.println("***Configuracion final:***");
        mostrarPilares();
    }

private void moverDiscos(int n, Pilar origen, Pilar destino, Pilar auxiliar) {
    if (n > 0) {
        moverDiscos(n - 1, origen, auxiliar, destino);
        char disco = origen.pop();
        destino.push(disco);
        System.out.println("Mover disco " + disco + " de " + origen.toString() + " a " + destino.toString());
        mostrarPilares();
        moverDiscos(n - 1, auxiliar, destino, origen);
    }
}


    private void mostrarPilares() {
        pilarA.mostrar();
        pilarB.mostrar();
        pilarC.mostrar();
        System.out.println();
    }
    

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package practicoentrega3.pkg2;

import java.util.Scanner;

public class PracticoEntrega32 {
        //@param args the command line arguments
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);    
        
     System.out.print("Ingrese tamaño de la pila: ");
        Pila pila1=new Pila(sc.nextInt());
        Pila pila2=new Pila(pila1.getTam());
        Pila pila3=new Pila(pila1.getTam());
        
        
        
        
        
    }

}

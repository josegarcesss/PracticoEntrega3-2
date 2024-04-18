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
//     int cant;   
//     System.out.print("Ingrese tamaño de la pila: ");
//        cant=sc.nextInt();
        String cad1 = "{[(a+b)*m]-(d+e)}";
        Pila pilaEjercicioB1=new Pila(cad1.length());
        String cad2 = "<[{()}]>";
        Pila pilaEjercicioB2=new Pila(cad2.length());
        String cad3 = "[(])";
        Pila pilaEjercicioB3=new Pila(cad3.length());
        System.out.println(cad1+" está equilibrada?: " + pilaEjercicioB1.ejercicioB(cad1));
        System.out.println(cad2+" está equilibrada?: " + pilaEjercicioB2.ejercicioB(cad2));
        System.out.println(cad3+" está equilibrada?: " + pilaEjercicioB3.ejercicioB(cad3));
        
    
    //segunda parte//
        int numDiscos = 3;
        JuegoTorresHanoi juego = new JuegoTorresHanoi(numDiscos);
        juego.jugar();
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoentrega3.pkg2;


public class Pila {
    private int[] pila;
    private int tope;
    private int tam;

    

    public Pila(int tam) {
        this.pila = new int[tam];
        tope = -1;
        this.tam=tam;
    }
    
    
    
    public int getTam() {
        return tam;
    }    
    
    public boolean pilaVacia(){
    return (tope==-1);
    }
    
    public boolean pilaLlena(){
    return (tope==tam);
    }    
        
    public void push(int num){
        if (pilaLlena()){
            System.out.println("Error!!\nExcede el tamaño de la pila!");
        }else{
            tope++;
            pila[tope]=num;
        }
    }
        
    public void pop(){
        if(pilaVacia()){
            System.out.println("Error!!\nNo hay elementos en la pila!");
        }else{
            pila[tope]=0;
            tope--;
        }
    }
    
    public void verElemento(){
        if(pilaVacia()){
            System.out.println("Error!!\nNo hay elementos en la pila!");
        }else{
            System.out.println("Elemento en el Tope: "+pila[tope]);
        }
    }
    
    public int getElementoTope(){
        if(pilaVacia()){
            System.out.println("Error!!\nNo hay elementos en la pila!");
            return 0;
        }else{
            return pila[tope];
        }
    }
    
    
    public void invierteSimple(){
        Pila pilaAux1=new Pila(tam);
        Pila pilaAux2=new Pila(tam);
        if(pilaVacia()){
            System.out.println("No hay elementos en la fila!");
        }else{
            for (int i=tope;i>-1;i--){
            pilaAux1.push(getElementoTope());
            pop();                        
            }
            for (int i=tope;i>-1;i--){
            pilaAux2.push(pilaAux1.getElementoTope());
            pilaAux1.pop();                        
            }
            for (int i=tope;i>-1;i--){
            push(pilaAux2.getElementoTope());
            pilaAux2.pop();                        
            }
        }
    }
    
    
    
    
        
    }
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author rubra
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LOS ARREGLOS EN JAVA SON OBJETOS 
        //TENEMOS QUE CREARLOS ANTES DE USARLOS 
        //[] --> MANERJAR LOS INDICES: ARREGLO[3]
        int arreglo[] = new int [10];//un arreglo de 10 enteros
        //a traves de indices:
        //conocer las posiciones de los valores:
        //PRIMER POSICION DE UN ARREGLO ES --> 0 
        //LA ULTIMA POSICION DE UN ARREGLO ES --> N - 1,donde 
        //N es el tamaño del arreglo
        arreglo[1] = 100;
        System.out.println("Valor de arreglo[1] = " + arreglo[1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length);
              
    }
    
}

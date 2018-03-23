
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Arreglos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiEdad[];//arreglo sin inicializar
        Scanner scCaptu = new Scanner(System.in);//captura del teclado
        //System.out.println(aiEdad[5]); error se debe inicializar (new)
        System.out.println("Inreoduce la cantidad de edades a capturar: ");
        int iCant = scCaptu.nextInt();//captura desde el teclado ,al dar enter , un entero
        aiEdad = new int[iCant];
        for (int i = 0; i < aiEdad.length; i++) {
            System.out.println("Introduce la Edad = ");
            aiEdad[i]=scCaptu.nextInt();
            
        }
        //imprimir la edad
        for (int i : aiEdad) {
            System.out.print("["+i+"]");
        }
    }
    
}

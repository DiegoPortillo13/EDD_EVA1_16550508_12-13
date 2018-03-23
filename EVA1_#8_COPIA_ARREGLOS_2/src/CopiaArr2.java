/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class CopiaArr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Arre1[]=new int[5];
        Arre1[0]=1;
        Arre1[1]=2;
        Arre1[2]=3;
        Arre1[3]=4;
        Arre1[4]=5;
        for (int i : Arre1) {
            System.out.print("{"+i+"}");
        }System.out.println("");
        //Mi "copia" del arreglo *No sirve* ArreCop1 = Arre1
        int ArreCop1[]=new int[5];
        for (int i = 0; i < Arre1.length; i++) {
            ArreCop1[i] = Arre1[i];
        }
        for (int i : ArreCop1) {
            System.out.print("{"+i+"}");
        }
        System.out.println("");
        //modificar
        Arre1[2]=9999;
        for (int i : ArreCop1) {
            System.out.print("{"+i+"}");
        }
        System.out.println("");
        System.out.println(Arre1);
        System.out.println(ArreCop1);
    }
    
}

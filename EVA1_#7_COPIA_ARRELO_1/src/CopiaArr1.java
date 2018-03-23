/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class CopiaArr1 {

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
        Arre1[4]=6;
        //Mi "copia" del arreglo
        int ArreCop1[]= Arre1;
        // imprimir copia
        for (int i : ArreCop1) {
            System.out.println(i);
        }
        //modificar una posicion del arrglo original
        Arre1[2]=20;
        for (int i : ArreCop1) {
            System.out.println(i);
        }
        System.out.println(Arre1);
        System.out.println(ArreCop1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Arreglos4Lgth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArrx = new int[5];
        iArrx[0] = 1;
        iArrx[1] = 11;
        iArrx[2] = 111;
        iArrx[3] = 1111;
        iArrx[4] = 11111;
        for (int i = 0; i < iArrx.length; i++) {
            System.out.println("[ " + i + " ]" + " = " + iArrx[i]);
        }
        int[] iArrCx = new int[iArrx.length];
        System.out.println("Todo inteligente haciendo una copia para que no se pierda nada");
        for (int i = 0; i < iArrx.length; i++) {
            //Dato a copiar
            iArrCx[i]=iArrx[i];
        }
        for (int i = 0; i < iArrx.length; i++) {
            System.out.println("[ " + i + " ]" + " = " + iArrCx[i]);
        }
        System.out.println("Todo inteligente con tamaño 10");
        iArrx = new int[10];
        for (int i = 0; i < iArrCx.length; i++) {
            iArrx[i]=iArrCx[i];
        }
        for (int i = 0; i < iArrCx.length; i++) {
            System.out.println("[ " + i + " ]" + " = " + iArrx[i]);
        }
    }

}

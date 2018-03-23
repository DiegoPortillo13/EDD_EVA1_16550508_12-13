/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class ArreglosMultiDim2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] iMatriz = new int[3][];
        System.out.println(iMatriz);
        iMatriz[0]=new int[2];
        System.out.println(iMatriz[0]);
        System.out.println(iMatriz[0][0]);
        iMatriz[1]=new int[5];
        System.out.println(iMatriz[1]);
        System.out.println(iMatriz[1][3]);
        iMatriz[2]=new int[10];
        System.out.println(iMatriz[2]);
        System.out.println(iMatriz[2][6]);
        for (int i = 0; i < iMatriz.length; i++) {//filas
            for (int j = 0; j < iMatriz[i].length; j++) {//columnas
                System.out.println(iMatriz[i][j]);
            }
            
        }
    }
    
}

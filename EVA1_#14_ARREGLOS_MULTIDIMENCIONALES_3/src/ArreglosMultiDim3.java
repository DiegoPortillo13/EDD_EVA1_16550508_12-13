/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class ArreglosMultiDim3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][] i4Dmatriz = new int[2][3][4][5];
        for (int i = 0; i < i4Dmatriz.length; i++) {
            for (int j = 0; j < i4Dmatriz[i].length; j++) {
                for (int k = 0; k < i4Dmatriz[i][j].length; k++) {
                    for (int l = 0; l < i4Dmatriz[i][j][k].length; l++) {
                        i4Dmatriz[i][j][k][l]=(int)(Math.random()*100);
                    }
                }
            }
        }
        for (int i = 0; i < i4Dmatriz.length; i++) {
            for (int j = 0; j < i4Dmatriz[i].length; j++) {
                for (int k = 0; k < i4Dmatriz[i][j].length; k++) {
                    for (int l = 0; l < i4Dmatriz[i][j][k].length; l++) {
                        System.out.println(i4Dmatriz[i][j][k][l]);
                    }
                }
            }
        }
    }
    
}

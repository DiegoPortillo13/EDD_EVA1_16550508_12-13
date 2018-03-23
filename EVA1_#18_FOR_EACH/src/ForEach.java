/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aD={1,2,3,4,5,6,7,8,9,10};
        for (int i : aD) {
            System.out.println("["+i+"]");
        }
        System.out.println("");
        String aC[]={"Diego","Aaron","Portillo","Hdez"};
        for (String string : aC) {
            System.out.println("["+string+"]");
        }
        System.out.println("");
        int aM[][]=new int[3][3];
        aM[0][0]=10;
        aM[0][1]=20;
        aM[0][2]=30;
        aM[1][0]=40;
        aM[1][1]=50;
        aM[1][2]=60;
        aM[2][0]=70;
        aM[2][1]=80;
        aM[2][2]=90;
        for (int[] is : aM) {
            for (int i : is) {
                System.out.println(i);
            }
        }
        System.out.println("");
        int a3D[][][]=new int[2][2][2];
        for (int i = 0; i < a3D.length; i++) {
            for (int j = 0; j < a3D[i].length; j++) {
                for (int k = 0; k < a3D[i][j].length; k++) {
                    a3D[i][j][k]= (int)(Math.random()*5)+1;
                }
            }
        }
        for (int[][] ises : a3D) {
            for (int[] e : ises) {
                for (int i : e) {
                    System.out.println(i);
                }
            }
        }
                
    }
    
}

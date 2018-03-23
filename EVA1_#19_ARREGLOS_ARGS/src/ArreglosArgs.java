/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class ArreglosArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aL[]=new int[5];
        aL[0]=10;
        aL[1]=20;
        aL[2]=30;
        aL[3]=40;
        aL[4]=50;
        ImpArr(aL);
        System.out.println("");
        aL=new int[10];
        aL[0]=10;
        aL[1]=20;
        aL[2]=30;
        aL[3]=40;
        aL[4]=50;
        aL[5]=60;
        aL[6]=70;
        aL[7]=80;
        aL[8]=90;
        aL[9]=100;
        ImpArr(aL);
    }
    public static void ImpArr(int[] aArr){
        for (int i : aArr) {
            System.out.println(i);
        }
    }
}

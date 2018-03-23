
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
public class BuscarArr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aAl=new int[5];
        for (int i = 0; i < aAl.length; i++) {
            aAl[i]=(int)(Math.random()*10)+1;
            System.out.print(aAl[i]+" ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Que valor busca?");
        int iVal = sc.nextInt();
        for (int i = 0; i < aAl.length; i++) {
            if (iVal==aAl[i]) {
                System.out.println("El valor esta en la posicion "+i);
                //detenerlo, Break
                
            }
        }
    }
    
}


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
public class ArreglosMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] aMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] aDias={31,28,31,30,31,30,31,31,30,31,30,31};
        //Equivalente a llenar el arreglo de uno por uno
        //preguntar
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 12");
        int iMes = sc.nextInt();
        if (iMes >= 1 && iMes <= 12) {
            System.out.println("El mes es " + aMeses[iMes - 1]+" y tiene "+aDias[iMes-1]+" dias");
        } else {
            System.out.println("No es un mes");
        }
    }

}

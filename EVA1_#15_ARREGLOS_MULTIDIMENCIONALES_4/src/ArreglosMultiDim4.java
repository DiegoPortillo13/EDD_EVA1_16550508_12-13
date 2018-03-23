
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
public class ArreglosMultiDim4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] aiE;
        int nG, nA;//cantidad de grupos y de allumnos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el # de grupos");
        nG = sc.nextInt();//el numero de grupos
        aiE = new int[nG][];//el numero de filas
        for (int i = 0; i < aiE.length; i++) {
            System.out.println("Cuantos alumnos tiene el grupo " + (i + 1));
            nA = sc.nextInt();
            aiE[i] = new int[nA];//para cada fila es el num de columnas
        }
        for (int j = 0; j < aiE.length; j++) {
            for (int i = 0; i < aiE[j].length; i++) {
                System.out.println("Cual es la edad Grupo " + (j + 1) + " - Alumno " + (i + 1) + " ?");
                aiE[j][i] = sc.nextInt();
            }
        }
        /*for (int j = 0; j < aiE.length; j++) {  // imprime las edades de cada alumno (por el momento no se cesesita)
            for (int i = 0; i < aiE[j].length; i++) {
                System.out.println(" La edad Grupo " + (j + 1) + " - Alumno " + (i + 1) + " es " + aiE[j][i]);
            }
        }*/
        int iAcum, AcumT = 0, AcumNA = 0;
        for (int j = 0; j < aiE.length; j++) {
            iAcum = 0;
            AcumNA = AcumNA + aiE[j].length;
            for (int i = 0; i < aiE[j].length; i++) {
                iAcum = iAcum + aiE[j][i];//sumatoria de las edades
                AcumT = AcumT + aiE[j][i];
            }
            System.out.println("El promedio para el grupo " + (j + 1) + " = " + (iAcum / aiE[j].length));
        }
        
        
        System.out.println("El promedio de todos los alumnos es " + (AcumT / AcumNA));
        int moda=0, mvr=0;
        for (int i = 0; i < aiE.length; i++) {
            for (int j = 0; j < aiE[i].length; j++) {
                int vr=0;
                for (int k = 0; k < aiE.length; k++) {
                    for (int l = 0; l < aiE[k].length; l++) {
                        if(aiE[i][j]==aiE[k][l]){
                            vr++;
                        }
                       
                    }
                     if (vr>mvr) {
                           moda=aiE[i][j];
                           mvr=vr;
                        }
                }
            }System.out.println("La moda es "+moda+" y se repite "+mvr+" veces del grupo "+(i+1));
        }
    }

}

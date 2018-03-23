/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class ArreglosMultiDim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Matriz --> Arreglo de dos dimeciones
        int[][] iMatriz = new int[3][3];//arreglo de 3 filas x 3 columnas
        System.out.println(iMatriz);
        iMatriz[0][0]=10;
        iMatriz[0][1]=20;
        iMatriz[0][2]=30;
        iMatriz[1][0]=40;
        iMatriz[1][1]=50;
        iMatriz[1][2]=60;
        iMatriz[2][0]=70;
        iMatriz[2][1]=80;
        iMatriz[2][2]=90;
        System.out.println(iMatriz[0]);
        System.out.println(iMatriz[1]);
        System.out.println(iMatriz[2]);
        //Para recorrer un arreglo MultiD necesitamos un ciclo
        //para cada dimencion los estan anidando
        for (int i = 0; i < iMatriz.length; i++) {//para las filas
            for (int j = 0; j < iMatriz[i].length; j++) {//para las columnas
                System.out.print("[ "+iMatriz[i][j]+" ]");
            }System.out.println("");
        }
    }
    
}

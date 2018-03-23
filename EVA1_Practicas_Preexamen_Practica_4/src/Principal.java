
import java.text.DecimalFormat;


public class Principal {
    /*
    CREAR DOS MATRICES DE 5 X 5, LLENAR CON NÚMERO ALEATORIOS (DOUBLES) ENTRE 1
Y 10, CREAR UNA MATRIZ DE 5 X 5 DONDE ALMACENE LOS RESULTADOS DE
MULTIPLICAR CADA POSICIÓN DE LAS MATRICES
    
    */
    
    public static void main(String[] args) {
        double[][] MatA, MatB;
        MatA = new double[5][5];
        MatB = new double[5][5];
        System.out.println("Matriz número 1");
        for (int i = 0; i < MatA.length; i++) {
            for (int j = 0; j < MatA[i].length; j++) {
                MatA[i][j] = (Math.random()*10)+1;
            }
        }
        imprimir(MatA);
        System.out.println("Matriz número 2");
        for (int i = 0; i < MatB.length; i++) {
            for (int j = 0; j < MatB[i].length; j++) {
                MatB[i][j] = (Math.random()*10)+1;
            }
        }
        imprimir(MatB);
        double MatAB[][];
        MatAB= new double[5][5];
        for (int i = 0; i < MatAB.length; i++) {
            for (int j = 0; j < MatAB[i].length; j++) {
                MatAB[i][j]= ((MatA[i][j])*(MatB[i][j]));
            }
        }
        System.out.println("Matriz 1 * Matriz 2");
        imprimir(MatAB);
        
        System.out.println(MatA);//direcciones distintas; matrices independientes
        System.out.println(MatB);
        System.out.println(MatAB);
        
    }
    public static void  imprimir(double[][] matriz){
        for (double[] ds : matriz) {
            DecimalFormat df = new DecimalFormat("###.00");
            for (double d : ds) {
                System.out.print("["+df.format(d)+"]"+"\t");
            }System.out.println("");
        }
    }
    
}


import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        int[][] iEdades;
        int iNoGrp, iNoAlu;//Cantidad ee grupos y alumnos
        Scanner scCaptu = new Scanner(System.in);
        
        System.out.println("Introduce el numero de grupos: ");
        iNoGrp = scCaptu.nextInt();// El numero de grupos son las filas del arreglo
        iEdades = new int[iNoGrp][];
        
        for (int i = 0; i < iEdades.length; i++) {
            System.out.println("Cuantos Alumnos tiene el Grupo "+ (i+1) + ":");
            iNoAlu = scCaptu.nextInt();
            iEdades[i] = new int [iNoAlu]; //Para cada fila definen # de columnas
            
        }
        
        
        //Captura de las edades:
        for (int i = 0; i < iEdades.length; i++) {//Filas
            for (int j = 0; j < iEdades[i].length; j++) {
                System.out.println("Cual es la edad grupo " +(i+1) + " Alumno "+(j+1)+"?");
                iEdades[i][j] = scCaptu.nextInt();
            }
        }
        //Imprimir las edades Capturadas
        for (int i = 0; i < iEdades.length; i++) {//Filas
            for (int j = 0; j < iEdades[i].length; j++) {
                System.out.println("La edad  de grupo " +(i+1) + " Alumno " +(j+1) +  " es: "+ iEdades[i][j]);
            }
        }
        //Calcular el prom de edades
        double iAcum, iAcumTodos=0, iAcumAlum=0;
        for (int i = 0; i < iEdades.length; i++) {//Filas
            iAcum = 0;
            iAcumAlum= iAcumTodos +iEdades[i].length;
            for (int j = 0; j < iEdades[i].length; j++) {
               iAcum = iAcum + iEdades[i][j];
               iAcumTodos = iAcumTodos + iEdades[i][j];
               
            }
            System.out.println("El promedio del grupo "+ (i+1) + "="+ (iAcum/iEdades[i].length));
        }
        System.out.println("El promedio general es: "+ (iAcumTodos/iAcumAlum));
        //Moda; valor que mas se repite 15265413 moda = 5
        //Desviacion estandar; medida de disperción, r= raiz de (Sumatoria(Xi-m)^2)/n-1
        int moda=0,mvr=0;
        for (int i = 0; i < iEdades.length; i++) {
            for (int j = 0; j < iEdades[i].length; j++) {
                int valRe=0;
                
                
                for (int k = 0; k < iEdades.length; k++) {
                    for (int l = 0; l < iEdades[k].length; l++) {
                        if(iEdades[i][j]==iEdades[k][l])
                            valRe++;
                    }
                if(valRe>mvr){
                    moda = iEdades[i][j];
                    mvr=valRe;
                    
                }
                    
                    
                }
            }
        }
        System.out.println("La moda es: " + moda + " y se repite: "+ mvr);
        double  vari=0, varie, varieB;
        for (int i = 0; i < iEdades.length; i++) {
            for (int j = 0; j < iEdades[i].length; j++) {
                vari= (iEdades[i][j]+iEdades[i][j])-(iAcumTodos/iAcumAlum);
                varie = vari/iEdades[i].length-2;
                varieB =(int)(Math.sqrt(varie));
                System.out.println("La desviacion estandar es: " + varieB);
            }
        }
        
        
        
    }
    
}


public class Principal {

    
    
    
    
    public static void main(String[] args) {
        int aMat[][] = new int[5][5];
        int aMatB[][] = new int[5][5];
        for (int i = 0; i < aMat.length; i++) {
            for (int j = 0; j < aMat[i].length; j++) {
                aMat[i][j]= (int)(Math.random()*100);
            }
        }
        imprimir(aMat);
        System.out.println("Copia inversa");
        /*for (int i = 0; i < aMatB.length; i++) {
            for (int j = 0; j < aMatB[i].length; j++) {
                aMatB[i][j] = aMat[i][j];
            }
        }*/
        //Copia inversa de la matriz aMat
        for (int i = 0, j = aMat.length-1; i < aMatB.length; i++,j--) {//iniciar 2 variables:}
            //una que inicie desde 0 y tome como limite el tamaño del primer arreglo
            //la otra inicia desde el tamaño del arreglo copia, se le resta 1 porque el limite real es 4, no 5 y va decreciendo hasta 0
            for (int k = 0,l=aMat[i].length-1; k < aMatB[i].length; k++,l--) {//Aplicamos la misma logica que en el for anterior
                aMatB[i][k]=aMat[j][l];
            }
        }
        imprimir(aMatB);
    
        
    }
    
    
    

        
    public static void imprimir(int[][] arr){
        for (int[] is : arr) {
            for (int i : is) {
                System.out.print("["+i+"]"+"\t");
            }System.out.println("");
        }
    }
    

    
    
    
}

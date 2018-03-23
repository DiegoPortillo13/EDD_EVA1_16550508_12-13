

/**
 *
 * @author Ariel
 */
public class Principal {

    
    public static void main(String[] args) {
        int[] arr = new int [50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100)+1;
        }
        for (int i : arr) {
            System.out.println("["+ i +"]");
        }
        int par=0,impar=0;

        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%2==0)){
                par++;}else{
                impar++;
            }
            
             
            
        }
        
        System.out.println("Cantidad de números pares: " + par);
        System.out.println("Cantidad de impares: " + impar);
        //punto de quiebre
        int arrP[] = new int [par];
        int arrIm[] = new int [impar];
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            
                if((arr[i]%2==0)){
                arrP[c]= arr[i];
                c++;
            }
            
            
            
        }int p=0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%2!=0)){
                arrIm[p]=arr[i];
                p++;
                
            }
        }
        
        
        System.out.println("Arreglo de pares");
        imp(arrP);
        System.out.println("Arreglo de impares");
        imp(arrIm);
    }
    public static void imp(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
}



/**
 *
 * @author Ariel
 */
public class Principal {

    
    public static void main(String[] args) {
        int[] arr = new int [50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        for (int i : arr) {
            System.out.println("["+ i + "]");
        }
        int par=0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]%2==0))
                par++;
            
        }
        System.out.println("Cantidad de números pares: " + par);
        
    }
    
}



/**
 *
 * @author Ariel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] megaArr = new int [100][100];
        for (int i = 0; i < megaArr.length; i++) {
            for (int j = 0; j < megaArr[i].length; j++) {
                if(j==i)
                    megaArr[i][j] = 1;
                
            }
        }
        
        for (int[] is : megaArr) {
            for (int i : is) {
                System.out.print("["+i+"]");
            }System.out.println("");
        }
    }
    
}

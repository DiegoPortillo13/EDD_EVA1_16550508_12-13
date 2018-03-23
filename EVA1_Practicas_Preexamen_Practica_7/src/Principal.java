
/**
 *
 * @author Ariel
 */
public class Principal {

    
    public static void main(String[] args) {
        int Arre[] = new int[50];
        for (int i = 0; i < Arre.length; i++) {
            Arre[i]= (int)(Math.random()*100);
        }
        int Mayor=Arre[0], Menor=Arre[0],posMa=Arre[0], posMe=Arre[0];
        for (int i = 0; i < Arre.length; i++) {
            
            if(Arre[i]>Mayor){
                Mayor=Arre[i];
                posMa = i;
            }else{
                if(Arre[i]<Menor){
                    Menor=Arre[i];
                    posMe = i;
                }
            }
        }
        for (int i : Arre) {
            System.out.println(i);
            
            
        }
        System.out.println("El número mayor es: "+ Mayor + " y su posicion es: "+ posMa);
        System.out.println("El número menor es: "+ Menor + " y su posicion es: "+ posMe);
    }
    
}

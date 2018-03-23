/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Memoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Memoria mObj = new Memoria();
        //para des hacer la memoria de un obj
        mObj = null;//liberamos memoria 
        //todo obj en memoria que no es referenciado a el 
        //programa es eliminada por el garbage collector
        Memoria mObj2 = new Memoria();
        Memoria mObjCop = mObj2;//no duplicamos el obj si no la direccion 
        mObj2 = null;//no se elminima por q copia sigue apuntando 
        mObjCop = null;//Ahora si se elimina no quedan mas referencias
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class MemoriaObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iOtroVal=10;
        double dSalario=500.20;
        Prueba pObj=new Prueba();
        System.out.println("OtroVal "+ iOtroVal);
        System.out.println("Salario "+ dSalario);
        System.out.println("Obj "+ pObj);//IMPRIME LA DIRECCION DEL OBJETO
        System.out.println("Val de obj "+ pObj.iVal);
    }
    
}
class Prueba{
    int iVal = 5;
}
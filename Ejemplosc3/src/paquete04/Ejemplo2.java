/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}}; //
        double[][] mensaje = new double[2][3] ;
        double valor;
        
        /*
            1   4   3
            36  64  9
        */
        for (int i = 0; i < dato1.length; i++) {
            valor = 0;
            for (int j = 0; j < dato1[i].length; j++) {
                if (dato1[i][j]%2 == 0){
                    valor = dato1[i][j] * dato1[i][j];
                mensaje[i][j] = valor;
                
            }else{
                valor = dato1[i][j];
                mensaje[i][j] = valor;
                }}
            
    }
        for (int i = 0; i < dato1.length; i++) {
            
            for (int j = 0; j < dato1[i].length; j++) {
                System.out.printf("%.0f\t",mensaje[i][j]);
            }
            System.out.println();
                }
    //Roberto Bustamante 
}
}

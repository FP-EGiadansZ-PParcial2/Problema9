/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg5;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=getNumero(); //variable y metodo para obtener el numero 
        verifica(n); //verificamos y mostramos si el numero es primo o no
    }
    public static int getNumero(){ //pedimos el numero por teclado
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un numero");
        num=teclado.nextInt();
        return num;
    }
    public static void verifica(int num){ //verificaremos si es primo o no
        if (num!=2&&num%2==0||num==1){/*si el numero no es dos y si residuo al 
            dividirse entre 2 es 0, no es primo; el numero 1 no es primo*/
            System.out.println("El numero no es primo");
        }
            else{
            System.out.println("El numero es primo");
        }
        
    
    
    }
}

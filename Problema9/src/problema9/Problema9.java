/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=getNumer(); //variable y metodo para obtener un numero de 4 cifras
        String t=convText(n); //convertimos ese numero a cadena para poder trabajar
        results(t); //asignamos el valor por posicion de cada cifra y lo mostramos
    }
    public static int getNumer(){ //pedimos el numero por teclado
        int numer;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un numero de CUATRO cifras");
        numer=teclado.nextInt();
        return numer;
    }
    public static String convText(int numer){ //convertimos el numero a cadena de caracteres
        String tex="";
        tex=tex+numer;
        return tex;
    }
    public static void results(String tex){ /*hacemos que la cadena anterior se 
        vuelva un arreglo de caracteres */
        char word []; 
        String a,b,c,d; 
        word=tex.toCharArray(); 
            a=word[0]+"000"; 
            b=word[1]+"00";  
            c=word[2]+"0";   
            d=word[3]+"";    
        
        System.out.print("El numero "+tex+" se descompone en: "+ a + "+" + b + "+" + c + "+" + d);
    }
    
}

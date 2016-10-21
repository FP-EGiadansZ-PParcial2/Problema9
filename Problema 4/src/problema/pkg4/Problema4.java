/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c=getCelsius(); //variable y metodo para pedir la temp en C
        double f=convFahre(c); //variable y metodo para convertir C a F
        result(f); //muestra el resultado de la conversion
    }
    public static double getCelsius(){ //obtenemos dato por teclado
        double celsius;    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una temperatura en grados Celsius");
        celsius=teclado.nextDouble();
        return celsius;
    }
    public static double convFahre(double celsius){ 
        double fahrenheit; //declaramos nueva variable para depositar la conversion
        fahrenheit=(celsius*1.8+32); //factor de conversion
        return fahrenheit; 
    }
    public static void result(double fahrenheit){ //mostramos el resultado
        System.out.println("En grados Fahrenheit, la temperatura dada es: "+ fahrenheit+" °F.");
    }
}

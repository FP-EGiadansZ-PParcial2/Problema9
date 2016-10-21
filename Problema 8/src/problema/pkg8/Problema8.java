/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg8;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c1,c2; //declaracion de variables
        c1=getCateto("1"); //obtenemos el cateto 1
        c2=getCateto("2"); //obtenemos el cateto 2
        calcuHipo(c1,c2); //metodo del calculo de la hipotenusa y la muestra
    }
    public static double getCateto(String d){ //metodo para pedir cateto por teclado
        double cateto;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la medida del cateto "+d);
        cateto=teclado.nextDouble();
        return cateto;
    }
    public static void calcuHipo(double cateto1,double cateto2){ //pedimos ambos catetos previamente guardados
        double hipo;
        if (cateto1<=0||cateto2<=0) { //si cateto 1 o cateto 2 son menores o iguales a cero muestra un error
                System.out.println("Error, la proxima vez estudie trigonometria antes de usar este programa");
        }
        else{
        hipo=Math.sqrt((Math.pow(cateto1,2))+(Math.pow(cateto2,2))); //sino, calcula la hipotenusa por su formula
        System.out.println("La hipotenusa vale: "+hipo);} //mostramos el valor de la hipotenusa
    }
}

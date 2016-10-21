/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg7;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v=getVeloz(); //variable y metodo para obtener la velocidad en km/h
        double nv=convers(v); //variable y metodo para convertir a m/s 
        result(nv); //muestra resultado
        
    }
    public static double getVeloz(){ //pedimos velocidad por teclado
        double veloc;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el valor de la velocidad en km/hr");
        veloc=teclado.nextDouble();
        return veloc;
    }
    public static double convers(double veloc){ //convertimos velocidad a m/s
        double naVeloc=(veloc*1000/3600);
        return naVeloc;
    }
    public static void result(double naVeloc){ //mostramos el resultado de la conversion
        System.out.println("La velocidad en m/s es: "+naVeloc);
    }
}

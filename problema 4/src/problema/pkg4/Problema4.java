/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg4;

import java.util.Scanner;

/**
 *
 * @author Les
 */
public class Problema4 {
private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vInicial;
        int expo;
        int elevacion;
        float grav;
        grav = (float) 9.81;
        int altMax;
        int distancia;
        
        System.out.println("Altura y distancia de un objeto disparado con un cañón, el cual tiene un ángulo de 45");
       
        System.out.println("Teclee la velocidad inicial en m/s");
        vInicial = input.nextInt();
        System.out.println("Ingrese el exponente cuadrado");
        expo = input.nextInt();
        elevacion = (int) Math.pow(vInicial, expo);
        System.out.println(vInicial + " elevado a la " + expo + " es igual a " + elevacion);
        
        altMax = (int) ((elevacion * 0.5) / (2 * grav));//la formula es veloc inicial al 2 * sen del angulo al 2 / 2 * grav
        
        distancia = (int) ((elevacion * 1) / grav); //la formula es la veloc inicial al 2 * sen2angulo / gravedad
        
        
      System.out.println("La altura maxima alcanzada por el objeto es de: " + altMax + " metros");
      System.out.println("La distancia alcanzada por el objeto es de: " + distancia + " m/s ");
      
    }
    
}

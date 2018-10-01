/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg1.pkg10;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Problema110 {
  
    private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        System.out.println("Teclea los grados en Fahrenheit que deseas convetir a Centigrados");
        int gFahr;
        gFahr = input.nextInt();
        int gCent;
        gCent = (int) (gFahr - 32 / 1.8);
        System.out.print("Los grados Centigrados que solicitaste son: " + gCent);
       
        System.out.println("Teclea los grados en Fahrenheit que deseas convertir a Kelvin");
        int gFahre;
        gFahre = input.nextInt();
        int gKel;
        gKel = (int) ((gFahre + 459.67) / 1.8);
        System.out.print("Los grados Kelvin que solicitaste son: " + gKel);

    }
}

    


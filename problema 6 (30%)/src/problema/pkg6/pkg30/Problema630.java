/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg6.pkg30;

import java.util.Scanner;

/**
 *
 * @author Les
 */
public class Problema630 {
private static Scanner input = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y2;
        int y1;
        int x2;
        int x1;
        int pend;
        int area;
        
      System.out.println("Teclea el valor de y2");
      y2 = input.nextInt();
      System.out.println("Teclea el valor de y1");
      y1 = input.nextInt();
      System.out.println("Teclea el valor de x2");
      x2 = input.nextInt();
      System.out.println("Teclea el valor de x1");
      x1 = input.nextInt();
       
      pend = ((y2 - y1) / (x2-x1));
      area = ((x2-x1) * (y2-y1));
      
      System.out.println("La pendiente es: " + pend + "Y el area es: " + area);
   
    }
    
}

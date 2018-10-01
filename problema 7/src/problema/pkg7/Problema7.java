/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg7;
import java.util.*;
/**
 *
 * @author Les
 */
public class Problema7 {
private Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
              System.out.println("Las Cordenadas del Centro son:");
              double H = 0;
             
              double K = 0;   
            
            System.out.println("Su Semi Eje Transverso");
             double A = 0;
        
        System.out.println("Su Semi Eje Conjugado"); 
         double B = 0;
    
        double C;
        C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
         double sVertice;
        sVertice = H + A;
        double sVertice2;
        sVertice2 = H - A;
        double sFoco;
        sFoco = H + C;
         double sFoco2;
         sFoco2 = H - C;
         double sDistancia;
         sDistancia = sFoco - H;

     System.out.println("Los Vertices estan en "+sVertice2+","+K+" y "+sVertice+","+K);
   System.out.println("Los Vertices estan en "+sFoco2+","+ K+" y "+sFoco+","+K);
 System.out.println("La Distancia del Centro al Foco es: "+sDistancia);

                 
      }
    
}

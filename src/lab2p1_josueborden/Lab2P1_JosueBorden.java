/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_josueborden;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Lab2P1_JosueBorden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int ejercicio = 0;
        
        while(true){
            System.out.println("Ingrese el numero del ejercicio:   (1/2/3) \n4 para salir");
            ejercicio = lea.nextInt();
            
            if(ejercicio == 1){
                //suma de pares o impares
                int num = 0;
                System.out.println("Ingrese el numero:");
                num = lea.nextInt();
                int decision = 0;
                System.out.println("Desea sumar los digitos pares (1) o impares(2):");
                decision = lea.nextInt();
                if(decision == 1){
                    
                }
                    
                
                
            }
                
            
            
        }
    }
    
}

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
                int residuo = 0;
                int sumaimpar = 0;
                int sumapar = 0;
                int residuo2 = 0;
                System.out.println("Desea sumar los digitos pares (1) o impares(2):");
                decision = lea.nextInt();
                while(num > 0){
                    residuo = num % 10;
                    num = num / 10;
                    residuo2 = residuo % 2;
                    if(residuo2 == 0){
                        sumapar = sumapar + residuo;
                    }
                    else{
                        sumaimpar = sumaimpar + residuo;
                    }
                }
                if(decision == 1){
                    System.out.println("La suma de los numeros pares es: " + sumapar);
                }
                else{
                    System.out.println("La suma de los numeros impares es:" + sumaimpar);
                }
                  
            } 
            
            else if(ejercicio == 2){
                int num = 0;
                System.out.println("Ingrese un numero:");
                num = lea.nextInt();
                
            }
            
            else if(ejercicio == 3){
                int num = 0;
                while(num < 999999999){
                    System.out.println("Ingrese un numero de 10 caracteres:");
                    num = lea.nextInt();
                } 
                System.out.println("num es valido");
            }
        }
    }
}

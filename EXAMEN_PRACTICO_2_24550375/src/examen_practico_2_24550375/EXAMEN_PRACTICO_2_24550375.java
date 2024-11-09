/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_practico_2_24550375;

import java.util.Scanner;

/**
 *
 * @author EdiX
 */
public class EXAMEN_PRACTICO_2_24550375 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Opcio, Pied = 1, Pap = 2, Tij = 3;
        double Compu;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.println("Escribe del 1 al 3, Piedra = 1, Papel = 2 o Tijera = 3? (Escribe 4 si quieres salir):");
        Opcio = captu.nextInt();
        if(Opcio == 1){
            System.out.println("Escogiste Piedra");
        }else if(Opcio == 2){
            System.out.println("Escogiste Papel");
        }else if (Opcio == 3){
            System.out.println("Escogiste Tijera");
        }else{
            System.out.println("Elije un numero del 1 al 3 (4 si quieres salir)");
        }
        Compu = Math.random()*10;
        if(Compu >= 1 && Compu <= 3){
            System.out.println("Piedra");
        }else if(Compu >= 3 && Compu <= 7){
            System.out.println("Papel");
        }else if(Compu >= 7 && Compu <= 10){
            System.out.println("Tijera");
        }else{
            System.out.println(" ");
        }
        if(Compu >= 1 && Compu <= 3 && Opcio == 1){
        }
    }while (Opcio != 4);
        System.out.println(Opcio);
    }
    
}

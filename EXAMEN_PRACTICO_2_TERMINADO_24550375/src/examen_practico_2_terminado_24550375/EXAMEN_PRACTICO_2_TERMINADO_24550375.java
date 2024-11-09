/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_practico_2_terminado_24550375;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EXAMEN_PRACTICO_2_TERMINADO_24550375 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int Opcio, Gcpu = 0, Guser = 0;
        double Compu;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.println("Escribe del 1 al 3, Piedra = 1, Papel = 2 o Tijera = 3? (Escribe 4 si quieres salir):");
        Opcio = captu.nextInt();
        switch(Opcio){
            case 1:
                System.out.println("Escogiste piedra");
                break;
            case 2:
                System.out.println("Escogiste papel");
                break;
            case 3:
                System.out.println("Escogiste tijera");
                break;
            default:
                System.out.println("Elije un numero del 1 al 3 (Elige 4 para salir)");
        }
        Compu = Math.random()*10;
        Math.floor(Compu);
        if(Compu >= 0 && Compu <= 3){
            System.out.println("CPU escogio: Piedra");
        }else if(Compu >= 3 && Compu <= 7){
            System.out.println("CPU escogio: Papel");
        }else if(Compu >= 7 && Compu <= 10){
            System.out.println("CPU escogio: Tijera");
        }else{
            System.out.println("");
        }
        if(Compu >= 0 && Compu <= 3 && Opcio == 1){
            System.out.println("Empate");
        }else if (Compu >= 3 && Compu <= 7 && Opcio == 2){
            System.out.println("Empate");
        }else if (Compu >= 7 && Compu <= 10 && Opcio == 3){
            System.out.println("Empate");
        }else if (Compu >= 0 && Compu <= 3 && Opcio == 3){
            System.out.println("Ganador CPU");
            Gcpu = Gcpu + 1;
            System.out.println("CPU: "+Gcpu);
        }else if (Compu >= 0 && Compu <= 3 && Opcio == 2){
            System.out.println("Ganador Usuario");
            Guser = Guser + 1;
            System.out.println("Usuario: "+Guser);
        }else if (Compu >= 3 && Compu <= 7 && Opcio == 1){
            System.out.println("Ganador CPU");
            Gcpu = Gcpu + 1;
            System.out.println("CPU: "+Gcpu);
        }else if (Compu >= 3 && Compu <= 7 && Opcio == 3){
            System.out.println("Ganador Usuario");
            Guser = Guser + 1;
            System.out.println("Usuario: "+Guser);
        }else if (Compu >= 7 && Compu <= 10 && Opcio == 2){
            System.out.println("Ganador CPU");
            Gcpu = Gcpu + 1;
            System.out.println("CPU: "+Gcpu);
        }else if (Compu >= 7 && Compu <= 10 && Opcio == 1){
            System.out.println("Ganador Usuario");
            Guser = Guser + 1;
            System.out.println("Usuario: "+Guser);
        }
    }while (Opcio != 4);
        System.out.println("-------------------------------------");
        System.out.println("CPU: "+Gcpu);
        System.out.println("Usuario: "+Guser);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_suich;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_20_SUICH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
         Scanner captu = new Scanner(System.in);
         System.out.println("Numero corresponda al dia (1-7)");
         dia = captu.nextInt();
         switch (dia){
             case 1:
             System.out.println("Lunes");
             break;// ultima isntruccion - FIN DEL CASO
             case 2:
             System.out.println("Martes");
             break;
             case 3:
             System.out.println("MIercoles");
             break;
             case 4:
             System.out.println("Jueves");
             break;
             case 5:
             System.out.println("Viernes");
             break;
             case 6:
             System.out.println("Sabado");
             break;
             case 7:
             System.out.println("Domingo");
             break;
             default:
                   System.out.println("Dia invalido (Deben ser de l-7)");
         }
    }
    
}

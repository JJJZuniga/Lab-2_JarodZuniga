
package lab.pkg2_jarodzuniga;

import java.util.Random;
import java.util.Scanner;


public class Lab2_JarodZuniga {

    static Scanner sc=new Scanner(System.in);
    static Random rn=new Random();
    public static void main(String[] args) {
        int opcion=0;
        while (opcion!=6){
        System.out.println("Bienvenido a juego codest");
        System.out.println("|---------------------*MENU*----------------------|");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|1. Crear personaje                               |");
        System.out.println("|2. Modificar Personaje                           |");
        System.out.println("|3. Ver atributos de un personaje                 |");
        System.out.println("|4. Eliminar personaje                            |");
        System.out.println("|5. Combate                                       |");
        System.out.println("|6. Salir                                         |");
        System.out.println("|-------------------------------------------------|");
        opcion = sc.nextInt();
        
        }
    }
    
}

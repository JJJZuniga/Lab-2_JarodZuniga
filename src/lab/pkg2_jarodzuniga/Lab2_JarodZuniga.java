
package lab.pkg2_jarodzuniga;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Lab2_JarodZuniga {

    static Scanner sc=new Scanner(System.in);
    static Random rn=new Random();
    public static void main(String[] args) {
        int opcion=0;
        ArrayList<Personajes> personajes=new ArrayList();
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
            switch (opcion) {
                case 1:
                    System.out.println("1. Clerigo \n 2. Barbaro \n 3. Mago \n 4. Picaro");
                    int personaje=sc.nextInt();
                    switch (personaje) {
                        case 1:
                            break;
                        default:
                            System.out.println("la opcion es invalida");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
    
}

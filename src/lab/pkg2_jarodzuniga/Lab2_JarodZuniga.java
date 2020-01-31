
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
        personajes.add(new Personajes( "Clerigo", "Destructor de mundos","Mediano",3.59,500,480,"Muy mamado","Norfair",60,97,40,12));
        personajes.add(new Personajes( "Picaro", "El bryan","Elfo",1.59,130,180,"Dame el celular","Crateria",65,80,50,19));
        personajes.add(new Personajes( "Barbaro", "Maximus","Humano",1.79,180,80,"Agil","Zebes",60,97,40,12));
        personajes.add(new Personajes( "MAgo", "Le fuegores","Mediano",1.90,130,10000,"Sabiduria maxima","Brinstar",60,97,40,19));
        int i=4;
        while (opcion!=6){
            System.out.println("");
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
                    String tipo="";
                    int cs=0,ac=0,dg=0;
                    switch (personaje) {
                        case 1:
                            tipo="Clerigo";
                            cs=97;
                            ac=40;
                            dg=5+rn.nextInt(15);
                            break;
                        case 2:
                            tipo="Barbaro";
                            cs=97;
                            ac=40;
                            dg=5+rn.nextInt(15);
                            break;
                        case 3:
                            tipo="Mago";
                            cs=97;
                            ac=40;
                            dg=5+rn.nextInt(15);
                            break;
                        case 4:
                            tipo="Picaro";
                            cs=97;
                            ac=40;
                            dg=5+rn.nextInt(15);
                            break;
                        default:
                            System.out.println("la opcion es invalida");
                    }
                    System.out.println("Ingrese un nombre para su personaje");
                    String nombre = sc.nextLine();
                    nombre = sc.nextLine();
                    System.out.println("Ingrese la raza");
                    System.out.println("1. Mediano \n 2. Elfo \n 3. Enano\n 4. Humano");
                    int ra=sc.nextInt();
                    String raza="";
                    int hp=0;
                    switch (ra) {
                        case 1:
                            raza="Mediano";
                            hp=50 + rn.nextInt(60);
                            break;
                        case 2:
                            raza="Elfo";
                            hp=50 + rn.nextInt(70);
                            break;
                        case 3:
                            hp=80 + rn.nextInt(100);
                            raza="Enano";
                            break;
                        case 4:
                            hp=40 + rn.nextInt(75);
                            raza="Humano";
                            break;
                        default:
                            System.out.println("Seleccion invalida");
                    }
                    System.out.println("Ingrese la estatura");
                    double esta=sc.nextDouble();
                    System.out.println("Ingrese el peso");
                    double peso=sc.nextDouble();
                    System.out.println("Ingrese edad");
                    int edad=sc.nextInt();
                    System.out.println("Ingrese descripcion");
                    String des=sc.nextLine();
                    System.out.println("Seleccione nacionalidad");
                    System.out.println("1.Norfair \n 2.Brinstar \n  3.Maridia\n 4.Zebes\n 5.Crateria");
                    int nac=sc.nextInt();
                    String nacionalidad="";
                    switch (nac) {
                        case 1:
                            nacionalidad="Norfair";
                            break;
                        case 2:
                            nacionalidad="Brinstar";
                            break;
                        case 3:
                            nacionalidad="Maridia";
                            break;
                        case 4:
                            nacionalidad="Zebes";
                            break;
                        case 5:
                            nacionalidad="Crateria";
                            break;
                        default:
                            System.out.println("Nacionalidad no valida");
                    }
                    personajes.add(new Personajes( tipo, nombre,raza,esta,peso,edad,des,nacionalidad,hp,cs,ac,dg));

                        System.out.println(personajes.get(i));
                        i++;
                    break;
                    
                case 2:
                    for (Personajes o : personajes) {
                        System.out.println(o);
                    }
                    System.out.println("");
                    System.out.println("Que personaje desea modificar");
                    int mod=sc.nextInt();
                    System.out.println("");
                    System.out.println(mod-1);
                   System.out.println("Que dese modificar 1.tipo, 2.nombre,3.raza,4.esta,5.peso,6.edad,7.des,8.nacionalidad");
                    break;
                case 3:
                     for (Personajes o : personajes) {
                        System.out.println(o);
                    }
                    break;
                case 4:
                     int s=0;
                    for (Personajes o : personajes) {
                        System.out.println((s+1)+""+o);
                        s++;
                    }
                    System.out.println("Ingrese que personaje desea eliminar");
                    int el=sc.nextInt();
                    personajes.remove(el);
                    
                    break;
                case 5:
                   
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa");
                    opcion=6;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
    
}

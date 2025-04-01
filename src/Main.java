import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;



public class Main {

    public static Scanner scanner=new Scanner(System.in);

    public static void Addition(){
        float a,b;
        System.out.print("entrer a : ");
        a=scanner.nextFloat();
        System.out.print("entrer b : ");
        b=scanner.nextFloat();
        System.out.println(" la somme de a + b = " +(a+b) );
    }

    public static void Soutraction(){
        float a,b;
        System.out.print("entrer a : ");
        a=scanner.nextFloat();
        System.out.print("entrer b : ");
        b=scanner.nextFloat();
        System.out.println(" le resultat de a - b = " +(a-b) );
    }

    public static void Multiplication(){
        float a,b;
        System.out.print("entrer a : ");
        a=scanner.nextFloat();
        System.out.print("entrer b : ");
        b=scanner.nextFloat();
        System.out.println(" le resultat de a * b = " +(a*b) );
    }

    public static void Division(){
        float a,b;
        System.out.print("entrer a : ");
        a=scanner.nextFloat();
        System.out.print("entrer b : ");
        b=scanner.nextFloat();
        if(b==0){
            System.out.println("la division sur 0 est impossible dans R");
            do {
                System.out.println("entrer nouveau b : ");
                b=scanner.nextFloat();
            }while(b==0);
            System.out.println("le resultat de a / b = "+(a/b));


        }else {
            System.out.println("le resultat de a / b = "+(a/b));

        }
    }

    public static void main(String[] args) {

        int choix;

        System.out.println("Hello and welcome!");

        do{
            System.out.println("------MENU-------\n 1-ADDITION : \n 2-SOUSTRACTION : \n 3-MULTIPLICATION : \n 4-DIVISION : \n 5-PUISSANCE : \n 6-RACINE CARREE : \n 7-FACTORIELLE : \n 8-QUITTER");
            System.out.print("-----ENTRER VOTRE CHOIX : ");
            choix=scanner.nextInt();

            switch(choix){
                case 1 :
                    Addition();
                    break;
                case 2 :
                    Soutraction();
                    break;
                case 3 :
                    Multiplication();
                    break;
                case 4 :
                    Division();
                    break;
                case 5 :
                    break;
                case 6 :
                    break ;
                case 7 :
                    break ;
                case 8 :
                    System.out.println("AU REVOIR ET MERCI ");
                    break;
                default:
                    System.out.println("CHOIX INTROUVABLE ,RESSAYER !!");
            }
        }while (choix!=8);

    }
}
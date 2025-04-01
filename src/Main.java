import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;



public class Main {

    static float a,b;

    public static Scanner scanner=new Scanner(System.in);

    public static void Addition(){

        System.out.print("entrer a : ");
        a=scanner.nextFloat();
        System.out.print("entrer b : ");
        b=scanner.nextFloat();
        System.out.println(" la somme de a + b = " +(a+b) );
    }

    public static void Soutraction(){

        System.out.print("entrer a : ");
        a=scanner.nextFloat();
        System.out.print("entrer b : ");
        b=scanner.nextFloat();
        System.out.println(" le resultat de a - b = " +(a-b) );
    }

    public static void Multiplication(){

        System.out.print("entrer a : ");
        a=scanner.nextFloat();
        System.out.print("entrer b : ");
        b=scanner.nextFloat();
        System.out.println(" le resultat de a * b = " +(a*b) );
    }

    public static void Division(){

        System.out.print("entrer divident : ");
        a=scanner.nextFloat();
        System.out.print("entrer diviseur : ");
        b=scanner.nextFloat();
        if(b==0){
            System.out.println("la division sur 0 est impossible dans R");
            do {
                System.out.println("entrer nouveau diviseur : ");
                b=scanner.nextFloat();
            }while(b==0);
            System.out.println("le resultat  = "+(a/b));
        }else {
            System.out.println("le resultat  = "+(a/b));
        }
    }

    public static void Puissance(){
        float resultat = 1;
        System.out.println("entrer base : ");
        a= scanner.nextFloat();
        System.out.println("entrer exposant : ");
        b= scanner.nextFloat();
        for(int i=0; i<b;i++){
            resultat=resultat*a;
        }
        System.out.println(a+" a la puissance "+ b +" = "+resultat );
    }

    public static void RacineCarree(){
        System.out.println("entrer nombre : ");
        a= scanner.nextFloat();
        if(a<0){
            System.out.println("la racine carree d'un nombre negative est impossible !!");
            do {
                System.out.println("entrer un nombre superieur ou egal a 0 : ");
                a= scanner.nextFloat();
            }while(a<0);
            System.out.println("la racine carree de "+a+" = "+ Math.sqrt(a));
        }else{
            System.out.println("la racine carree de "+a+" = "+ Math.sqrt(a));
        }
    }

    public static void Factorielle(){
        int c,resultat=1;
        System.out.println("entrer nombre entier positif  : ");
        c= scanner.nextInt();
        if(c<0){
            System.out.println("le factoriel ne marche pas pour un nombre negatif  ");
            do {
                System.out.println("entrer nombre entier positif : ");
                c= scanner.nextInt();

            }while(c<0);
            for(int i=1;i<=c;i++){
                resultat=resultat*i;
            }
            System.out.println("le factoriel de "+c+" = "+resultat);
        }else {
            for(int i=1;i<=c;i++){
                resultat=resultat*i;
            }
            System.out.println("le factoriel de "+c+"  = "+resultat);
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
                    Puissance();
                    break;
                case 6 :
                    RacineCarree();
                    break ;
                case 7 :
                    Factorielle();
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
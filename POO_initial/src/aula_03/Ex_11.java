package aula_03;

import java.util.Random;
import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        int aposta, aleatorio;
        Random myRand = new Random();
        Scanner myScan = new Scanner(System.in);

        System.out.println("Aposte em um número entre entre 1 e 4: ");
        aposta = myScan.nextInt();

        aleatorio = myRand.nextInt(5);

        System.out.println("O número sorteado é " + aleatorio);

        if (aposta == aleatorio) {
            System.out.println("você acertou!!");
        } else {
            System.out.println("Mais sorte na próxima!");
        }


    }
}

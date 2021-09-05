package aula_03;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        int a, b, c;
        Scanner myScan = new Scanner(System.in);

        // Lado A
        System.out.println("Digite o lado A: ");
        a = myScan.nextInt();

        // Lado B
        System.out.println("Digite o lado B: ");
        b = myScan.nextInt();

        // Lado C
        System.out.println("Digite o lado C: ");
        c = myScan.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("não é um triângulo! um lado não pode ser maior do que a soma dos outros");
        } else if (a == 0 || b == 0 || c == 0) {
            System.out.println("não é um triângulo! nenhum lado pode ser igual a 0");
        } else {

            if (a == b && b == c) {
                System.out.println("Triângulo EQUILÁTERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo ISÓSCELES");
            } else {
                System.out.println("Triângulo ESCALENO");
            }
        }


    }
}

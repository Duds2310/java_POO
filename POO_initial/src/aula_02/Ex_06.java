package aula_02;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        double area;
        Scanner myScan = new Scanner(System.in);

        // Base
        System.out.println("Base: ");
        double base = myScan.nextDouble();

        // Altura
        System.out.println("Altura: ");
        double altura = myScan.nextDouble();

        area = base * altura;

        System.out.println("Área: " + area);

    }

}

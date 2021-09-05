package aula_02;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        final double PI = 3.14159;
        double diametro;
        double circunferencia;
        double area;
        Scanner myScan = new Scanner(System.in);

        // Raio
        System.out.println("Raio: ");
        double raio = myScan.nextDouble();

        diametro = 2 * raio;
        circunferencia = 2 * PI * raio;
        area = PI * Math.pow(raio, 2);

        System.out.println("Diâmetro: " + diametro + "\nCircunferência: " + circunferencia + "\nÁrea: " + area);

    }
}

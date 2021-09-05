package aula_03;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Double peso, altura, imc;
        Scanner myScan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura = myScan.nextDouble();

        System.out.println("Digite seu peso: ");
        peso = myScan.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc >= 30.0) {
            System.out.println("Obesidade");
        } else if (imc >= 25.0) {
            System.out.println("Sobrepeso");
        } else if (imc >= 18.5) {
            System.out.println("Saudável");
        } else {
            System.out.println("Magreza");
        }

    }
}

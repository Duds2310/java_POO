package aula_03;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        Double salario, novoSalario, bonus1, bonus2;
        int tempo;

        bonus1 = 0.10;
        bonus2 = 0.20;

        Scanner myScan = new Scanner(System.in);

        System.out.println("Digite o salário base: ");
        salario = myScan.nextDouble();

        System.out.println("Digite o tempo de empresa(y): ");
        tempo = myScan.nextInt();

        if (tempo >= 5) {
            novoSalario = salario + (salario * bonus2);
        } else {
            novoSalario = salario + (salario * bonus1);
        }

        System.out.println("O novo salário é: " + novoSalario);

    }
}

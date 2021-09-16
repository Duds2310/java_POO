package aula_04;

import java.util.Scanner;

public class Ex_11 {
    //Elabore um exercício que leia um número N e exiba a tabuada desse número até 10.
    // Exemplo, caso N seja 1, exibir resultado semelhante a imagem abaixo.
    public static void main(String[] args) {

        int num, i=0, result;
        Scanner myScan = new Scanner(System.in);

        System.out.println("Digite um valor positivo: ");
        num = myScan.nextInt();

        while (i<=10){

            result = num*i;

            System.out.println(num + " X " + i + " = " + result);
            i++;

        }



    }
}

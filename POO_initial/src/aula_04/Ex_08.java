package aula_04;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        int limite, i;
        Scanner myScan = new Scanner(System.in);

        System.out.println("Digite um valor positivo para o limite: ");
        limite = myScan.nextInt();

        i=0;
        while (i<limite){

            if (i%2 == 0){
                System.out.println(i);
            }
            i++;
        }






    }
}

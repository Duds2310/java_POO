import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        // Idade
        System.out.println("Digite sua idade: ");
        String idade = myScan.nextLine();

        // Altura
        System.out.println("Digite sua altura: ");
        String altura = myScan.nextLine();

        // Nome
        System.out.println("Digite seu nome: ");
        String nome = myScan.nextLine();

        // Output
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nAltura: "+altura);

    }
}

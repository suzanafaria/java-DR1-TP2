package exercicios;

import java.util.Scanner;

public class ex6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano para verificar se é ano bissexto:");
        int ano = Integer.parseInt(scanner.nextLine());

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.printf("%d é ano bissexto.", ano);
        } else {
            System.out.printf("%d não é ano bissexto.", ano);
        }
    }

}

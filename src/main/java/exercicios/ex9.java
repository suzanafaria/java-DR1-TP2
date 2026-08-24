package exercicios;

import java.util.Scanner;

public class ex9 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua senha:");
        String senhaInicial = scanner.nextLine();

        String senhaDigitada;

        do {
            System.out.println("Digite a senha novamente:");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaInicial)) {
                System.out.println("Senha incorreta. Digite novamente!");
            } else {
                System.out.println("Senha digitada corretamente!");
            }
        } while (!senhaDigitada.equals(senhaInicial));
    }
}

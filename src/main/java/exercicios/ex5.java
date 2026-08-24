package exercicios;

import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: R$");
        double valorInicial = scanner.nextDouble();

        double desconto;
        double valorFinal;

        if (valorInicial > 1000){
            desconto = valorInicial*0.1;
            valorFinal = valorInicial - desconto;
            System.out.printf("Valor inicial: R$%.2f - Desconto: R$%.2f - Valor Final: R$%.2f", valorInicial, desconto, valorFinal);
        } else if (valorInicial>= 500){
            desconto = valorInicial*0.05;
            valorFinal = valorInicial - desconto;
            System.out.printf("Valor inicial: R$%.2f - Desconto: R$%.2f - Valor Final: R$%.2f", valorInicial, desconto, valorFinal);
        } else {
            System.out.printf("Valor inicial: R$%.2f - Nenhum desconto aplicado", valorInicial);
        }
    }
}

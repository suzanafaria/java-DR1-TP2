package exercicios;

import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em reais: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // limpa o Enter pendente
        System.out.println("Digite a moeda de destino (dolar, euro ou libra): ");
        String moeda = scanner.nextLine().toLowerCase();

        double dolar = 5.69;
        double euro = 6.58;
        double libra = 7.89;

        double valorConvertido;

        switch (moeda) {
            case "dolar":
                valorConvertido = valor / dolar;
                System.out.printf("Valor convertido para %.2f dolares", valorConvertido);
                break;

            case "euro":
                valorConvertido = valor / euro;
                System.out.printf("Valor convertido para %.2f euros", valorConvertido);
                break;

            case "libra":
                valorConvertido = valor / libra;
                System.out.printf("Valor convertido para %.2f libras", valorConvertido);
                break;

            default:
                System.out.println("Moeda nao encontrada");
        }

    }
}

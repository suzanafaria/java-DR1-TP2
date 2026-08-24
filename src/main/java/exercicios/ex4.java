package exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia do seu aniversario");
        int dia = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o mês do seu aniversario");
        int mes = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o ano do seu aniversario");
        int ano = Integer.parseInt(scanner.nextLine());

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();

        long totalDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("A quantidade de dias entre as datas "+dataNascimento +" e " + dataAtual + " é de " + totalDias + " dias.");


    }
}

package exercicios;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do 1o bimestre");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota do 2o bimestre");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota do 3o bimestre");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a nota do 4o bimestre");
        double nota4 = scanner.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        if (media >= 7){
            System.out.println("Está aprovado");
        } else if (media < 5){
            System.out.println("Está reprovado");
        } else {
            System.out.println("Está em recuperação");
        }

    }
}

package exercicios;

import java.util.Scanner;

public class ex7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario: R$");
        double salarioBruto = scanner.nextDouble();

        double imposto;
        double salarioLiquido;

        if (salarioBruto >= 4664.68){
            imposto = salarioBruto*0.275;
            salarioLiquido = salarioBruto - imposto;
            System.out.printf("Imposto: R$%.2f - Salário Liquido: R$%.2f", imposto, salarioLiquido);
        } else if (salarioBruto >= 3751.06){
            imposto = salarioBruto*0.225;
            salarioLiquido = salarioBruto - imposto;
            System.out.printf("Imposto: R$%.2f - Salário Liquido: R$%.2f", imposto, salarioLiquido);
        } else if (salarioBruto >= 2826.66){
            imposto = salarioBruto*0.15;
            salarioLiquido = salarioBruto - imposto;
            System.out.printf("Imposto: R$%.2f - Salário Liquido: R$%.2f", imposto, salarioLiquido);
        } else if (salarioBruto >= 2428.81){
            imposto = salarioBruto*0.075;
            salarioLiquido = salarioBruto - imposto;
            System.out.printf("Imposto: R$%.2f - Salário Liquido: R$%.2f", imposto, salarioLiquido);
        } else {
            System.out.printf("Imposto: Isento - Salário Bruto = Liquido: R$%.2f", salarioBruto);
        }


    }
}

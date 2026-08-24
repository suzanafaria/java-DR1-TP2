package exercicios;

import java.util.Scanner;

public class ex1
{
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nome da mãe: ");
        String nomeMae = scanner.nextLine();
        System.out.println("Digite o nome do pai: ");
        String nomePai = scanner.nextLine();

        int tamanhoNome = nome.length();
        int tamanhoNomeMae = nomeMae.length();
        int tamanhoNomePai = nomePai.length();

        if (tamanhoNome > tamanhoNomeMae || tamanhoNome > tamanhoNomePai){
           System.out.println("O seu nome tem mais letras que o dos seus pais");
        } else System.out.println("O seu nome tem menos caracteres que o dos seus pais");
    }
}

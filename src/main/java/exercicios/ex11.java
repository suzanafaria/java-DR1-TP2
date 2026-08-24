package exercicios;


import java.sql.SQLOutput;
import java.util.Scanner;

public class ex11 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite um incremento: ");
        int incremento = Integer.parseInt(scanner.nextLine());

        for (int i = numero; i<=100; i+= incremento){
            if (i + incremento <= 100){
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
    }
}

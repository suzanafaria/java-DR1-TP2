package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex10 {
    static void main(String[] args) {
        Random random = new Random();
        int numeroSortido = random.nextInt(99) + 1;

        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        do {
            System.out.println("Adivinhe o número:");
            numeroDigitado = Integer.parseInt(scanner.nextLine());
            if (numeroDigitado > numeroSortido){
                System.out.println("Palpite acima do número!");
            } else if (numeroDigitado < numeroSortido){
                System.out.println("Palpite abaixo do número!");
            } else {
                System.out.println("Palpite correto!");
            }
        }while (numeroDigitado != numeroSortido);

    }
}
package exercicios;

import java.util.Scanner;

public class ex8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do Lado A do triângulo:");
        double ladoA = scanner.nextDouble();
        System.out.println("Digite o valor do Lado B do triângulo:");
        double ladoB = scanner.nextDouble();
        System.out.println("Digite o valor do Lado C do triângulo:");
        double ladoC = scanner.nextDouble();

        if (ladoA > 0 && ladoB>0 && ladoC>0 &&
                ladoA + ladoB > ladoC &&
                ladoA + ladoC > ladoB &&
                ladoB+ladoC > ladoA){
            if (ladoA == ladoB && ladoA == ladoC){
                System.out.println("Triangulo Equilátero");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                System.out.println("Triangulo Escaleno");
            } else {
                System.out.println("Triangulo Isósceles");
            }
        } else{
            System.out.println("Valores não válidos");
        }

    }
}

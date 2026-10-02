package Questao1;

import java.util.Scanner;

/**
 * Exercício 2)
 * <br>
 * Crie uma array de 5 elementos e descubra:
 * <br>
 * a) Qual o maior elemento
 * <br>
 * b) Qual o menor elemento
 * <br>
 * c) A média dos elementos
 */
public class Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": "); // arruma visualização
            numeros[i] = input.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num; // correção de erro
            }
            soma += num;
        }

        double media = (double) soma / numeros.length; // correção de erro

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Media dos números: " + media);

        input.close();
    }
}
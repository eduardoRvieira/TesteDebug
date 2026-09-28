import java.util.Scanner;

/**
 * Exercício 1)
 * <br>
 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
 * com o número 0
 * <br>
 * Ao final, calcule a média das alturas informadas.
 */
public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double somaAltura = 0;
        int contador = 0;

        double altura;
        while (true) {

            System.out.println("Insira a altura");
            altura = input.nextDouble();
            if (altura > 0) {
                somaAltura += altura; // correção de erro
                contador++; // correção de erro
            } else {
                break;
            }
        }

        double media = somaAltura / contador; //correção de erro

        System.out.println("Média de altura: " + media + " metros");
    }

}
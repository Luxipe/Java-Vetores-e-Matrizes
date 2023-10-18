package Morango;
import java.util.Scanner;

public class Morango6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número inteiro não-negativo.
        System.out.println("Calculadora de Fatorial");
        System.out.print("Digite um número inteiro não-negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            // Verifica se o número é negativo e informa que o fatorial não é definido para números negativos.
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            // Chama a função calcularFatorial para calcular o fatorial do número.
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }

    // Função para calcular o fatorial de um número inteiro não-negativo.
    public static long calcularFatorial(int numero) {
        // Caso base: Fatorial de 0 é 1.
        if (numero == 0) {
            return 1;
        }

        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}

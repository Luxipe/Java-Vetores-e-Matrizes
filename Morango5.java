package Morango;
      import java.util.Scanner;
    public class Morango5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número inteiro.
        System.out.println("Verificador de Divisibilidade por 4 e 7");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chama a função verificarDivisibilidade para determinar se o número é divisível por 4 e por 7.
        if (verificarDivisibilidade(numero)) {
            System.out.println(numero + " é divisível por 4 e por 7.");
        } else {
            System.out.println(numero + " não é divisível por 4 e por 7.");
        }

        scanner.close();
    }

    // Função para verificar a divisibilidade por 4 e 7.
    public static boolean verificarDivisibilidade(int numero) {
        // Verifica se o número é divisível por 4 e por 7.
        if (numero % 4 == 0 && numero % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
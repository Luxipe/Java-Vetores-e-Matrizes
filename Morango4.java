package Morango;
    import java.util.Scanner;
    public class Morango4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número inteiro.
        System.out.println("Calculadora de Soma de Dígitos");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chama a função calcularSomaDigitos para calcular a soma dos dígitos do número.
        int soma = calcularSomaDigitos(numero);

        // Exibe o resultado da soma dos dígitos.
        System.out.println("A soma dos dígitos do número é: " + soma);

        scanner.close();
    }

    // Função para calcular a soma dos dígitos de um número inteiro.
    public static int calcularSomaDigitos(int numero) {
        // Inicializa a variável para armazenar a soma dos dígitos.
        int soma = 0;

        // Converte o número em positivo para lidar com dígitos negativos.
        numero = Math.abs(numero);

        while (numero > 0) {
            // Obtém o último dígito do número e adiciona à soma.
            int digito = numero % 10;
            soma += digito;

            // Remove o último dígito do número.
            numero /= 10;
        }

        return soma;
    }
}
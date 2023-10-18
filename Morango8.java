package Morango;
    import java.util.Scanner;
    public class Morango8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número inteiro.
        System.out.println("Verificador de Número Perfeito");
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chama a função verificarNumeroPerfeito para determinar se o número é perfeito ou não.
        if (verificarNumeroPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        scanner.close();
    }

    // Função para verificar se um número é perfeito.
    public static boolean verificarNumeroPerfeito(int numero) {
        // Verifica se o número não é positivo, pois números não-positivos não podem ser perfeitos.
        if (numero <= 0) {
            return false;
        }

        int somaDivisores = 0;

        // Calcula a soma dos divisores próprios (excluindo o próprio número).
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        // Um número é perfeito se a soma dos seus divisores próprios é igual a ele mesmo.
        return (somaDivisores == numero);
    }
}
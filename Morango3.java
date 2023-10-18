package Morango;
    import java.util.Scanner;
    public class Morango3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o comprimento do lado do quadrado.
        System.out.println("Calculadora de Perímetro de Quadrado");
        System.out.print("Digite o comprimento do lado do quadrado: ");
        double lado = scanner.nextDouble();

        // Chama a função calcularPerimetroQuadrado para calcular o perímetro do quadrado.
        double perimetro = calcularPerimetroQuadrado(lado);

        // Exibe o resultado do perímetro do quadrado.
        System.out.println("O perímetro do quadrado é: " + perimetro);

        scanner.close();
    }

    // Função para calcular o perímetro do quadrado com base no comprimento do lado.
    public static double calcularPerimetroQuadrado(double lado) {
        // O perímetro de um quadrado é calculado multiplicando o comprimento do lado por 4.
        return 4 * lado;
    }
}

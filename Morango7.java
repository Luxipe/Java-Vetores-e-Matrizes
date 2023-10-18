package Morango;
   import java.util.Scanner;
   public class Morango7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o raio da esfera.
        System.out.println("Calculadora de Volume de Esfera");
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        // Chama a função calcularVolumeEsfera para calcular o volume da esfera.
        double volume = calcularVolumeEsfera(raio);

        // Exibe o resultado do volume da esfera.
        System.out.println("O volume da esfera é: " + volume);

        scanner.close();
    }

    // Função para calcular o volume de uma esfera com base no raio.
    public static double calcularVolumeEsfera(double raio) {
        // Fórmula para calcular o volume de uma esfera: (4/3) * pi * raio^3
        double pi = Math.PI;
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        return volume;
    }
}

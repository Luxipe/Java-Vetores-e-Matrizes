   package Morango;
   import java.util.Scanner;

   public class Morango1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir os valores da base maior, base menor e altura do trapézio.
        System.out.println("Calculadora de Área de Trapézio");
        System.out.print("Digite o valor da base maior: ");
        double baseMaior = scanner.nextDouble();
        System.out.print("Digite o valor da base menor: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

        // Chama a função calcularAreaTrapezio para calcular a área do trapézio.
        double area = calcularAreaTrapezio(baseMaior, baseMenor, altura);

        // Exibe o resultado da área do trapézio.
        System.out.println("A área do trapézio é: " + area);

        scanner.close();
    }

    // Função para calcular a área do trapézio com base na base maior, base menor e altura.
    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        // Fórmula da área do trapézio: ((baseMaior + baseMenor) * altura) / 2
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}

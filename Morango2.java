package Morango;
import java.util.Scanner;

public class Morango2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir a ordem da matriz quadrada (n).
        System.out.println("Calculadora de Determinante de Matriz");
        System.out.print("Digite a ordem da matriz quadrada (n): ");
        int n = scanner.nextInt();

        // Cria uma matriz de tamanho n x n para armazenar os elementos da matriz.
        double[][] matriz = new double[n][n];

        // Solicita ao usuário para inserir os elementos da matriz linha por linha.
        System.out.println("Digite os elementos da matriz linha por linha:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Chama a função calcularDeterminante para calcular o determinante da matriz.
        double determinante = calcularDeterminante(matriz);

        // Exibe o resultado do determinante da matriz.
        System.out.println("O determinante da matriz é: " + determinante);

        scanner.close();
    }

    // Função para calcular o determinante da matriz.
    public static double calcularDeterminante(double[][] matriz) {
        int n = matriz.length;

        // Verifica se a matriz é quadrada (mesmo número de linhas e colunas).
        if (n != matriz[0].length) {
            throw new IllegalArgumentException("A matriz não é quadrada.");
        }

        if (n == 1) {
            // Caso base: A matriz é 1x1, o determinante é o único elemento da matriz.
            return matriz[0][0];
        }

        if (n == 2) {
            // Caso base: A matriz é 2x2, aplicamos a fórmula do determinante.
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        double determinante = 0;
        for (int j = 0; j < n; j++) {
            // Expande o determinante pela primeira linha da matriz.
            determinante += matriz[0][j] * cofator(matriz, 0, j);
        }

        return determinante;
    }

    // Função para calcular o cofator de um elemento da matriz.
    public static double cofator(double[][] matriz, int linha, int coluna) {
        int n = matriz.length;
        double[][] menor = new double[n - 1][n - 1];
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (i == linha) continue;
            int y = 0;
            for (int j = 0; j < n; j++) {
                if (j == coluna) continue;
                menor[x][y] = matriz[i][j];
                y++;
            }
            x++;
        }
        // Aplicamos a fórmula do cofator: (-1)^(linha+coluna) * determinante do menor.
        return Math.pow(-1, linha + coluna) * calcularDeterminante(menor);
    }
}

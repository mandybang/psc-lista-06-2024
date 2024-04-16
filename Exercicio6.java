import java.util.Scanner;

/** Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene 
num vetor a média de cada aluno, imprima o número de alunos com média 
maior ou igual a 7.0 */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int[] vetorPar = new int[20];
        int[] vetorImpar = new int[20];
        int contadorPar = 0;
        int contadorImpar = 0;

        // Lê os 20 números inteiros
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número inteiro: ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                vetorPar[contadorPar] = vetor[i];
                contadorPar++;
            } else {
                vetorImpar[contadorImpar] = vetor[i];
                contadorImpar++;
            }
        }

        // Imprime os três vetores
        System.out.println("Vetor original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\nVetor de números pares:");
        for (int i = 0; i < contadorPar; i++) {
            System.out.print(vetorPar[i] + " ");
        }
        System.out.println("\nVetor de números ímpares:");
        for (int i = 0; i < contadorImpar; i++) {
            System.out.print(vetorImpar[i] + " ");
        }
    scanner.close();
    }
}

/**Faça um Programa que leia 20 números inteiros e armazene-os num vetor. 
Armazene os números pares no vetor PAR e os números IMPARES no vetor 
ímpar. Imprima os três vetores.
*/
import java.util.Scanner;

public class Exercicio5 {public static void main(String[] args) {
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
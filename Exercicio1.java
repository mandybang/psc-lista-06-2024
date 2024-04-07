/**Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.*/

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] vetorNumeros = new int [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite aqui 5 números inteiros: ");
            vetorNumeros[i] = input.nextInt();
        }

        System.out.println("Os números digitados são:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetorNumeros[i]);
        }
        input.close();
    }
}
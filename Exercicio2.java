/** Faça um Programa que leia um vetor de 10 números reais e mostre-os na 
ordem inversa.*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorNumeros = new int [10];

        for (int i =0;i<10;i++) {

            System.out.println("Digite aqui um numero real:  ");
            vetorNumeros[i] = input.nextInt();
        }

        System.out.println("Sequencia inversa do informado: ");

        for (int i=9;i>=0;i--) {
            System.out.println(vetorNumeros[i]);
        }



        input.close();
    }
    
}

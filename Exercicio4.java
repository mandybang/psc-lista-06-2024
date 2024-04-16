/**Faça um Programa que leia um vetor de 10 caracteres, e diga quantas 
consoantes foram lidas. Imprima as consoantes.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];

        // Lê os caracteres do usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um caractere: ");
            caracteres[i] = scanner.next().charAt(0);
        }

        // Verifica e conta as consoantes
        int contadorConsoantes = 0;
        for (char c : caracteres) {
            c = Character.toUpperCase(c); // Considera tanto maiúsculas quanto minúsculas
            if (!(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                contadorConsoantes++;
                System.out.print(c + " ");
            }
        }

        System.out.println();
        System.out.println("Quantidade de consoantes lidas: " + contadorConsoantes);
        scanner.close();
    }
}
/**Faça um Programa que leia 4 notas, mostre as notas e a média na tela.*/
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] notas = new double[4];
        double soma = 0;

        for (int i=0;i<4;i++) {
            System.out.println("Digite aqui sua nota " + (i+1) +":");
            notas[i] = input.nextDouble(); 
            soma +=notas[i]; //calcula a soma das notas
        }
        
        for (double nota : notas){
        System.out.println("Suas notas são: " + (nota));
    }

        double media = soma/4;
        System.out.printf("As média das notas são:%.2f%n ", media);

        input.close();
    }
    
}


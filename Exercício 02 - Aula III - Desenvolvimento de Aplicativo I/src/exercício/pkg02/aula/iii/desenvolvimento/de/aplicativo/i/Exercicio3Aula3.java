
package exercício.pkg02.aula.iii.desenvolvimento.de.aplicativo.i;

import java.util.Scanner;

public class Exercicio3Aula3 {
    String nome;
    int num;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("=========== Olá, Seja Bem Vindo! =========");
        
        System.out.println("Digite se nome de Usuário para começarmos:");
        String nome = ler.nextLine();
        
        System.out.println("Agora digite um número para eu lhe dizer se o mesmo é Par ou Ímpar:");
        double num = ler.nextDouble();
        
        
        if (num%2 == 0) {
            System.out.println("Esse número é um número  PAR!");
        }else {
            System.out.println("Esse número é um número ÍMPAR!");
        }
    }
    
}

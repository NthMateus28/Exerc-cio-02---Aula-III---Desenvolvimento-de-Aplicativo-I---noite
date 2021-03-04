
package exercício.pkg02.aula.iii.desenvolvimento.de.aplicativo.i;

import java.util.Scanner;

public class Exercicio01Aula3 {
    String nome;
    int num;
    

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("========== Olá, Seja Bem Vindo!==========");
        
        System.out.println("Digite seu nome para começarmos:");
        String nome = ler.nextLine();
        
        System.out.println("Agora digite um número para eu poder te dizer se ele é negativo ou positivo:");
        double num = ler.nextDouble();
        
        
        if (num >= 0) {
            System.out.println("Esse número é positivo!");
        }else {
            System.out.println("Esse número é negativo!");
        }
    
    }
    
}

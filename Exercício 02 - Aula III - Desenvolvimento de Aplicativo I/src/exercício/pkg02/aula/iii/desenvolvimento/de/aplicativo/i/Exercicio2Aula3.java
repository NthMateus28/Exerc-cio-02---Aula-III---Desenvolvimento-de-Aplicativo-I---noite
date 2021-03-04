
package exercício.pkg02.aula.iii.desenvolvimento.de.aplicativo.i;

import java.util.Scanner;

public class Exercicio2Aula3 {
    String nome;
    double valor1, valor2;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("=========== Olá, Tudo bem? =========");
        
        System.out.println("Para começarmos digite o seu nome:");
        String nome = ler.nextLine();
        
        System.out.println("Agora vou pedir que você digite dois valores e então lhe direi se eles são iguais ou não.");
        
        System.out.println("Digite o primeiro valor:");
        double valor1 = ler.nextDouble();
        
        System.out.println("Digite o segundo valor:");
        double valor2 = ler.nextDouble();
        
        
        if (valor1 == valor2){
            System.out.println("Esses valores são iguais!");
        }else {
            System.out.println("Esses valores não são iguais!");
        }
        
     
    }
    
}

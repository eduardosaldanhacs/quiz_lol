import java.util.Scanner;
// Escreva um programa que leia um valor inteiro, calcule e mostre o seu fatorial. Fatorial
//de um número natural n, representado por n!, é o produto de todos os inteiros positivos menores ou
//iguais a n. Exemplo: 3! = 6, ou seja, 1 x 2 x 3 = 6.
public class A103 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        int fatorial = 0;
        System.out.println("Digite um valor: ");
        valor = scan.nextInt();
        for(int i = 1; i <= valor; i++) {
            if(i == 1) {
                fatorial = fatorial + (1 * i);
            } else {
                fatorial = fatorial + (1 * i);
            }
        }
        System.out.println("Resultado: " + fatorial);
    }
}

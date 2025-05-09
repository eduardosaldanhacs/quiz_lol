import java.util.Scanner;
//A101) (0,5 pontos) Embrulhar um presente de aniversário custa X reais. O presente de aniversário
//custa Y reais a mais que o preço para embrulhá-lo. Quanto custará para comprar e embrulhar o presente?
//Faça um programa que responda automaticamente a questão apresentada. O valor X e Y do problema
//devem ser lidos e são valores reais
public class A101 {
    public static void main(String[] args) {
        //embrulhar presente = X
        //presente = X + Y
        //comprar presente = X + X + Y
        int embrulhar;
        int presente;
        int comprar_presente;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        embrulhar = scan.nextInt();
        System.out.println("Digite o valor de Y: ");
        presente = scan.nextInt();
        comprar_presente = (embrulhar + presente);
        System.out.println("O valor para embrulhar o presente é: " + comprar_presente);
    }
}

import java.util.Objects;
import java.util.Scanner;
//O IAC (Índice de Adiposidade Corporal) é uma fórmula que indica a condição de peso
//de um adulto. A fórmula para calcular o IAC é:
//Desenvolver um programa que leia a circunferência do quadril (cm), a altura (m) e o sexo. Calcule o
//IAC e escreva na tela a condição que o mesmo encontra-se, conforme a tabela abaixo:

public class A102 {
    public static void main(String[] args) {
        double circunferencia_quadril;
        double alturaM;
        String sexo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua circunferência do quadril: ");
        circunferencia_quadril = scan.nextDouble();
        System.out.println("Digite a sua altura em metros: ");
        alturaM = scan.nextDouble();
        System.out.println("Digite o seu sexo: 'M' ou 'F'");
        sexo = scan.next();

        double IAC = ((circunferencia_quadril / (alturaM * (Math.sqrt(alturaM)))) - 18.0);
        if(Objects.equals(sexo, "Feminino")) {
            if(IAC < 20.0) {
                System.out.println("Seu IAC é: " + IAC);
                System.out.println("Abaixo do peso");
            } else if(IAC >= 21.0 && IAC <= 32.0) {
                System.out.println("Seu IAC é: " + IAC);
                System.out.println("Normal");
            } else if(IAC >= 33.0 && IAC <= 38.0) {
                System.out.println("Seu IAC é: " + IAC);
                System.out.println("Sobrepeso");
            } else if(IAC > 38.0) {
                System.out.println("Seu IAC é: " + IAC);
                System.out.println("Obesidade");
            } else {
                System.out.println("Nenhuma das opções");
            }
        } else if (Objects.equals(sexo, "Masculino")) {
            if(IAC < 8.0) {
                System.out.println("Seu IAC é: " + IAC);
                System.out.println("Abaixo do peso");
            } else if(IAC >= 8.0 && IAC <= 20.0) {
                System.out.println("Seu IAC é: " + IAC);
                System.out.println("Normal");
            } else if(IAC >= 21.0 && IAC <= 25.0) {
                System.out.println("Seu IAC é: " + IAC);
                System.out.println("Sobrepeso");
            } else if(IAC > 25.0) {
                System.out.println("Seu IAC é: " + IAC);
                System.out.println("Obesidade");
            } else {
                System.out.println("Nenhuma das opções");
            }
        } else {
            System.out.println("Digite um sexo válido!");
        }

    }
}

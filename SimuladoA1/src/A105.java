import java.util.Scanner;
//Criar uma função/método que verifique se um número é primo. Faça um programa
//principal que teste a função desenvolvida. Um número primo étodo número que é apenas divisível por ele
//mesmo e o número um. Ex: 7
public class A105 {

    public static class Numero {
        public int algarismo;
        public String tipo;

        public Numero() {

        }
        public Numero(int algarismo, String tipo) {
            this.algarismo = algarismo;
            this.tipo = tipo;
        }

        public int getAlgarismo() {
            return algarismo;
        }

        public void setAlgarismo(int algarismo) {
            this.algarismo = algarismo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }


        public static boolean verificaPrimo(int numero) {
            int i = 1;
            int contador = 0;
            while(i <= numero) {
                if(numero % i == 0) {
                    contador++;
                }
                i++;
            }
            if(contador <= 2) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        String tipo;
        boolean resultado;


        System.out.println("Digite um valor: ");
        valor = scan.nextInt();
        Numero numero;
        resultado = Numero.verificaPrimo(valor);

        if(resultado) {
            new Numero(valor, "Primo");
            System.out.println("O número é primo");
        } else {
            new Numero(valor, "Par");
            System.out.println("O número é par");
        }

    }
}

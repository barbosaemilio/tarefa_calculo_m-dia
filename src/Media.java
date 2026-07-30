import java.util.Scanner;// IMPORTA FERRAMENTA DE LEITURA DO TECLADO
/**
 * @author Emílio Barbosa
 * ***** calculadora de média escolar#####
 */
public class Media {
    public static void main(String[] args) {
        mediaNotas();
    }

    private static void mediaNotas(){
        //LEITOR DE TECLADO:
        Scanner scanner = new Scanner(System.in);

        System.out.println("***CALCULADORA DE MÉDIA \n Digite a nota de 1 a 10 ***");
        System.out.println("Digite a Primeira nota");
        double num1 = scanner.nextDouble();

        System.out.println("Digite a Segunda nota");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a Terceira nota");
        double num3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota");
        double num4 = scanner.nextDouble();

        //OPERAÇÃO MÉDIA:
        double num5 =(num1 + num2 + num3 + num4) / 4;
        System.out.println("\nSua média foi: " + num5);

        scanner.close();
    }
}

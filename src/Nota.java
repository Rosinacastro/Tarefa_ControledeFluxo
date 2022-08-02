import java.util.Scanner;
/**
 * @author rosina.castro
 */

public class Nota {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = s.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double nota2 = s.nextDouble();

        System.out.println("Entre com a terceira nota: ");
        double nota3 = s.nextDouble();

        System.out.println("Entre com a quarta nota: ");
        double nota4 = s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 07) {
            System.out.println("Aluno Provado");
        } if (media >= 05) {
            System.out.println("Aluno em recuperação");
        } if (media <= 05) {
            System.out.println("Aluno reprovado");
        } else {
        }

    }

}

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
          // Declaração do meu metodo main que seria o inicio do programa no portugol
        Scanner scanner = new Scanner(System.in);
          // Declarei minhas variaveis do tipo decimal pois pode ter nota com casa decimal
        double nota1, nota2, nota3, nota4, media;
        /*
         * imprimo a mensagem abaixo e atribuo o valor que o usuário responder para
         * minha variavel
         * da mesma forma do leia no portugol
         */
        System.out.print("Digite a primeira nota bimestral: ");
           nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota bimestral: ");
           nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota bimestral: ");
           nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota bimestral: ");
           nota4 = scanner.nextDouble();
        /*
         * Atribui o valor para media e sempre usando parenteses para não realizar a
         * divisão primeiro
         * e consequentemente fazer o calculo errado
         */
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("A média das quatro notas é: " + media + ".");
        // por fim fecho minha biblioteca scanner
        scanner.close();
    }
}

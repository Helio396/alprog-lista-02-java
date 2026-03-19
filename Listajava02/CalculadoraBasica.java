import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          // Declaração das variaveis que pode receber numero decimal graças ao double
        double numero1, numero2, soma, subtracao, multiplicacao;
          // Imprimir as mensagens para o usuario gerar informação
        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();
          // Atribui o valor das minhas variaveis
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
          // Imprimir as mensagens que testei no método formatado
        System.out.println("\n" + "=".repeat(40));
        System.out.printf("CALCULOS COM %.2f E %.2f%n", numero1, numero2);
        System.out.println("=".repeat(40));
        System.out.printf("Soma: %.2f + %.2f = %.2f%n", numero1, numero2, soma);
        System.out.printf("Subtracao: %.2f - %.2f = %.2f%n", numero1, numero2, subtracao);
        System.out.printf("Multiplicacao: %.2f x %.2f = %.2f%n", numero1, numero2, multiplicacao);
        System.out.println("=".repeat(40));
          // fechei minha biblioteca scanner
        scanner.close();
    }
}

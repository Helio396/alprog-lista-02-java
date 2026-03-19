import java.util.Scanner;

public class CalculadoraGasolina {
    public static void main(String[] args) {
          // Criando o objeto scanner para ler os dado digitado pelo usuário
        Scanner scanner = new Scanner(System.in);
          // Declaração das minhas variáveis do tipo decimal
        double precoLitro;
        double litros;
        double valorTotal;
          // O programa imprimi a mensagem para receber a informação do usuário
        System.out.print("Digite o preço do litro da gasolina (R$)? ");
        precoLitro = scanner.nextDouble();

        System.out.print("Digite a quantidade de litros vendido? ");
        litros = scanner.nextDouble();
          // Atribuindo o valor da variavel que irá gera o resulta
        valorTotal = precoLitro * litros;
          // O algoritmo imprimi pro o usuário uma mensagem e valor da variável
        System.out.println("Cliente deve pagar: R$" + valorTotal);
          // Fechamento da biblioteca scanner
        scanner.close();
    }
}

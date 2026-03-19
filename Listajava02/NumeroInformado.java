import java.util.Scanner;

public class NumeroInformado {
    public static void main(String[] args) {
           // Criando o objeto scanner para ler os dado digitado pelo usuário
      Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número? ");
          // Declarei minha variável que pode receber número decimal graças a variável double
      double numero = scanner.nextDouble();
          // Imprimir mensagem mais o número informado pelo usuário
        System.out.print("O número informado é: " + numero + ".");
          // Por fim fechei minha biblioteca scanner
        scanner.close();
    }
}

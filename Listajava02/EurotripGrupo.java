import java.util.Scanner;

public class EurotripGrupo {
    public static void main(String[] args) {
        // Criando o objeto scanner para ler os dado digitado pelo usuário
        Scanner scanner = new Scanner(System.in);
        // Meu algoritmo imprimi as mensagens que o usuário responde e programa guarda
        // nas variáveis
        System.out.print("Digite o preço da passagem para Alemanha? ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Digite quantas pessoas iram pra Alemanha? ");
        int pessoasAlemanha = scanner.nextInt();

        System.out.print("Digite o preço da passagem para Portugal? ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Digite quantas pessoas iram pra Portugal? ");
        int pessoasPortugal = scanner.nextInt();

        System.out.print("Digite o preço da passagem para Italia? ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Digite quantas pessoas iram pra Italia? ");
        int pessoasItalia = scanner.nextInt();
        // Atribuindo valor pra variável "totalCusto" que no caso é os calculos
        double totalCusto = (precoAlemanha * pessoasAlemanha) +
                (precoPortugal * pessoasPortugal) +
                (precoItalia * pessoasItalia);
        // Declaração de variável do tipo inteiro pois não existe 3,5 pessoas
        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;
        // O algoritmo imprimi as mensagens que adiciona o valor total de pessoas e
        // custo
        System.out.println("Total pessoas: " + totalPessoas);
        System.out.println("Total a pagar: R$" + totalCusto);
        // fecho minha biblioteca scanner
        scanner.close();
    }
}

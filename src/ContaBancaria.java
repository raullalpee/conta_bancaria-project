import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Seu Nome";
        String tipoDeConta = "Corrente";
        double saldo = 2500.99;

        System.out.println("*************************");
        System.out.println("\nNOME DO CLIENTE: " + nome);
        System.out.println("TIPO DE CONTA: " + tipoDeConta);
        System.out.println("SALDO ATUAL: " + saldo);
        System.out.println("\n*************************");

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("----- Operações -----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Transferir Valor");
            System.out.println("3. Receber Valor");
            System.out.println("4. Sair");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Saldo Atual: " + saldo);
            }  else if (escolha == 2) {
                System.out.println("Qual valor deseja Transferir?");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar essa transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Foi transferido o valor de " + valor + " de sua Conta");
                }
            } else if (escolha == 3) {
                System.out.println("Qual valor deseja receber?");
                double valor2 = scanner.nextDouble();
                saldo += valor2;
                System.out.println("Foi depositado " + valor2 + " em sua Conta");
            } else if (escolha == 4) {
                System.out.println("Encerrando programa...");
            } else if (escolha >= 5) {
                System.out.println("Não é possível realizar essa ação");
            }
        }
    }
}
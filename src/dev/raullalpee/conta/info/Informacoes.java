package dev.raullalpee.conta.info;

import java.util.Scanner;

public class Informacoes {
    Scanner scanner = new Scanner(System.in);

    private String nome;
    private String tipoDeConta;
    private double saldo;
    public int escolha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirValor() {
        if (escolha == 1) {
            System.out.println("Saldo atual atualizado: " + getSaldo());
        }
    }

    public void transferirValor() {
        if (escolha == 2) {
            System.out.println("Qual valor deseja Transferir?");
            double valor = scanner.nextDouble();
           if (valor <= 0) {
                System.out.println("Digite um valor MAIOR que R$0");
            }
            if (valor > saldo) {
                System.out.println("Não há saldo para realizar essa transferência");
            } else if(valor != 0) {
                saldo -= valor;
                System.out.println("Foi transferido o valor de R$" + valor + " de sua Conta");
            }
        }
    }

        public void receberValor() {
            if (escolha == 3) {
                System.out.println("Qual valor deseja receber?");
                double valor2 = scanner.nextDouble();
                if (valor2 <= 0) {
                    System.out.println("Digite um valor MAIOR que R$0");
                } else if (valor2 != 0) {
                    saldo += valor2;
                    System.out.println("Foi depositado R$" + valor2 + " em sua Conta");
                }
            }
        }

        public void sairPrograma() {
            if (escolha == 4) {
                System.out.println("Encerrando programa...");
            }
        }

        public void escolhaControlada() {
            if (escolha >= 5) {
                System.out.println("Não é possível realizar essa ação");
            } else if (escolha <= 0) {
                System.out.println("Não é possível realizar essa ação");
            }
        }

}
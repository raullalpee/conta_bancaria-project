package dev.raullalpee.conta;

import dev.raullalpee.conta.info.Informacoes;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Informacoes info = new Informacoes();
        Scanner scanner = new Scanner(System.in);

        info.setNome("Seu Nome");
        info.setTipoDeConta("Corrente");
        info.setSaldo(2500);

        System.out.println("*************************");
        System.out.println("\nNOME DO CLIENTE: " + info.getNome());
        System.out.println("TIPO DE CONTA: " + info.getTipoDeConta());
        System.out.println("SALDO ATUAL: " + info.getSaldo());
        System.out.println("\n*************************");

        info.escolha = 0;

        while (info.escolha != 4) {
            System.out.println("----- Operações -----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Transferir Valor");
            System.out.println("3. Receber Valor");
            System.out.println("4. Sair");
            info.escolha = scanner.nextInt();

            info.exibirValor();
            info.transferirValor();
            info.receberValor();
            info.sairPrograma();
            info.escolhaControlada();
        }
    }
}
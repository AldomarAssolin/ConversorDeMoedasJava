package br.com.aldomarassolin;

import br.com.aldomarassolin.conversion.CurrencyConverter;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Moedas!");

        // Menu de opções
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Converter BRL para USD");
            System.out.println("2. Converter USD para BRL");
            System.out.println("3. Converter BRL para EUR");
            System.out.println("4. Converter EUR para BRL");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            double amount;

            switch (choice) {
                case 1:
                    System.out.print("Digite o valor em BRL: ");
                    amount = scanner.nextDouble();
                    converter.getConvertBRLToUSD(amount);
                    break;
                case 2:
                    System.out.print("Digite o valor em USD: ");
                    amount = scanner.nextDouble();
                    converter.getConvertUSDToBRL(amount);
                    break;
                case 3:
                    System.out.print("Digite o valor em EUR: ");
                    amount = scanner.nextDouble();
                    converter.getConvertBRLToEUR(amount);
                    break;
                case 4:
                    System.out.print("Digite o valor em EUR: ");
                    amount = scanner.nextDouble();
                    converter.getConvertEURToBRL(amount);
                    break;
                case 5:
                    System.out.println("Obrigado por usar o Conversor de Moedas!");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}

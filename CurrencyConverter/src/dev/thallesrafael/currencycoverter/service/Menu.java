package dev.thallesrafael.currencycoverter.service;

import dev.thallesrafael.currencycoverter.models.Moedas;
import dev.thallesrafael.currencycoverter.models.MoedasLogDTO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void exibir() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        FileWriter escrita = new FileWriter("Log.json");
        List<MoedasLogDTO> listaMoedasConvertidas;

        CurrencyConverter conversor = new CurrencyConverter();
        Moedas moedas;
        String moedaOrigem;
        String moedaDestino;
        double resultado;
        boolean continuar = true;

        while (continuar) {
            System.out.println("""
                    Escolha a opção de conversão:
                    1  - BRL => USD
                    2  - BRL => EUR
                    3  - BRL => GBP
                    4  - BRL => JPY
                    5  - BRL => CAD
                    6  - USD => BRL
                    7  - EUR => BRL
                    8  - GBP => BRL
                    9  - JPY => BRL
                    10 - CAD => BRL
                    11 - SAIR
                    *******************************************************
                    """);
            int opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 11) {
                continuar =false;
                System.out.println("Até mais!");
                break;
            }


            System.out.println("Digite o valor a ser convertido: ");
            double valor = sc.nextDouble();


            switch (opcao) {
                case 0:
                    System.out.println("Até mais!!");
                    break;
                case 1:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 2:
                    moedaOrigem = "BRL";
                    moedaDestino = "EUR";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 3:
                    moedaOrigem = "BRL";
                    moedaDestino = "GBP";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 4:
                    moedaOrigem = "BRL";
                    moedaDestino = "JPY";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 5:
                    moedaOrigem = "BRL";
                    moedaDestino = "CAD";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 6:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 7:
                    moedaOrigem = "EUR";
                    moedaDestino = "BRL";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 8:
                    moedaOrigem = "GBP";
                    moedaDestino = "BRL";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 9:
                    moedaOrigem = "JPY";
                    moedaDestino = "BRL";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                case 10:
                    moedaOrigem = "CAD";
                    moedaDestino = "BRL";
                    resultado = conversor.converterCurrency(moedaDestino, moedaOrigem, valor);
                    System.out.println("O valor final da sua operção será: $" + resultado);
                    System.out.println("*******************************************************");
                    continuar = sair();
                    if(!continuar) System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Moeda Inválida!");
            }
        }

    }
    public boolean sair(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                            Deseja sair ?
                            1 - não
                            2 - sim
                            """);
        int sair = sc.nextInt();
        sc.nextLine();
        System.out.println("*******************************************************");
        return sair == 1;
    }
}

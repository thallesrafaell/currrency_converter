package dev.thallesrafael.currencycoverter;

import dev.thallesrafael.currencycoverter.service.Menu;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Menu menu = new Menu();
        System.out.println("*******************************************************");
        System.out.println("***************** Coin converter 1.0V *****************");
        System.out.println("* Olá, estou aqui para fazer sua conversão de moedas! *");
        System.out.println("*******************************************************");
        System.out.println();
        menu.exibir();

    }
}

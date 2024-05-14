package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = Ler.nextLine();
        System.out.println("Digite o valor da sua compra: ");
        double compra = Ler.nextDouble();
        System.out.println("Digite o valor do pagamento: ");

        double pagamento = Ler.nextDouble();

        double[] notas = { 200.00, 100.00, 50.00, 20.00, 5.00, 2.00, 1.00 };
        int[] quantidade = new int[notas.length];

        double troco = pagamento - compra;

        System.out.println("Nome: " + nome);
        System.out.println("Valor Total da Compra R$: " + compra);
        System.out.println("Valor Pago R$: " + pagamento);
        System.out.println("Troco: " + troco);

        int listaNotas = 0;
        while (listaNotas < notas.length) {
            quantidade[listaNotas] = (int) (troco / notas[listaNotas]);
            troco %= notas[listaNotas];

            System.out.println("Notas de " + notas[listaNotas] + ": " + quantidade[listaNotas]);
            listaNotas++;
        }
    }
}

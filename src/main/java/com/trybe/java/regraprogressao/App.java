package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    String input1 = scanner.next();
    int quantity = Integer.parseInt(input1);

    for (int i = 1; i <= quantity; i++) {
      System.out.print("Digite o nome da atividade " + i + ": ");
      String input2 = scanner.next();
    }
  }
}
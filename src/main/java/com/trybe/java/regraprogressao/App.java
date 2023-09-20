package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class App {

  /**
   * Metodo main.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    String input1 = scanner.next();
    int quantity = Integer.parseInt(input1);
    double weightSum = 0;

    for (int i = 1; i <= quantity; i++) {
      System.out.print("Digite o nome da atividade " + i + ": ");
      String activityName = scanner.next();

      System.out.print("Digite o peso da atividade " + i + ": ");
      double weight = Double.parseDouble(scanner.next());
      weightSum += weight;

      System.out.print("Digite a nota obtida para " + activityName + ": ");
      double grade = Double.parseDouble(scanner.next());
    }
    System.out.print("Soma: " + weightSum);
  }
}
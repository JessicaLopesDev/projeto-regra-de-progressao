package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int quantity = Integer.parseInt(scanner.nextLine());
    double weightSum = 0;
    double totalAverage = 0;

    for (int i = 1; i <= quantity; i++) {
      System.out.println("Digite o nome da atividade " + i + ": ");
      String activityName = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ": ");
      int weight = Integer.parseInt(scanner.nextLine());
      weightSum += weight;

      System.out.println("Digite a nota obtida para " + activityName + ": ");
      int grade = Integer.parseInt(scanner.nextLine());

    }
    System.out.print("Soma: " + weightSum);
  }
}
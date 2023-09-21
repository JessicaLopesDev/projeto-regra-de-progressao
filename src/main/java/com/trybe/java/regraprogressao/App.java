package com.trybe.java.regraprogressao;

import java.util.Scanner;
/**
 * App.
 */

public class App {
  /**
   * main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int quantity = Integer.parseInt(scanner.nextLine());
    int weightSum = 0;
    int totalGrade = 0;

    for (int i = 1; i <= quantity; i++) {
      System.out.println("Digite o nome da atividade " + i + ": ");
      String activityName = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ": ");
      int weight = Integer.parseInt(scanner.nextLine());
      weightSum += weight;

      System.out.println("Digite a nota obtida para " + activityName + ": ");
      int grade = Integer.parseInt(scanner.nextLine());
      totalGrade += weight * grade;
    }
    float average = (float) totalGrade / 100;

    if (weightSum != 100) {
      System.out.println("O peso total precisa ser 100, tente novamente.");
    } else {
      if (average < 85) {
        System.out.println("Lamentamos informar que, com base na sua pontuação alcançada neste "
            + "período, " + average + "%, você não atingiu a "
            + "pontuação mínima necessária para sua aprovação.");
      } else {
        System.out.println("Parabéns! Você alcançou " + average + "%! "
            + "E temos o prazer de informar que você obteve aprovação! ");
      }
    }
  }
}
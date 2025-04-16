package com.linkedin.javacodechallenges;

import java.util.*;

public class DoubleOrNothing {

  public void playGame() {
    Scanner input = new Scanner(System.in);
    System.out.println("               Would you like to play a game?       ");
    System.out.println("                            Y/N                     ");
    String choice = input.nextLine();

    if (choice.equals("Y") || choice.equals("Y")) {
      System.out.println("------------------Shall we Begin?-----------------");
      System.out.println(" You now have £10 you have the option to double it");
      System.out.println("           Would you like to double it            ");
      System.out.println("                         Y/N                      ");
      String newchoice = input.nextLine();
      if (newchoice.equals("Y") || newchoice.equals("Y")) {
        Random random = new Random();
        int result = random.nextBoolean() ? 20 : 0;
        System.out.println(result);
        if (result == 0) {
          System.out.println("               You lose! Try again?           ");
        } else {
          System.out.println("                 You Win £20                  ");
        }

      } else {
        System.out.println("                  Very well bye                ");
      }
    } else {
      System.out.println("                    Very well bye               ");
    }
    input.close();
  }
}

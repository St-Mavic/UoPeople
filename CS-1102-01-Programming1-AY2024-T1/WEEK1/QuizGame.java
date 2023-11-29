package WEEK1;

import java.util.Scanner;

public class QuizGame {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("WELCOME TO QUIZ GAME");
      System.out.println("-----------------------");
      int score = 0; // initializing the score counter that keeps track record of the scores to 0

      // Defining and displaying the questions and it's options
      System.out.println("\nQuestion 1:");
      System.out.println("One of these is not an occupation");
      System.out.println("A. Teacher");
      System.out.println("B. Lawyer");
      System.out.println("C. Doctor");
      System.out.println("D. House");
      System.out.println("\nSelect either option A, B, C or D");

      // Accepting user's input (answer).
      String answer1; 

      while (true) {
          answer1 = input.nextLine().toUpperCase();

         if (answer1.equals("A") || answer1.equals("B") || answer1.equals("C") || answer1.equals("D")) {
            break;
         } else {
            System.out.println("Invalid input. Please enter a valid option");
         }
      }
      // compareing the user's input to the correct answer and increementing the score
      if (answer1.equalsIgnoreCase("D")) {
         System.out.println("Correct!");
         score += 1;
      } else {
         System.out.println("Incorrect! The correct answer is D.");
      }

      System.out.println("\nQuestion 2:");
      System.out.println("What is the Capital of USA?");
      System.out.println("A. New York");
      System.out.println("B. Texas");
      System.out.println("C. Washington, D.C");
      System.out.println("D. Califonia");
      System.out.println("\nSelect either option A, B, C or D");

      String answer2; 
      while (true) {
        answer2 = input.nextLine().toUpperCase();
        if (answer2.equals("A")||answer2.equals("B")|| answer2.equals("C")||answer2.equals("D")) {
         break;
        }else{
         System.out.println("Invalid input. Please input a Valid option");
        }
      }
      if (answer2.equalsIgnoreCase("C")) {
         System.out.println("Correct!");
         score += 1;
      } else {
         System.out.println("Incorrect! The correct answer is C");
      }

      System.out.println("\nQuestion 3:");
      System.out.println("One of these is a primitive data type in Java");
      System.out.println("A. String");
      System.out.println("B. Array");
      System.out.println("C. Class");
      System.out.println("D. Char");
      System.out.println("\nSelect either option A, B, C or D");

      String answer3;
      while (true) {
                answer3 = input.nextLine().toUpperCase();
                if(answer3.equals("A")||answer3.equals("B")||answer3.equals("C")||answer3.equals("D")){
                  break;
                }else{
                  System.out.println("Invalid input. Please enter a Valid option");
                }

      }
      if (answer3.equalsIgnoreCase("D")) {
         System.out.println("correct!");
         score += 1;
      } else {
         System.out.println("Incorrect! The correct answer is D.");
      }

      System.out.println("\nQuestion 4:");
      System.out.println("What is the Capital of Nigeria?");
      System.out.println("A. Abuja");
      System.out.println("B. Lagos");
      System.out.println("C. Calabar");
      System.out.println("D. Ibadan");
      System.out.println("\nSelect either option A, B, C or D");

      String answer4;
      while (true) {
                answer4 = input.nextLine().toUpperCase();
                if(answer4.equals("A")||answer4.equals("B")||answer4.equals("C")||answer4.equals("D")){
                  break;
                }else{
                  System.out.println("Invalid input. Please select a valid option.");
                }

      }
      if (answer4.equalsIgnoreCase("A")) {
         System.out.println("Correct!");
         score += 1;
      } else {
         System.out.println("Incorrect! The correct answer is A.");
      }

      System.out.println("\nQuestion 5:");
      System.out.println("What is the correct abbreviation of University of the People?");
      System.out.println("A. uopeople");
      System.out.println("B. UoPeople");
      System.out.println("C. uOPEOPLE");
      System.out.println("D. UOPEople");
      System.out.println("\nSelect either option A, B, C or D");

      String answer5;
      while (true) {
                answer5 = input.nextLine().toUpperCase();
               if(answer5.equals("A") || answer5.equals("B") || answer5.equals("C") || answer5.equals("D")){
                  break;
               }else{
                  System.out.println("Invalid input. Please select a valid option.");
               }
      }

      if (answer5.equalsIgnoreCase("B")) {
         System.out.println("Correct!");
         score += 1;
      } else {
         System.out.println("Incorrect! The correct answer is B.");
      }
      // Calculating the user's total score in percentage
      double percentage = (double) score / 5 * 100;
      // displaying the final result.
      System.out.println("\nYou answered " + score + " out of 5 questions correctly.");
      System.out.println("Your total score is " + percentage + "%");
      System.out.println("\nQuiz Completed successfully.");
      input.close();
   }
}
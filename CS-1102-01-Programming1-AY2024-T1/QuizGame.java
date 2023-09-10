import java.util.Scanner;

public class QuizGame{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO THE QUIZ GAME");
        System.out.println("----------------------------");
        int score = 0;
        System.out.println("\nQuestion 1:");
        System.out.println("One of these is not an ocupation");
               System.out.println("A. Teacher");
               System.out.println("B. Lawyer");
               System.out.println("C. Doctor");
               System.out.println("D. House");
            System.out.println("\nInput option A, B, C or D");

               String answer1 = input.nextLine();

               if (answer1.equalsIgnoreCase("D")){
                System.out.println("Correct!");
                score++;
               }else{
                System.out.println("Incorrect! The correct answer was D.");
               }


               System.out.println("Question 2:");
               System.out.println("What is the Capital of USA?");
               System.out.println("A. New York");
               System.out.println("B. Texas");
               System.out.println("C. Washington DC");
               System.out.println("D. Califonia");

               String answer2 = input.nextLine();
               if(answer2.equalsIgnoreCase("C")){
                System.out.println("Correct!");
                score++;
               }else{
                System.out.println("Incorrect! The correct answer was C");
               }


               System.out.println("\nQuestion 3:");
               System.out.println("One of these is a primitive data type in Java");
               System.out.println("A. String");
               System.out.println("B. Array");
               System.out.println("C. Class");
               System.out.println("D. Char");

               String answer3 = input.nextLine();
               if(answer3.equalsIgnoreCase("D")){
                System.out.println("correct!");
                score++;
               }else{
                System.out.println("Incorrect! The correct answer was D.");
               }

               System.out.println("\nQuestion 4:");
               System.out.println("");
            input.close();
    }
}
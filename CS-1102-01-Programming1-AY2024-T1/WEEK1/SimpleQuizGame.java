package WEEK1;

import java.util.Scanner;

public class SimpleQuizGame {
    public static void main(String[] args) {
        int score = 0;
        System.out.println("Welcome to Quiz Game");

        String[] questions = {
                "1. What is the Capital of Nigeria?",
                "2. Who is the president of USA?",
                "3. Which country has a population greater than China?",
                "4. What is the capital of Ghana?",
                "5. Who is the CEO of Microsoft?"
        };
        String[] options = {
                "(a) Lagos (b) Calabar (c) Abuja (d) Yola",
                "(a) Joe Biden (b) Donald Trump (c) Barack Obama (d) Kamala Harris",
                "(a) China (b) India (c) USA (d) UK",
                "(a) Accra (b) Kumasi (c) Ouagad (d) Sekondi",
                "(a) Satya Nadella (b) Bill Gates (c) Elon Musk (d) Jack Dorsey"
        };
        char[] answers = { 'C', 'A', 'B', 'A', 'B' };

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.println("\n Select A, B, C, or D:");
            char userAnswer;
            while (true) {
                // Accepting user input
                String userInput = input.nextLine().toUpperCase();

                // validating user input and displaying the appropriate error message.
                if (userInput.length() == 1 && userInput.charAt(0) >= 'A' && userInput.charAt(0) <= 'D') {
                    userAnswer = userInput.charAt(0);
                    break;
                } else {
                    System.out.println("Invalid option. Please enter A, B, C, or D.");
                }
            }
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is \n" + answers[i]);
            }
        }
        double perc = (double) score / questions.length * 100;
        System.out.println("\nYou\'ve answered' " + score + " out of " + questions.length + " questions correctly.");
        System.out.println("Your total score is " + perc + "%");
                System.out.println("\nQuiz completed Successsful");

        input.close();
    }
}

package projects;

import java.util.Scanner;

public class QuizGame {
    static Scanner sc = new Scanner(System.in);
    static int correctAnswerCount = 0;

    public static void main(String[] args) {
        System.out.println(
                "There are 5 questions related to Java. Each followed by 4 options from which only 1 is correct.");
        System.out.println("\nGood luck!!");
        System.out.println("\n\nAre you ready to play, y/n?");
        String yesNo = sc.nextLine();
        if (yesNo.equalsIgnoreCase("y")) {
            for (int i = 0; i < QuestionBank.questions.length; i++) {
                displayQuestion(i);
                takeAnswer(i);
            }
            showResult();
        } else {
            System.out.println("It's okay, come back when you are ready.");
            System.exit(0);
        }
    }

    public static void displayQuestion(int i) {
        System.out.println(QuestionBank.questions[i]);
        System.out.println("A. " + QuestionBank.answers[i][0] +
                "\nB. " + QuestionBank.answers[i][1] +
                "\nC. " + QuestionBank.answers[i][2] +
                "\nD. " + QuestionBank.answers[i][3]);
    }

    public static void takeAnswer(int questionIndex) {
        String answer;
        while (true) {
            System.out.println("Enter your answer below.");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c")
                    || answer.equalsIgnoreCase("d"))
                break;
            else
                System.out.println("Enter valid option as a answer [A/B/C/D].");
        }
        if (QuestionBank.correctAnswer[questionIndex].equalsIgnoreCase(answer)) {
            System.out.println("Correct Answer!!");
            correctAnswerCount++;
        } else {
            System.out.println("Wrong answer, correct answer: " + QuestionBank.correctAnswer[questionIndex]);
        }
    }

    public static void showResult() {
        double percentage = ((double) correctAnswerCount / QuestionBank.questions.length) * 100;
        System.out.println("Your total score is (" + correctAnswerCount + "/" + QuestionBank.questions.length + ")");
        System.out.printf("Your percentage is: %.2f%%%n", percentage);
        if (percentage >= 90) {
            System.out.println("Your grade is A+");
        } else if (percentage >= 80) {
            System.out.println("Your grade is A");
        } else if (percentage >= 70) {
            System.out.println("Your grade is B");
        } else if (percentage >= 60) {
            System.out.println("Your grade is C");
        } else if (percentage >= 50) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
    }
}
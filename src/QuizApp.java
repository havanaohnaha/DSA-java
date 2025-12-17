
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = new String[]{"What is the capital of India ?", "Who is the father of Java programming?", "Which gas is most abundant in earth's atmosphere? ", "What is 10+15?"};
        String[] options = new String[]{"1.Delhi 2.Mumbai 3.Chennai 4.kolkata", "1.James gosling 2.Dennis Ritchie 3.Bjarne Stroustrup 4.Guido van Rossum  ", "1.oxygen 2.nitrogen 3. hydrogen 4.carbon dioxide", "1. 20 2. 25 3. 30 4.35 "};
        int[] CorrectAnswers = new int[]{1, 1, 2, 2};
        int[] UserAnswers = new int[questions.length];
        System.out.println("===welcome to the quiz!===");

        for (int i = 0; i < questions.length; ++i) {
            System.out.println("questions " + (i + 1) + ":" + questions[i]);
            System.out.println(options[i]);
            System.out.println("enter your answer(1-4");
            UserAnswers[i] = sc.nextInt();
            System.out.println();
        }

        int score = 0;
        System.out.println("== ouiz results==\n");

        for (int i = 0; i < questions.length; ++i) {
            System.out.println("questions" + (i + 1) + "your answers:" + UserAnswers[i] + "=>");
            if (UserAnswers[i] == CorrectAnswers[i]) {
                System.out.println("Correct");
                score += 10;
            } else {
                System.out.println(" incorrect");
            }
        }
    }
}


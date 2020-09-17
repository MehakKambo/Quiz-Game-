package QuizGame;
import java.util.Random;
import java.util.Scanner;
public class QuizGame {

	public QuizGame() {
		intial();
	}

	public static void intial() {
		System.out.println("Welcome to the Nba Quiz Game");

		String q1 = "1. Which team drafted Stephen Curry in 2009?"
				+ "\n(a) Spurs\t\t(b) Raptors\n(c) Warriors\t\t(d) Rockets";
		String q2 = "2. Which team won the NBA Finals in 2013?"
				+ "\n(a) SuperSonics\t\t(b) Suns\n(c) Spurs\t\t(d) Heat";
		String q3 = "3. Who beat the Heat in the NBA Finals in 2011?"
				+ "\n(a) Mavericks\t\t(b) Grizzlies\n(c) Thunder\t\t(d) Hawks";

		Question [] questions = {
				new Question(q1, 'c'),
				new Question(q2, 'd'),
				new Question(q3, 'a')
		};
		startGame(questions);
	}

	public static void startGame(Question [] questions) {
		int score = 0;
		Scanner console = new Scanner(System.in);
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].question);
			System.out.print("Please type your answer: ");
			char userAnswer = console.next().charAt(0);
			System.out.println();
			if(userAnswer == (questions[i].answer)) {
				score++;
			}
		}
		System.out.println("You socred " + score +  "/"+ questions.length);
	}
}


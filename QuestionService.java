import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    Scanner scanner = new Scanner(System.in);
    public QuestionService() {
        questions[0] = new Question(1, "Name of the Programming Language?", "Java", "C", "C++", "php", "Java");
        questions[1] = new Question(2, "Name of the Programming Language?", "Java", "C", "C++", "php", "C");
        questions[2] = new Question(3, "Name of the Programming Language?", "Java", "C", "C++", "php", "C++");
        questions[3] = new Question(4, "Name of the Programming Language?", "Java", "C", "C++", "php", "php");
        questions[4] = new Question(5, "Name of the Programming Language?", "Java", "C", "C++", "php", "");
    }
    int i = 0;
    int score = 0;
    public void playQuiz() {
        for(Question q : questions) {
            System.out.println("Question no. :"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println("............................");
            System.out.print("Answer: ");
            selection[i] = scanner.nextLine();
            System.out.println("............................");

            if (q.getAnswer().equals(selection[i])) {
                score++; i++;
            }
        }
    }

    public void printScore()
    {
        System.out.println(score);
    }
}

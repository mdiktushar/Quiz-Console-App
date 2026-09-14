public class QuestionService {
    
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "Name of the Programming Language?", "Java", "C", "C++", "php", "Java");
        questions[1] = new Question(2, "Name of the Programming Language?", "Java", "C", "C++", "php", "C");
        questions[2] = new Question(3, "Name of the Programming Language?", "Java", "C", "C++", "php", "");
        questions[3] = new Question(4, "Name of the Programming Language?", "Java", "C", "C++", "php", "C++");
        questions[4] = new Question(5, "Name of the Programming Language?", "Java", "C", "C++", "php", "php");
    }

    public void displayQuestons() {
        for(Question q : questions) {
            System.out.println(q);
        }
    }
}

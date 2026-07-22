package quiz.aplicacao.console;

import quiz.framework.ExibirInterface;
import quiz.framework.QuizFactory;
import quiz.framework.QuizTemplate;

public class MainJavaConsole {
    public static void main(String[] args) {
        java.nio.charset.Charset.defaultCharset(); 
        ExibirInterface telaConsole = new ExibirConsoleJava();
        QuizFactory factory = new JavaConsoleFactory();
        QuizTemplate quiz = factory.criarQuiz(telaConsole);
        
        quiz.executarQuiz();
    }
}
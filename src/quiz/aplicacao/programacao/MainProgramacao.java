package quiz.aplicacao.programacao;

import quiz.framework.ExibirInterface;
import quiz.framework.QuizTemplate;
import quiz.framework.QuizFactory;

public class MainProgramacao {
    public static void main(String[] args) {
        ExibirInterface telaSwing = new ExibirSwing();
        QuizFactory factory = new ProgramacaoFactory();
        QuizTemplate quiz = factory.criarQuiz(telaSwing);
        
        quiz.executarQuiz();
    }
}
package quiz.aplicacao.console;

import quiz.framework.QuizFactory;
import quiz.framework.QuizTemplate;
import quiz.framework.ExibirInterface;
import quiz.framework.StrategyPontuacao;

public class JavaConsoleFactory implements QuizFactory {
    
    @Override
    public QuizTemplate criarQuiz(ExibirInterface exibicao) {
        return new QuizJavaConsole(exibicao, criarEstrategiaPontuacao());
    }

    @Override
    public StrategyPontuacao criarEstrategiaPontuacao() {
        return new StrategyPontuacaoJava();
    }
}
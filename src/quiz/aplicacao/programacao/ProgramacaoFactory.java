package quiz.aplicacao.programacao;

import quiz.framework.QuizFactory;
import quiz.framework.QuizTemplate;
import quiz.framework.ExibirInterface;
import quiz.framework.StrategyPontuacao;

public class ProgramacaoFactory implements QuizFactory {
    
    @Override
    public QuizTemplate criarQuiz(ExibirInterface exibicao) {
        return new QuizProgramacao(exibicao, criarEstrategiaPontuacao());
    }

    @Override
    public StrategyPontuacao criarEstrategiaPontuacao() {
        return new StrategyPontuacaoProgramacao();
    }
}
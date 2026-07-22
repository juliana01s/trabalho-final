package quiz.framework;

public interface QuizFactory {
    QuizTemplate criarQuiz(ExibirInterface exibicao);
    StrategyPontuacao criarEstrategiaPontuacao();
}
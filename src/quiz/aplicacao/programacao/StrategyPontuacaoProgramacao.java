package quiz.aplicacao.programacao;

import quiz.framework.StrategyPontuacao;

public class StrategyPontuacaoProgramacao implements StrategyPontuacao {
    @Override
    public int calcularPontos(int acertos, int erros) {
        return (acertos * 10) - (erros * 5);
    }
}
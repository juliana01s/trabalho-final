package quiz.aplicacao.console;

import quiz.framework.StrategyPontuacao;

public class StrategyPontuacaoJava implements StrategyPontuacao {
    @Override
    public int calcularPontos(int acertos, int erros) {
        int pontosGanhos = acertos * 15;  
        int pontosPerdidos = erros * 5;   
    
        return pontosGanhos - pontosPerdidos;
    }

}
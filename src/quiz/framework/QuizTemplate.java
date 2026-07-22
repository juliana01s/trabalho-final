package quiz.framework;

import java.util.List;

public abstract class QuizTemplate {
    protected ExibirInterface interfaceExibicao;
    protected StrategyPontuacao estrategiaPontuacao;
    private List<Pergunta> perguntas;

    private int acertos = 0;
    private int erros = 0;

    public QuizTemplate(ExibirInterface interfaceExibicao, StrategyPontuacao estrategiaPontuacao) {
        this.interfaceExibicao = interfaceExibicao;
        this.estrategiaPontuacao = estrategiaPontuacao;
        this.perguntas = inicializarPerguntas(); 
    }

    protected abstract List<Pergunta> inicializarPerguntas();

    public final void executarQuiz() {
        for (Pergunta pergunta : perguntas) {
            interfaceExibicao.exibirPergunta(pergunta.getEnunciado(), pergunta.getAlternativas());
            
            int resposta = interfaceExibicao.capturarResposta();

            if (pergunta.validarResposta(resposta)) {
                acertos++;
                interfaceExibicao.exibirMensagem("Resposta Correta!");
            } else {
                erros++;
                interfaceExibicao.exibirMensagem("Resposta Incorreta!");
            }
        }

        int pontuacaoFinal = estrategiaPontuacao.calcularPontos(acertos, erros);
        ResultadoFinal resultado = new ResultadoFinal(acertos, erros, pontuacaoFinal);
        interfaceExibicao.exibirResultadoFinal(resultado);
    }
}
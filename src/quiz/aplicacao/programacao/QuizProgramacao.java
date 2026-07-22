package quiz.aplicacao.programacao;

import quiz.framework.Alternativa;
import quiz.framework.Pergunta;
import quiz.framework.QuizTemplate;
import quiz.framework.ExibirInterface;
import quiz.framework.StrategyPontuacao;
import java.util.ArrayList;
import java.util.List;

public class QuizProgramacao extends QuizTemplate {

    public QuizProgramacao(ExibirInterface interfaceExibicao, StrategyPontuacao estrategiaPontuacao) {
        super(interfaceExibicao, estrategiaPontuacao);
    }

    @Override
    protected List<Pergunta> inicializarPerguntas() {
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
            "Qual é a principal função de uma variável na programação?",
            List.of(
                new Alternativa("Traduzir código para binário", false),
                new Alternativa("Armazenar dados na memória", true),
                new Alternativa("Exibir mensagens na tela", false),
                new Alternativa("Executar um comando repetidamente", false)
            )
        ));

        perguntas.add(new Pergunta(
            "Em Java, qual palavra-chave é usada na assinatura de um método para indicar que ele não retorna nenhum valor?",
            List.of(
                new Alternativa("null", false),
                new Alternativa("void", true),
                new Alternativa("empty", false),
                new Alternativa("static", false)
            )
        ));

        perguntas.add(new Pergunta(
            "Na linguagem Lua, qual é o índice inicial padrão de uma tabela (array)?",
            List.of(
                new Alternativa("0", false),
                new Alternativa("1", true),
                new Alternativa("-1", false),
                new Alternativa("Depende do compilador", false)
            )
        ));

        perguntas.add(new Pergunta("O que caracteriza o tipo de dado 'String'?",
            List.of(
                new Alternativa("Números com casas decimais", false),
                new Alternativa("Valores verdadeiro ou falso", false),
                new Alternativa("Números inteiros e positivos", false),
                new Alternativa("Sequência de caracteres de texto", true)
            )
        ));

        return perguntas;
    }
}
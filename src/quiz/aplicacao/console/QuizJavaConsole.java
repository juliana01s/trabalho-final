package quiz.aplicacao.console;

import java.util.ArrayList;
import java.util.List;
import quiz.framework.Alternativa;
import quiz.framework.ExibirInterface;
import quiz.framework.Pergunta;
import quiz.framework.QuizTemplate;
import quiz.framework.StrategyPontuacao;

public class QuizJavaConsole extends QuizTemplate {

    public QuizJavaConsole(ExibirInterface interfaceExibicao, StrategyPontuacao estrategiaPontuacao) {
        super(interfaceExibicao, estrategiaPontuacao);
    }

    @Override
    protected List<Pergunta> inicializarPerguntas() {
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
            "Qual é o nome do famoso gesto em formato de coração que a Chuu criou e que acabou virando uma febre gigantesca entre quase todos os idols de K-Pop?",
            List.of(
                new Alternativa("Finger Heart", false),
                new Alternativa("Chuu Heart", true),
                new Alternativa("Gypsy Heart", false),
                new Alternativa("Loona Heart", false)
            )
        ));

        perguntas.add(new Pergunta(
            "Em que ano BTS debutou?",
            List.of(
                new Alternativa("2013", true),
                new Alternativa("2022", false),
                new Alternativa("2016", false),
                new Alternativa("2019", false)
            )
        ));

        perguntas.add(new Pergunta(
            "Qual foi a musica de debut do aespa?",
            List.of(
                new Alternativa("Drama", false),
                new Alternativa("Savage", false),
                new Alternativa("Black Mamba", true),
                new Alternativa("Next Level", false)
            )
        ));

        perguntas.add(new Pergunta(
            "Qual é o termo oficial utilizado na indústria do K-Pop para se referir ao período em que um artista lança um novo álbum e se apresenta ativamente em programas musicais de TV (como o M Countdown e o Music Bank)?",
            List.of(
                new Alternativa("Debut Era", false),
                new Alternativa("Comeback Period", true),
                new Alternativa("Hiatus", false),
                new Alternativa("Trainee Period", false)
            )
        ));

        return perguntas;
    }
}
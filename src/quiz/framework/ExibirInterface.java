package quiz.framework;

import java.util.List;

public interface ExibirInterface {
    void exibirPergunta(String enunciado, List<Alternativa> alternativas);
    int capturarResposta(); 
    void exibirMensagem(String mensagem); 
    void exibirResultadoFinal(ResultadoFinal resultado);
}
package quiz.framework;

import java.util.List;

public class Pergunta {
    
    private String enunciado;
    private List<Alternativa> alternativas;

    public Pergunta(String enunciado, List<Alternativa> alternativas) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public List<Alternativa> getAlternativas() {
        return alternativas;
    }
    
    public boolean validarResposta(int indiceAlternativaEscolhida) {
        if(indiceAlternativaEscolhida < 0 || indiceAlternativaEscolhida >= alternativas.size()) {
            return false; 
        }
        
        return alternativas.get(indiceAlternativaEscolhida).isCorreta();
    }
}
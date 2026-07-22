package quiz.framework;

public class ResultadoFinal {
    private int acertos;
    private int erros;
    private int pontuacaoFinal;

    public ResultadoFinal(int acertos, int erros, int pontuacaoFinal) {
        this.acertos = acertos;
        this.erros = erros;
        this.pontuacaoFinal = pontuacaoFinal;
    }

    public int getAcertos() { return acertos; }
    public int getErros() { return erros; }
    public int getPontuacaoFinal() { return pontuacaoFinal; }
}
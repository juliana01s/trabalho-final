package quiz.aplicacao.programacao;

import quiz.framework.Alternativa;
import quiz.framework.ExibirInterface;
import quiz.framework.ResultadoFinal;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.List;

public class ExibirSwing implements ExibirInterface {
    
    private int ultimaRespostaCapturada = -1;

    @Override
    public void exibirPergunta(String enunciado, List<Alternativa> alternativas) {
        String[] opcoes = new String[alternativas.size()];
        for (int i = 0; i < alternativas.size(); i++) {
            opcoes[i] = alternativas.get(i).getTexto();
        }

        ImageIcon original = new ImageIcon("src/images/image.png");
        Image image = original.getImage();
        Image tamanho = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(tamanho);

        ultimaRespostaCapturada = JOptionPane.showOptionDialog(null,
                enunciado,
                "Quiz de Programação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icon,
                opcoes,
                opcoes[0]);
    }

    @Override
    public int capturarResposta() {
        if (ultimaRespostaCapturada == JOptionPane.CLOSED_OPTION){
            System.exit(0);
        }
        return ultimaRespostaCapturada;
    }

    @Override
    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Feedback", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void exibirResultadoFinal(ResultadoFinal resultado) {
        String relatorio = "FIM DO QUIZ!\n\n" +
                           "Acertos: " + resultado.getAcertos() + "\n" +
                           "Erros: " + resultado.getErros() + "\n" +
                           "Pontuação Final: " + resultado.getPontuacaoFinal();
                           
        JOptionPane.showMessageDialog(null, relatorio, "Resultado Final", JOptionPane.WARNING_MESSAGE);
    }
}
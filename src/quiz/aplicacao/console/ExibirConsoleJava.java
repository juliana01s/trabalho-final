package quiz.aplicacao.console;

import java.util.List;
import java.util.Scanner;
import quiz.framework.Alternativa;
import quiz.framework.ExibirInterface;
import quiz.framework.ResultadoFinal;

public class ExibirConsoleJava implements ExibirInterface {
    
    private Scanner scanner = new Scanner(System.in);
    private int ultimaRespostaLida = -1;

    @Override
    public void exibirPergunta(String enunciado, List<Alternativa> alternativas) {
        System.out.println("\n--------------------------------------------------");
        System.out.println("QUESTÃO KPOP: " + enunciado);
        System.out.println("--------------------------------------------------");
        
        for(int i = 0; i < alternativas.size(); i++) {
            System.out.println((i + 1) + ") " + alternativas.get(i).getTexto());
        }
        
        System.out.print("\nDigite o número da sua resposta: ");
        
        if(scanner.hasNextInt()) {
            int escolhaUsuario = scanner.nextInt();
            ultimaRespostaLida = escolhaUsuario - 1; 
        } 
        else {
            ultimaRespostaLida = -1;
            scanner.next(); 
        }
    }

    @Override
    public int capturarResposta() {
        return ultimaRespostaLida;
    }

    @Override
    public void exibirMensagem(String mensagem) {
        System.out.println("[Feedback]: " + mensagem);
    }

    @Override
    public void exibirResultadoFinal(ResultadoFinal resultado) {
        System.out.println("\n================================================");
        System.out.println("          FIM DO QUIZ DE JAVA (CONSOLE)          ");
        System.out.println("================================================");
        System.out.println("Acertos: " + resultado.getAcertos());
        System.out.println("Erros: " + resultado.getErros());
        System.out.println("Pontuação Final: " + resultado.getPontuacaoFinal() + " pts");
        System.out.println("================================================");
    }
}
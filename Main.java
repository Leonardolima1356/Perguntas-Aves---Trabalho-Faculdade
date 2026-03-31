import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArvoreDeDecisao arvore = new ArvoreDeDecisao();
        Nodo atual = arvore.getRaiz();
        
        System.out.println("=== JOGO DESCUBRA A AVE ===");
        System.out.println("Pense em uma das 16 aves (A até P) da imagem.");
        System.out.println("Vou fazer perguntas e você deve responder com 's' (sim) ou 'n' (não).");
        System.out.println("---------------------------------------------------");

        while (atual != null) {
            
            if (atual.isRespostaFinal()) {
                System.out.println("\n=> A ave que você escolheu é a: " + atual.getTexto() + "!");
                break;
            }

            System.out.print(atual.getTexto() + " (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (resposta.equals("s")) {
                atual = atual.getSim(); 
            } else if (resposta.equals("n")) {
                atual = atual.getNao(); 
            } else {
                System.out.println("Por favor, responda apenas com 's' ou 'n'.");
            }
        }
        
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilhaMagiasHabilidades<MagicCard> pilha = new PilhaMagiasHabilidades<MagicCard>();
        Scanner input = new Scanner(System.in);

        System.out.println("BEM-VINDO AO MAGIC: THE GATHERING");
        System.out.println("1 - Criar Carta ");
        System.out.println("2 - Excluir carta");
        System.out.println("3 - Mostrar cartas");
        System.out.println("4 - Excluir carta especifica");
        System.out.println("5 - SAIR");
        System.out.println("DIGITE A OPÇÃO QUE DESEJA:");
        int opcao = input.nextInt();

        while (opcao != 0){
            if (opcao == 1){
                System.out.println("Quantas cartas deseja cadastrar ?");
                int qtdCartas = input.nextInt();

                criarCartas(qtdCartas);

            }else if (opcao == 2){
                pilha.pop();
                System.out.println("CARTA EXCLUIDA ...");

            }else if (opcao == 3){
                printPilha(pilha);

            }else if (opcao == 4){
                System.out.println("DIGITE A CARTA QUE DESEJA EXCLUIR:");
                
                
            }else if (opcao == 5){
                System.out.println("OBRIGADO POR UTILIZAR MEU PROGRAMA !!!");
                break;
            }


        }

        input.close();
    }

    public static void criarCartas(int qtdCartas) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<qtdCartas; i++){
            System.out.println("DIGITE O NOME DA CARTA:");
            String nome = input.nextLine();

            System.out.println("DIGITE O CUSTO DA CARTA:");
            int custo = input.nextInt();

            System.out.println("DIGITE O DESCRICAO DA CARTA:");
            String descricao = input.nextLine();

            System.out.println("DIGITE O TIPO DA CARTA:");
            String tipo = input.nextLine();


        }
        System.out.println("VOCÊ CRIOU SUAS CARTAS");
        input.close();
    }

    public static void printPilha(PilhaMagiasHabilidades<MagicCard> pilha) {
        while(!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }

    public static void removerEspecificoPilha(MagicCard carta, PilhaMagiasHabilidades<MagicCard> pilha) {
        pilha.removeAt(carta);
    }

    
}

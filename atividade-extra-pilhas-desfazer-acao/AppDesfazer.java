import java.util.Scanner;

public class AppDesfazer {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner input = new Scanner(System.in);

        menu();
        int opcao = input.nextInt();

        while (opcao != 0) {
            if (opcao == 1) {
                System.out.println("DIGITE O NÚMERO QUE DESEJA INSERIR:");
                int numeroInserir = input.nextInt();

                pilha.push(numeroInserir);
                
            } else if (opcao == 2) {
                System.out.println("QUANTAS VEZES DESEJA DESFAZER (até 16 vezes): ");
                int qtdVezesDesfazer = input.nextInt();
                
                if (pilha.isEmpty()) {
                    throw new RuntimeException("PILHA VAZIA ....");
                } else {
                    for (int i = 0; i < qtdVezesDesfazer; i++) {
                        pilha.pop();
                    }
                }
                
                
            } else if (opcao == 3) {
                System.out.println("");
                System.out.println("<PILHA ATUAL>");
                printarPilha(pilha);

            } else if (opcao == 4) {
                pilha.pop();
                System.out.println("NUMERO REMOVIDO");

            } else if (opcao == 5) {
                System.out.println("OBRIGADO POR UTILIZAR MEU PROGRAMA !!!");
                break;
            }
            menu();
            opcao = input.nextInt();
        }

    }

    public static void menu() {
        System.out.println("<BEM VINDO AO PROGRAMA DE CTRL + Z>");
        System.out.println("1 - Adicionar número");
        System.out.println("2 - Desfazer ultima ação (PODE SER ATÉ 16 VEZES)");
        System.out.println("3 - Mostrar pilha");
        System.out.println("4 - Remover número");
        System.out.println("5 - Sair"); 
        System.out.println("SELECIONE A OPÇÃO DESEJADA :");
    }

    public static void printarPilha(Pilha pilha) {
        for (int i = pilha.tamanho() - 1; i >= 0; i--) {
            System.out.println(pilha.pegarPosicao(i));
        }   
    }

}

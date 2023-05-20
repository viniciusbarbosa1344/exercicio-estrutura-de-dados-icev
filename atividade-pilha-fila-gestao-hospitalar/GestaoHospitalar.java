import java.util.Scanner;

public class GestaoHospitalar {
    Scanner input = new Scanner(System.in);
    Fila<String> pNormal = new Fila<String>();
    Fila<String> pLeve = new Fila<String>();
    Fila<String> pModerado = new Fila<String>();
    Fila<String> pSevero = new Fila<String>();
    Fila<String> filaPrincipalPrioridade = new Fila<String>();

    public void adicionarPaciente() {

        System.out.println("DIGITE O NOME DO PACIENTE:");
        String nome = input.next();

        System.out.println("ESCOLHA O ESTADO DO PACIENTE");
        System.out.println("{0 - NORMAL | 1 - LEVE | 2 - MODERADO | 3 - SEVERO}");
        int estadoPaciente = input.nextInt();

        if (estadoPaciente == 0) {
            pNormal.enqueue(nome);

        } else if (estadoPaciente == 1) {
            pLeve.enqueue(nome);

        } else if (estadoPaciente == 2) {
            pModerado.enqueue(nome);
                
        } else if (estadoPaciente == 3) {
            pSevero.enqueue(nome);
        }
        
    }

    public void removerPacienteFilaEspecifica() {
        System.out.println("<< VOCÊ ESTÁ PRESTES A REMOVER O PRIMEIRO PACIENTE DA FILA REQUISITADA >>");
        System.out.println("DE QUAL FILA DESEJA REMOVER O PACIENTE ");
        System.out.println("{0 - NORMAL | 1 - LEVE | 2 - MODERADO | 3 - SEVERO}");
        int escolhaRemocao = input.nextInt();

        if (escolhaRemocao == 0) {
            pNormal.dequeue();

        } else if (escolhaRemocao == 1) {
            pLeve.dequeue();

        } else if (escolhaRemocao == 2) {
            pModerado.dequeue();
                
        } else if (escolhaRemocao == 3) {
            pSevero.dequeue();
            
        }
    }

    public void printarFilas() {

        System.out.println("{0 - NORMAL | 1 - LEVE | 2 - MODERADO | 3 - SEVERO}");
        System.out.println("SELECIONE QUAL FILA DESEJA MOSTRAR:");
        int filaSelecionada = input.nextInt();

        if (filaSelecionada == 0) {
            System.out.println(" ");
            System.out.println("<<<< FILA PACIENTES NORMAL >>>>");
            for (int i = 0; i < pNormal.size(); i++) {
                System.out.println(pNormal.pegarPosicao(i));
            }

        } else if (filaSelecionada == 1) {
            System.out.println(" ");
            System.out.println("<<<< FILA PACIENTES LEVE >>>>");
            for (int i = 0; i < pLeve.size(); i++) {
                System.out.println(pLeve.pegarPosicao(i));
            }

        } else if (filaSelecionada == 2) {
            System.out.println(" ");
            System.out.println("<<<< FILA PACIENTES MODERADO >>>>");
            for (int i = 0; i < pModerado.size(); i++) {
                System.out.println(pModerado.pegarPosicao(i));
            }
                
        } else if (filaSelecionada == 3) {
            System.out.println(" ");
            System.out.println("<<<< FILA PACIENTES SEVERO >>>>");
            for (int i = 0; i < pSevero.size(); i++) {
                System.out.println(pSevero.pegarPosicao(i));
            }

        }

    }

    public void chamarParaAtendimento() {
        
    }

    public static void menu() {
        System.out.println(" ");
        System.out.println("<BEM-VINDO AO NOSSO SISTEMA HOSPITALAR>");
        System.out.println("1 - Adicionar Paciente");
        System.out.println("2 - Mostrar Fila Desejada");
        System.out.println("3 - Remover Paciente");
        System.out.println("4 - Sair");
        System.out.println(">> SELECIONE A OPÇÃO DESEJADA:");
    }
}

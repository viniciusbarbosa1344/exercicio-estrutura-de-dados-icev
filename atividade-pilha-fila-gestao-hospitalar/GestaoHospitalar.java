import java.util.Scanner;
import java.util.Arrays;

public class GestaoHospitalar {
    Scanner input = new Scanner(System.in);
    Fila pacienteNormal = new Fila();
    Fila pacienteLeve = new Fila();
    Fila pacienteModerado = new Fila();
    Fila pacienteSevero = new Fila();

    Fila filaPrincipalPrioridade = new Fila();

    public void adicionarPaciente() {

        System.out.println("DIGITE O NOME DO PACIENTE:");
        String nome = input.next();

        System.out.println("DIGITE O CPF DO PACIENTE:");
        String cpf = input.next();

        System.out.println("ESCOLHA O ESTADO DO PACIENTE");
        System.out.println("{0 - NORMAL | 1 - LEVE | 2 - MODERADO | 3 - SEVERO}");
        int estadoPaciente = input.nextInt();

        if (estadoPaciente == 0) {
            pacienteNormal.enqueue("Nome:" + nome + " // CPF:" + cpf);

        } else if (estadoPaciente == 1) {
            pacienteLeve.enqueue("Nome:" + nome + " // CPF:" + cpf);

        } else if (estadoPaciente == 2) {
            pacienteModerado.enqueue("Nome:" + nome + " // CPF:" + cpf);
                
        } else if (estadoPaciente == 3) {
            pacienteSevero.enqueue("Nome:" + nome + " // CPF:" + cpf);
        }
        
    }

    public void removerPacienteFilaEspecifica() {
        System.out.println("<< VOCÊ ESTÁ PRESTES A REMOVER O PRIMEIRO PACIENTE DA FILA REQUISITADA >>");
        System.out.println("DE QUAL FILA DESEJA REMOVER O PACIENTE ");
        System.out.println("{0 - NORMAL | 1 - LEVE | 2 - MODERADO | 3 - SEVERO}");
        int escolhaRemocao = input.nextInt();

        if (escolhaRemocao == 0) {
            pacienteNormal.dequeue();

        } else if (escolhaRemocao == 1) {
            pacienteLeve.dequeue();

        } else if (escolhaRemocao == 2) {
            pacienteModerado.dequeue();
                
        } else if (escolhaRemocao == 3) {
            pacienteSevero.dequeue();
            
        }
    }
    
    public void chamarParaAtendimento() { 
        
        // Ainda em desenvolvimento (tentar postar até dia 23/05)
        
    }
    
    public void printarFilas() {

        System.out.println("{0 - NORMAL | 1 - LEVE | 2 - MODERADO | 3 - SEVERO}");
        System.out.println("SELECIONE QUAL FILA DESEJA MOSTRAR:");
        int filaSelecionada = input.nextInt();

        if (filaSelecionada == 0) {
            System.out.println(" ");
            System.out.println("<<<< FILA PACIENTES NORMAL >>>>");
            for (int i = 0; i < pacienteNormal.size(); i++) {
                System.out.println(pacienteNormal.pegarPosicao(i));
            }

        } else if (filaSelecionada == 1) {
            System.out.println(" ");
            System.out.println("<<<< FILA PACIENTES LEVE >>>>");
            for (int i = 0; i < pacienteLeve.size(); i++) {
                System.out.println(pacienteLeve.pegarPosicao(i));
            }

        } else if (filaSelecionada == 2) {
            System.out.println(" ");
            System.out.println("<<<< FILA PACIENTES MODERADO >>>>");
            for (int i = 0; i < pacienteModerado.size(); i++) {
                System.out.println(pacienteModerado.pegarPosicao(i));
            }
                
        } else if (filaSelecionada == 3) {
            System.out.println(" ");
            System.out.println("<<<< FILA PACIENTES SEVERO >>>>");
            for (int i = 0; i < pacienteSevero.size(); i++) {
                System.out.println(pacienteSevero.pegarPosicao(i));
            }

        }

    }

    public static void menu() {
        System.out.println(" ");
        System.out.println("<BEM-VINDO AO NOSSO SISTEMA HOSPITALAR>");
        System.out.println("1 - Adicionar Paciente");
        System.out.println("2 - Mostrar Fila Desejada");
        System.out.println("3 - Remover Paciente");
        System.out.println("4 - Chamar Paciente");
        System.out.println("5 - Sair");
        System.out.println(">> SELECIONE A OPÇÃO DESEJADA:");
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("<BEM VINDO AO SISTEMA DE CADASTRO DE NOTAS>");
            System.out.println("DIGITE QUANTAS NOTAS DESEJA CADASTRAR:");
            double qtdNotas = input.nextInt();
            
            analisarEprintarNotas(qtdNotas);

        } catch (InputMismatchException nota) {
            System.out.println("+---------------------------------------------------------------+");
            System.out.println("| NOTA DIGITADA DE MANEIRA ERRADA                               |");
            System.out.println("| EXEMPLO DE COMO A NOTA DEVE SER ESCRITA --> 9,5 (com virgula) |");
            System.out.println("| RODE NOVAMENTE O PROGRAMA                                     |");
            System.out.println("+---------------------------------------------------------------+");
        } 

        input.close();
    }

    public static void analisarEprintarNotas(Double qtd) {
        Scanner input = new Scanner(System.in);
        Pilha<Double> pilha = new Pilha<Double>();
        Pilha<Double> pilhaInversa = new Pilha<Double>();

        for (int i = 0; i < qtd; i++) {
            System.out.println("DIGITE A NOTA: ");
            Double nota = input.nextDouble();
            pilha.push(nota);

            while (pilha.isEmpty() == false) {
                pilha.top();
                pilhaInversa.push(pilha.pop());
            }
            
            if (nota > 10 || nota < 0) {
                System.out.println("|--DIGITE UMA NOTA VALIDA--|");
                i--;
            } 
            
            
        }

        System.out.println("<NOTAS EM ORDEM CRONOLOGICA INVERSA>");
        for (int j = 0; j < pilhaInversa.size(); j++) {
            System.out.println(pilhaInversa.posicao(j));
        }

        input.close();
    }

}

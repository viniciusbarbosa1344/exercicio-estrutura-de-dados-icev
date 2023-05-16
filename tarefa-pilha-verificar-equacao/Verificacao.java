import java.util.Scanner;


public class Verificacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("<BEM-VINDO AO PROGRAMA DE ANALISE DE EQUAÇÕES>");
        System.out.println(" 1 - ANALISAR EQUAÇÃO");
        System.out.println(" 2 - SAIR");
        System.out.println("> DIGITE A OPÇÃO DESEJADA:");
        int escolha = input.nextInt();

        while(escolha != 2){
            if (escolha == 1){
                System.out.println("DIGITE A EXPRESSÃO DESEJADA:");
                String choice = input.nextLine();
                
                validarParentesesNumeros(choice);

            } else {
                System.out.println("<OBRIGADO POR USA MEU PROGRAMA !!>");
                break;
            }
            
        }
    }

    public static void validarParentesesNumeros(String expressao) {
        Pilha pilha = new Pilha();

        int nParentesesAbertos = 0;
        int nParentesesFechados = 0;

        for (int i = 0; i < expressao.length(); i++) {
            char character = expressao.charAt(i);
            pilha.push(character);

            if (character == '(' || character == '[' || character == '{' ) {
                pilha.push(character);
                nParentesesAbertos++;
            } else if (character == ')' || character == ']' || character == '}') {
                if (pilha.isEmpty()) {
                    System.out.println("PILHA ESTÁ VAZIA ....");
                } else {
                    pilha.push(character);
                    nParentesesFechados++;
                }
            }
        }  

        for (int j = 0; j < expressao.length(); j++) {
            char character = expressao.charAt(j);
            pilha.push(character);
            
            if (character == '+'|| character == '-'|| character == '/'|| character == '*') {
                if (j == expressao.length() - 1) {
                    System.out.println("A EXPRESSÃO ESTÁ ERRADA, SINAL SOZINHO");
                } else if (j != expressao.length()-1 && nParentesesAbertos == nParentesesFechados){
                    System.out.println("A EXPRESSÃO ESTÁ CORRETA");
                    continue;
                } else {
                    pilha.push(character);
                }
            } else {
                pilha.push(character);
            }
        }

        
        if (nParentesesAbertos == nParentesesFechados && nParentesesAbertos > 0 && nParentesesFechados > 0) {
            System.out.println("A EXPRESSÃO ESTÁ CORRETA");
        } else if (nParentesesAbertos != nParentesesFechados){
            System.out.println("A EXPRESSÃO ESTÁ ERRADA, PARENTESES ABERTOS");
        } 

    }  
}
 

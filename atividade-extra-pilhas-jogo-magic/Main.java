import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {
    public static void main(String[] args) {
        PilhaMagiasHabilidades pilha = new PilhaMagiasHabilidades();
        Scanner input = new Scanner(System.in);

        // Testando o metodo push (FUNCIONA !!)
        MagicCard carta01 = new MagicCard("Bola de Fogo", 20, "Lança uma bola de fogo nos inimigos", TipoCarta.FEITIÇO);
        pilha.push(carta01);

        MagicCard carta02 = new MagicCard("Lança de Gelo", 30, "Joga uma lança de gelo nos inimigos", TipoCarta.INSTANTÂNEA);
        pilha.push(carta02);

        MagicCard carta03 = new MagicCard("Provocar", 5, "Inimigos provocados so atacam a carta que usou a habilidade", TipoCarta.HABILIDADE_ATIVADA);
        pilha.push(carta03);

        MagicCard carta04 = new MagicCard("Chamado do Sol", 40, "Buffa o ataque e defesa dos aliados por 3 turnos", TipoCarta.ENCANTAMENTO);
        pilha.push(carta04);

        MagicCard carta05 = new MagicCard("Steath Necklace", 10, "Diminue a chance de ser percebido por inimigos", TipoCarta.ARTEFATO);
        pilha.push(carta05);

        // Testando o metodo de remover na posição e o de exibir as cartas (FUNCIONA !!)
        pilha.removeAt(carta02);

        //Testando o metodo de remover uma carta usando pop()
        pilha.pop();
        
        // Testando o metodo de exibir cartas (se desejar ver a lista completa, basta pegar o 'while' e colocar antes dos pilha.removeAt)
        while(!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
        
        // Tentando aplicar os enums de tipo de carta
        
        // o terreno, criatura, encantamento, artefato, planeswalker ou feitiço
    }

    
}

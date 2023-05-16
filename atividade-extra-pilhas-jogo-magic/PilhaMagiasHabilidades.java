import java.util.ArrayList;

public class PilhaMagiasHabilidades {
    private ArrayList<MagicCard> pilha = new ArrayList<MagicCard>();

    public void push(MagicCard MagiaHbilidade){
        pilha.add(MagiaHbilidade);
    }        

    public MagicCard pop() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        return pilha.remove(pilha.size()-1);
    }

    public MagicCard top() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        return pilha.get(pilha.size()-1);
    }

    public boolean isEmpty(){
        return pilha.isEmpty();
    }

    public void limpar() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        pilha.clear();
    }

    public int size(){
        return pilha.size();
    }

    public void removeAt(MagicCard carta) {
        pilha.remove(carta);
    }
    
}
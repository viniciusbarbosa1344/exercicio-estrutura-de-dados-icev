import java.util.ArrayList;

public class PilhaMagiasHabilidades<T> {
    private ArrayList<T> pilha = new ArrayList<T>();

    public void push(T MagiaHbilidade){
        pilha.add(MagiaHbilidade);
    }        

    public T pop() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        return pilha.remove(pilha.size()-1);
    }

    public T top() {
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

    public void removeAt(T carta) {
        pilha.remove(carta);
    }
    
}
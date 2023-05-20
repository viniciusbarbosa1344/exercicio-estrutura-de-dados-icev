import java.util.ArrayList;


public class Pilha<T> {
    private ArrayList<Double> pilha = new ArrayList<Double>();

    public void push(Double valor){
        pilha.add(valor);
    }
    
    public Double pop() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        return pilha.remove(pilha.size()-1);
    }

    public Double top() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        return pilha.get(pilha.size()-1);
    }

    public int size(){
        return pilha.size();
    }

    public boolean isEmpty(){
        return pilha.isEmpty();
    }

    public Double posicao(int posicao) {
        return pilha.get(posicao);
    }

} 
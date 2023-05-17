import java.util.ArrayList;

public class Pilha {
    private ArrayList<Integer> pilha = new ArrayList<Integer>();

    public void push(int informacao){
        pilha.add(informacao);
    }        

    public int pop() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        return pilha.remove(pilha.size()-1);
    }

    public int top() {
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

    public int tamanho(){
        return pilha.size();
    }

    public int pegarPosicao(int posicao) {
        return pilha.get(posicao);
    }

}

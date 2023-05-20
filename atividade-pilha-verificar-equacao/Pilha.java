import java.util.ArrayList;

public class Pilha {
    private ArrayList<Character> pilha = new ArrayList<Character>();

    public void push(Character value) {
        pilha.add(value);
    }

    public double pop() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        return pilha.get(pilha.size()-1);
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    public double size() {
        return pilha.size();
    }

    public Character top() {
        if (pilha.isEmpty()) {
            throw new RuntimeException("PILHA VAZIA ...");
        }
        return pilha.get(pilha.size() - 1);
    }
    
}
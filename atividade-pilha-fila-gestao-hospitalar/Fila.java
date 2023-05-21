import java.util.ArrayList;

public class Fila {
    ArrayList<String> fila = new ArrayList<String>();

    public void enqueue(String nome) {
        fila.add(nome);
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila.remove(0);
    }

    public String front() {
        if (fila.isEmpty()) {
            throw new RuntimeException("A fila está vazia.");
        }
        return fila.get(0);
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }

    public String pegarPosicao(int posicao) {
        return fila.get(posicao);
    }

}

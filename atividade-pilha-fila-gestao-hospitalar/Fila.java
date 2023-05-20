import java.util.ArrayList;

public class Fila<T> {
    ArrayList<T> fila = new ArrayList<T>();

    public void enqueue(T nome) {
        fila.add(nome);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila.remove(0);
    }

    public T front() {
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

    public T pegarPosicao(int posicao) {
        return fila.get(posicao);
    }
}

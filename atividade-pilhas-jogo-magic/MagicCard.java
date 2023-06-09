public class MagicCard {
    private String nome;
    private int custo;
    private String efeito;
    private String tipo;

    public MagicCard(String nome, int custo, String efeito, String tipo) {
        this.nome = nome;
        this.custo = custo;
        this.efeito = efeito;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCusto() {
        return custo;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getEfeito() {
        return efeito;
    }
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "CARTA [Nome=" + nome + ", Custo=" + custo + ", Efeito=" + efeito + ", Tipo=" + tipo + "]";
    }
    
}

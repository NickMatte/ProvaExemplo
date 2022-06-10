public class Produto {

    private int codigo;
    private String marca;
    private double preco;
    private TipoProduto tp;

    public Produto() {
    }

    public Produto(int codigo, String marca, double preco, TipoProduto tp) {
        this.codigo = codigo;
        this.marca = marca;
        this.preco = preco;
        this.tp = tp;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoProduto getTp() {
        return tp;
    }

    public void setTp(TipoProduto tp) {
        this.tp = tp;
    }
    @Override
    public String toString() {
        return this.getCodigo() + " " + this.getMarca() + " " + this.getPreco() + " " + this.getTp() + " ";
    }

}

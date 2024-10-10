public class ProdutoEletronico extends Produto {
    private double descontoFixo;

    public ProdutoEletronico(String nome, double preco, double descontoFixo) {
        this.nome = nome;
        this.preco = preco;
        this.descontoFixo = descontoFixo;
    }

    public double calcularDesconto(double porcentagem) {
        double descontoPercentual = preco * (porcentagem / 100);
        return preco - descontoPercentual - descontoFixo;
    }

}

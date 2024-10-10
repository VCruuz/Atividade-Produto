public class ProdutoFisico extends Produto {
    private String categoria;

    public ProdutoFisico(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public double calcularDesconto(double porcentagem) {
        double descontoPercentual = preco * (porcentagem / 100);
        
        if ("inverno".equalsIgnoreCase(categoria)) {
            descontoPercentual += preco * 0.05; 
        }
        
        return preco - descontoPercentual;
    }
}

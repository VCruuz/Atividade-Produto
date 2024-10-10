import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtosDisponiveis;

    public Estoque() {
        this.produtosDisponiveis = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtosDisponiveis.add(produto);
    }

    public boolean removerProduto(Produto produto) {
        return produtosDisponiveis.remove(produto);
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtosDisponiveis) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println("Produto: " + produto.nome + ", Preço após desconto: " + precoComDesconto);
        }
    }
}

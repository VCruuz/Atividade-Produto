public class Main {
    public static void main(String[] args) {
        
        Estoque estoque = new Estoque();

        Produto produto1 = new ProdutoEletronico("Smartphone", 1500, 100);
        Produto produto2 = new ProdutoFisico("Jaqueta", 300, "inverno");
        Produto produto3 = new ProdutoFisico("Camiseta", 100, "verão");

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);

        System.out.println("Preços com desconto de 20%:");
        estoque.exibirPrecosComDesconto(20); 
    }
}

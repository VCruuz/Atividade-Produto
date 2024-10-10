public class Produto {
    protected String nome;
    protected double preco;

    public double calcularDesconto(double porcentagem) {
        double desconto = preco * (porcentagem / 100);
        return preco - desconto;
    }
}

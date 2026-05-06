public class TestaSupermercado {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Arroz", 2);
        Produto p2 = new Produto(2, "Feijão", 2);
        Produto p3 = new Produto(3, "Macarrão", 2);

        Cliente cliente = new Cliente(1, "João");

        Venda venda = new Venda(1, cliente);

        venda.adicionarItem(1, 2, p1);
        venda.adicionarItem(2, 1, p2);
        venda.adicionarItem(3, 3, p3);
        venda.listarItens();

        System.out.println("\nProdutos ainda existem:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

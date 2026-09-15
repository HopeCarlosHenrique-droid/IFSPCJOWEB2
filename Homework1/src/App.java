public class App {
    public static void main(String[] args) {
       
        Produto produto = new Produto(101, "Produto X", 55.90);
        
        produto.setPreco(55.9);
        
        produto.setNome("Produto X");
        produto.setPreco(81.5);

        System.out.println("Código: " + produto.getCodigo());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

    }
}

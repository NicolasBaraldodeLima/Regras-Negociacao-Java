package academy.devdojo.maratonajava;

public class RegrasdeNegociacao {

   public boolean verificarValorTotal(double valorTotal) {
       return valorTotal > 100;
   }

    public static void main(String[] args) {
        RegrasdeNegociacao regrasdeNegociacao = new RegrasdeNegociacao();

        double valorPedido = 120.0;

        if (regrasdeNegociacao.verificarValorTotal(valorPedido)) {
            System.out.println("Pedido aceito. Valor total está dentro das regras  de negócio");

        } else {
            System.out.println("Pedido  rejeitado. Valor total abaixo do permitido.");
        }
    }
}

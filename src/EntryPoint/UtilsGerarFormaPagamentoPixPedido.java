package EntryPoint;

import java.util.List;

public class UtilsGerarFormaPagamentoPixPedido {

    public static String gerarProcessamento(FormaPagamento e, List<Produto> pedidoLista){
        switch (e){
            case PIX -> {
                StringBuilder sb = new StringBuilder();
                double valorPedido = 0;
                for(var v : pedidoLista){
                    valorPedido += v.getPreco();
                }
                sb.append("pagamento realizado via PIX");
                sb.append("\n");
                sb.append("valor do pedido: " + valorPedido);
                return sb.toString();
            }
            default -> throw new RuntimeException("erro");
        }
    }

}

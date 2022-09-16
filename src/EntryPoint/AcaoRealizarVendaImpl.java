package EntryPoint;

import java.util.List;

public class AcaoRealizarVendaImpl implements AcaoRealizarVenda{


    @Override
    public String calcularPedidoPagamentoPix(FormaPagamento form, List<Produto> produtos) {
        return UtilsGerarFormaPagamentoPixPedido.gerarProcessamento(form, produtos);
    }
}

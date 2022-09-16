package EntryPoint;

import java.util.List;

public interface AcaoRealizarVenda {

    String calcularPedidoPagamentoPix(FormaPagamento form, List<Produto> produtos);

}

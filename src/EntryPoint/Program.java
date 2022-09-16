package EntryPoint;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        AcaoRealizarVendaImpl impl = new AcaoRealizarVendaImpl();
        Produto p1 = new Produto(1,"macbook","macbook m2 pro",5000.00);
        Produto p2 = new Produto(2, "asus rog","computador gamer",7000.00);
        List<Produto> lista_produtos = List.of(p1,p2);
        System.out.println(impl.calcularPedidoPagamentoPix(FormaPagamento.PIX,lista_produtos));

    }

}

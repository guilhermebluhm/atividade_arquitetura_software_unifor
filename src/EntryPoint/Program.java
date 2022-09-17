package EntryPoint;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        /*
        Implementei a lógica de divisão de papeis um pouco fora da proposta sugerida
        pois na minha visão prof. quando introduzimos o controlador no nosso código
        e importante a distinção clara entre as responsabilidades de negócio, dominio
        e interfaces, dai não me pareceu minho coerente a separação em produto, itemVenda e Venda,
        pois se poderia definir o model(que e o modelo de dominio do problema) dado pelo produto
        e distribuindo via controlador para via a interface de processar a logica de negócio esperada
        dessa forma via a classe utilitária implementada através da composição baixar o acoplamento sendo
        assim a forma de pagamento a "cola" sobre que ação tomar no código, pois tomei essa decisão pensando
        que quando já estamos lidando com componentes arquiteturais tentei introduzir a ideia do clean architecture.
         */

        AcaoRealizarVendaImpl impl = new AcaoRealizarVendaImpl();
        Produto p1 = new Produto(1,"macbook","macbook m2 pro",5000.00);
        Produto p2 = new Produto(2, "asus rog","computador gamer",7000.00);
        List<Produto> lista_produtos = List.of(p1,p2);
        System.out.println(impl.calcularPedidoPagamentoPix(FormaPagamento.PIX,lista_produtos));

    }

}

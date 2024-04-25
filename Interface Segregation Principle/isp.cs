public interface IPedido
{
    void Compra();
    void ProcessarCartaoCredito();
}
public class PedidoOnline : IPedido
{
    public void Compra()
    {
        //código da compra
    }
    public void ProcessarCartaoCredito()
    {
        //processo do cartão
    }
}
public class PedidoPresencial : IPedido
{
    public void Compra()
    {
        //código da compra
    }
    public void ProcessarCartaoCredito()
    {
        //Não precisa para boleto
        throw new NotImplementedException();
    }
}

---------------------



class ISP
{
    public interface IPedido
    {
        void Compra();
    }
    public interface IPagamentoCartao
    {
        void ProcessarCartaoCredito();
    }
    public class PedidoOnline : IPedido, IPagamentoCartao
    {
        public void Compra()
        {
            //compra
        }
        public void ProcessarCartaoCredito()
        {
            //processa cartão
        }
    }
    public class PedidoPresencial : IPedido
    {
        public void Compra()
        {
             //compra
        }
    }
}


// O princípio da segregação da interface tem como objetivo manter um sistema dissociado e, portanto, mais fácil de refatorar, alterar e reimplementar. Este princípio afirma que os clientes não devem ser forçados a depender das interfaces que eles não usam.
// Neste código temos a interface IPedido sendo implementada pelas classes PedidoOnline e PedidoPresencial. Mas este código esta violando o princípio ISP pois a interface IPedido esta sendo implementada pela classe PedidoPresencial mas esta classe não esta implementando o método ProcessarCartaoCredito. Assim a classe esta sendo forçada a depender do método ProcessarCartaoCredito que ela não precisa usar.
// No código abaixo adequado ao princípio ISP, se tem interfaces específicas IPedido e IPagamentoCartao, e, nenhuma classe esta sendo obrigada a implementa um método que não utiliza.
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



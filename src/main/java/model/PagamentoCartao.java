package model;

public class PagamentoCartao extends Pagamento
{	
	public PagamentoCartao(int idPagamento, double valor, String forma) 
	{
		super(idPagamento, valor, forma);
	}

	@Override
	public void Pagar(double valor, String forma) 
	{
		efetuarPagamento();		
	}
	
}

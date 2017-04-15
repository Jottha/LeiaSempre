package model;

public class PagamentoBoleto extends Pagamento 
{
	public PagamentoBoleto(int idPagamento, double valor, String forma) 
	{
		super(idPagamento, valor, forma);
	}

	@Override
	public void Pagar(double valor, String forma) 
	{
		efetuarPagamento();		
	}
	
	
	
}

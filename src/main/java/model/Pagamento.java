package model;

public abstract class Pagamento 
{	
	private int idPagamento;
	private double valor;
	private String forma;
	public abstract void Pagar(double valor, String forma);
	
	public Pagamento(int idPagamento, double valor, String forma) 
	{	this.idPagamento = idPagamento;
		this.valor = valor;
		this.forma = forma;
	}
	
	public void efetuarPagamento()
	{	if(forma.equals("boleto"))
		{ 	return;	
		}
		if(forma.equals("cartao"))
		{ 	return;	
		}
	}
	public int getIdPagamento()
	{
		return idPagamento;
	}

	public double getValor() 
	{
		return valor;
	}

	public void setValor(double valor) 
	{
		this.valor = valor;
	}
	public String getForma()
	{
		return forma;
	}
	
	public void setForma(String forma)
	{
		this.forma = forma;
	}
}

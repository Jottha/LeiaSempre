package model;

public class LeitorClasseB extends Pagamento implements ILeitorClasseB
{	
	private int idLeitorB;
	private String nome;
	private String CPF;
	private String situacao;
		
	public LeitorClasseB(int idPagamento, double valor, String forma) 
	{	
		super(idPagamento, valor, forma);
	}

	@Override
	public void Pagar(double valor, String forma)
	{
		efetuarPagamento();		
	}

	public int getIdLeitorB() 
	{
		return idLeitorB;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCPF() 
	{
		return CPF;
	}

	public void setCPF(String cPF)
	{
		CPF = cPF;
	}

	public String getSituacao() 
	{
		return situacao;
	}

	public void setSituacao(String situacao) 
	{
		this.situacao = situacao;
	}

	
}

package model;

public class LeitorClasseA extends Pagamento implements ILeitorClasseA
{	
	private int idLeitorA;
	private String nome;
	private String CPF;
	private String situacao;
		
	public LeitorClasseA(int idPagamento, double valor, String forma) 
	{
		super(idPagamento, valor, forma);
	}
	
	@Override
	public void Pagar(double valor, String forma) 
	{	
		efetuarPagamento();
	}
		
	public int getIdLeitorA() 
	{
		return idLeitorA;
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

	public void setCPF(String cPF) {
		CPF = cPF;
		//alterar
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

package model;

public class LeitorClasseC extends Pagamento implements ILeitorClasseC
{
	private int idLeitorC;
	private String nome;
	private String CPF;
	private String situacao;
	
	public LeitorClasseC(int idPagamento, double valor, String forma, 
							int idLeitorC, String nome, String CPF, String situacao)
	{
		super(idPagamento, valor, forma);
		this.idLeitorC = idLeitorC;
		this.nome = nome;
		this.CPF = CPF;
		this.situacao = situacao;
	}
	
	@Override
	public void Pagar(double valor, String forma)
	{	
		efetuarPagamento();
	}

	public int getIdLeitorC() 
	{
		return idLeitorC;
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

	public void setCPF(String cpf) 
	{
		CPF = cpf;
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

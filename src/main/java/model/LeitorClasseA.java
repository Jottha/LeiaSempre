package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "leitorClasseA")
public class LeitorClasseA extends Pagamento implements ILeitorClasseA
{	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idLeitorA;
	@Column
	private String nome;
	@Column
	private String CPF;
	@Column
	private String situacao;
		
	public LeitorClasseA(int idPagamento, double valor, String forma, 
							int idLeitorA, String nome, String CPF, String situacao) 
	{
		super(idPagamento, valor, forma);
		this.idLeitorA = idLeitorA;
		this.nome = nome;
		this.CPF = CPF;
		this.situacao = situacao;
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

	public void setCPF(String cpf) 
	{
		CPF = cpf;
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
